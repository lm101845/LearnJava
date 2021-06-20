package day04;

/**
 * 作者：李明
 * 日期： 2018年12月24日 上午10:22:58
 * 看的遍数：
 */
public class _sanweishuzu {
	public static void main(String[] args) {
		int a[][][] = new int[2][3][4];
		
		//先通过三层循环对这个数组进行赋值
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					a[i][j][k] = i+j+k;
					
				}
			}
		}
		//再通过三层循环给这个数组进行遍历
		for(int i=0;i<a.length;i++) {
			System.out.println("---------------这是第"+i+"层---------------------------------------");
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
