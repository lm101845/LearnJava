package day04;

/**数组是对象，所以要用new
 * 二维数组不一定是几乘几的矩阵
 * 二维数组第一个方括号的值必须写，而第二个方括号的值则可以忽略
 * 作者：李明
 * 日期： 2018年12月24日 上午7:55:53
 * 看的遍数：
 */
public class _buguizeshuzu {
	public static void main(String[] args) {
		int a[][] = new int[3][];	//只定义了三行，每行有多少列未定义
		
		a[0] = new int[]{2,5,2,4,1};		//要写new int
		a[1] = new int[] {1,2,3}; 
		a[2] = new int[] {6,7,8,9};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]中有"+a[i].length+"个元素，分别是：");
			for(int tmp:a[i]) {			//foreach循环
				System.out.println(tmp+" ");
			}
			System.out.println();
		}
		//a.length指的是有多少行；a[0].length指的是第一行有多少个元素
		System.out.println(a.length);		//3
		System.out.println(a[0].length);	//5
		
	}

}
