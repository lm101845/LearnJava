package cn.itcast.day05.demo03;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 现有的问题描述:
 * 对于类似的多个方法,全都是执行相加的操作,但是因为参数列表不一样,所以需要记住多个名字,太麻烦!
 * 
 * 解决方案:
 * 使用方法重载(overload),只要记住一个相同的名字即可,可以根据参数列表的不同自动适配
 * 
 * 方法重载(overload):方法的名称相同,但是参数列表不同
 * 
 * 什么叫参数列表不同?
 * 1.参数的个数不同
 * 2.参数的类型不同
 * 3.参数的多类型顺序不同
 * 
 *  重载与下列顺序无关
 * 1.与返回值类型无关
 */

public class Demo01MethodOverload {
	
	public static void main(String[] args) {
		
		System.out.println(sum(10,20));	//2个参数的运行
		System.out.println(sum(10,20,30));	//3个参数的运行
		System.out.println(sum(10,20,30,40));	//4个参数的运行
		//System.out.println(sum(10,20,30,40,50));	//谁都对不上,没有任何一种重载形式使用,所以报错!
		System.out.println("=================================================================");
		
		//System.out.println(sum(10.0,20.0));	
		
	}
	
	public static int sum(int a, int b) {
		System.out.println("有2个int参数的方法执行!");
		return a + b;			//int result = a + b;
	}
	
	//public static int sum(int a, double b) {
		//System.out.println("有2个int参数的方法执行!");
		//表达式当中需要运算的数据类型不一样,怎么办?
		//谁的数据范围大,结果就用谁			int + double--->double
		//return a + b;			//int result = a + b;
	//}
	
	
	public static int sum(int a, int b , int c) {
		System.out.println("有3个int参数的方法执行!");
		return a + b + c;			
	}
	
	
	public static int sum(int a, int b , int c , int d) {
		System.out.println("有4个int参数的方法执行!");
		return a + b + c +d;			
	}
	
}
