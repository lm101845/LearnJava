package day04;

/**数组有三种初始化方法
 * 作者：李明
 * 日期： 2018年12月24日 上午7:03:39
 * 看的遍数：
 */
public class _shuzu {
	public static void main(String[] args) {
		//int a = 1;		//创建的是整型变量
		//int b[];		//创建的是数组
		
		//方法1：
		int a[] = new int[3];		//这些方法后面分号不能少
		a[0] = 7;
		a[1] = 2;
		a[2] = 6;
		
		//方法2：
		int b[] = new int[] {5,1,3};
		
		//方法3：
		int c[] = {8,4,9};
		
		//数组长度属性：length   数组长度-1=数组的最大索引下标
		System.out.println(a.length);
		
	}

}
