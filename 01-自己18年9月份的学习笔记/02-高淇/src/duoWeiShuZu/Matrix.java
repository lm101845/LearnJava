package duoWeiShuZu;

/**
 * @姓名 李明
 * @日期 2018年11月6日上午2:16:25
 * 
 * 打印指定的矩阵
 * 封装了矩阵常用的算法
 */
public class Matrix { // 矩阵的意思

	public static void print(int[][] c) {
		
		// 打印矩阵
		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}

	}
	
	//矩阵加法
	public static int[][] add(int[][] a, int[][] b){
		
		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c.length; j++) {

				c[i][j] = a[i][j] + b[i][j];

			}
		}
		return c;
		
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 3 }, { 2, 4 } };
		int[][] b = { { 3, 4 }, { 5, 6 } };
		//int[][] c = new int[2][2];
		
		int[][] c = add(a,b);
		print(c);

		// 矩阵加法
		/*for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c.length; j++) {

				c[i][j] = a[i][j] + b[i][j];

			}

		}
*/
		// 打印矩阵
		/*for (int i = 0; i < c.length; i++) {

			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
*/
		/*
		 * c[0][0] = a[0][0] + b[0][0];
		 * c[0][1] = a[0][1] + b[0][1];
		 * c[1][0] = a[1][0] + b[1][0]; 
		 * c[1][1] = a[1][1] + b[1][1];
		 */

		// System.out.println(c[1][0] + "\t" + c[1][1]);
	}

}
