package exer;

/**
 * @Author liming
 * @Date 2022/5/30 22:37
 **/

/**
 * 使用二维数组打印一个 10 行杨辉三角。

【提示】
 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 2. 每一行的第一个元素和最后一个元素都是 1
 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]; ——注：这个规律只适用于【非首末】元素
 *
 */
public class YangHuiTriangeTest {
    public static void main(String[] args) {
        //1.声明并初始化二维数组
        int[][] yangHui = new int[10][];  //每行的个数(列)不一样，所以不能写
        //2.给数组的元素赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i+1];
            //2.1给首末元素赋值
            yangHui[i][0] = 1;
            yangHui[i][i] = 1;
            //2.2 给每行的非首末元素赋值
//            if(i > 1){    //这个判断可以去掉！
                //第3行才有非0
            for(int j = 1; j < yangHui[i].length - 1; j++){
                //第2列，从第2个元素开始，到倒数第2个元素结束
                yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];
            }
//            }
        }
        //3.遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for(int j = 0; j < yangHui[i].length; j++){
                System.out.print(yangHui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
