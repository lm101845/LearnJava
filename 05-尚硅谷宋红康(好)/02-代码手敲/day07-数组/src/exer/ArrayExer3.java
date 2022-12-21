package exer;

/**
 * @Author liming
 * @Date 2022/5/31 12:13
 **/

/**
 *  面试题：创建一个长度为6的int型数组，要求取值为1-30，同时元素各不相同
 *  方法2：这个就很好理解了
 */
public class ArrayExer3 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30 + 1);
            System.out.println("没有去重前的数组" + arr[i]);
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("去重后的数组" + arr[i]);
        }
    }
}
