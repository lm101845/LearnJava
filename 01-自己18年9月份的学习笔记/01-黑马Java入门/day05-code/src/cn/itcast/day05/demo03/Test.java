package cn.itcast.day05.demo03;

/**
 * @���� ����
 * @���� 2018��11��7������9:34:13
 * ���ı�����1+1
 * 
 * ����Ǽ򻯵������ж�
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
