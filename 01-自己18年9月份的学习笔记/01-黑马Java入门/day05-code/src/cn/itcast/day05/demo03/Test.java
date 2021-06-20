package cn.itcast.day05.demo03;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午9:34:13
 * 看的遍数：1+1
 * 
 * 这个是简化的条件判断
 */
public class Test {
	
	void max(int a , int b) {
		
		System.out.println("int");
		System.out.println( a > b ? a : b );
	}
	
	void max(short a , short b) {
		System.out.println("short");
		System.out.println( a > b ? a : b );
	}
	
	void max(float a, float b) {
		System.out.println( a > b ? a : b );
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.max(3, 4);
		
		short a = 3;
		short b = 4;
		t.max(a, b);
	}

}
