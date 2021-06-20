package day04;

/**如何遍历数组-双层for循环或者foreach循环
 * 作者：李明
 * 日期： 2018年12月24日 上午8:36:43
 * 看的遍数：
 */
public class _bianlishuzu {
	public static void main(String[] args) {
		int a[][] = new int[][] {{1},{2,3},{4,5,6}};	//这个一个不规则的二维数组
		
		//双for循环
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]);
		}
		System.out.println();
	    }
		
		
		//双foreach循环
		for(int i[]:a) {		//将所有行元素提取出来
			for(int j:i) {		//将行中所有列元素提取出来
				System.out.print(j);
			}
			System.out.println();
		}
	}
}