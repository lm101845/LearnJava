package cn.itcast.day04.demo01;
/**
 * @李明
 * @日期 2018年11月26日 
 * 看的遍数：1+1
 * 无论动态还是静态初始化，数组都具有长度。如何才能获取长度呢？
 * 
 * 格式：
 * 数组名称.length
 * 将会得到一个int数字，代表数组的长度
 * 
 * 【注意】
 * 一个数组一旦在内存当中被创建了，那么数组的长度就不能发生改变。
 * 
 * 数组是对象！！！
 */

public class Demo04ArrayLength {
	
	public static void main(String[] args) {
		
		//静态初始化
		int[] arrayA = {1,2,34,5,6,7,8,43,38,0,5,3,23};
		
		System.out.println(arrayA.length);	//13
		
		
		//动态初始化
		int[] arrayB = new int[25];			
		//由于在java中，数组是对象，因此可以使用new运算符来创建新的数组实例
		//使用new来创建数组对象时，必须指定数组的大小
		
		int len = arrayB.length;
		System.out.println(len);     //25
		
	}

}
