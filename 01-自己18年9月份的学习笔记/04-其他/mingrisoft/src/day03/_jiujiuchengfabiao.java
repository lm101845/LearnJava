package day03;

/**制作九九乘法表这个我也是不熟
 * 作者：李明
 * 日期： 2018年12月23日 下午2:46:56
 * 看的遍数：
 */
public class _jiujiuchengfabiao {
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=9;i++) {	 	//控制行
			for(j=1;j<=i;j++) {	//输出与行数相等的列
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}	
			System.out.println();
		}
	}
}
