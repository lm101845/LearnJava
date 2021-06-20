package cn.itcast.day05.demo04;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 什么叫做"参数传递"?
 * 也就是在调用方法的时候,向方法内传入一些数据的动作;
 * 
 * 【形式参数】:在定义方法的时候,写在小括号之内的参数.	(被动接收数据的)
 * 例如: public static int sum() , int a , int b{...}		//这里的a和b是在定义的时候写的,所以是形式参数
 * 
 * 【实际参数】:在"调用"方法的时候,真正传入方法里的数据,叫做实际参数   (主动传入数据的)
 * 例如: int num = sum(10,20);		//这里的10,20是在调用的时候传入方法的,所以它们是实际参数
 * 
 * 又例如:
 * int x = 10;
 * int y =20;
 * int result = sum;		//这里的x,y也是在调用方法的时候传入的,所以也叫做实际参数
 * 
 * 参数传递的过程中,有【两项规则】：
 * 1.对于基本数据类型（以及String)来说,形式参数的操作不会影响实际参数
 * 2.对于引用数据类型(除去Sring)来说,形式参数的操作会影响实际参数
 * 
 * 不太熟！！！！
 */

public class Demo01MethodParamBasic {
	
	public static void main(String[] args) {
		
		int a =10;
		int b =20;
		System.out.println("a=" + a); //10
		System.out.println("b=" + b); //20
		System.out.println("=======================================================" ); 
		
		
		change(a,b);		//实际参数
		
		System.out.println("a=" + a); //10
		System.out.println("b=" + b); //20
		System.out.println("=======================================================" ); 
		
		
	}
		//定义一个方法,用来将参数扩大十倍
		public static void change (int x, int y) {		//形式参数
			x *= 10;	//扩大十倍
			y *= 10;	//扩大十倍
			System.out.println("x=" + x);			//x=100
			System.out.println("y=" + y);			//y=200
		}
}
