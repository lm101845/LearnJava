package cn.itcast.day05.demo01;

/**
 * @姓名 李明
 * @日期 2018年10月7日下午8:58:22
 * 看的遍数：1+1
 */
public class Demo06MathodParam {
	
	public static void main(String[] args) {
		
		System.out.println(MethodThree(10 , 20, 30));  //60
		System.out.println(methodOne(20));  //120
		System.out.println(methodNone());  //10000
		
	}
	
	//参数有多个的情况
	public static int MethodThree(int a , int b, int c) {
		
		int result = a + b + c;
		return result;
	}
	//参数只有一个的情况
	public static int methodOne (int num) {
		int result = num + 100;
		return result;
	}
	
	//没有参数的情况
	public static int methodNone() {
		int num = 10000;
		return num;
	}
		
}

