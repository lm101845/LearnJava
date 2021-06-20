package day04;

/**
 * 作者：李明
 * 日期： 2018年12月24日 上午7:43:57
 * 看的遍数：
 */
public class _erweishuzu {
	public static void main(String[] args) {
		//二维数组初始化
		//方法1：
		int a[][] = {{1,3,5},{2,5,6}};
		
		//方法2：
		int b[][] = new int[][]{{1,3,5},{2,5,6}};
		
		//方法3：
		int c[][] = new int[2][3];		//看成2行3列
		c[0][0] = 1;
		c[0][1] = 2;
		c[0][2] = 3;
		c[1][0] = 4;
		c[1][1] = 5;
		c[1][2] = 6;
		
	}

}
