package chapter07;

public class TestThis {
	int a, b, c;

	TestThis(int a, int b) {
		//Hello();        //�������޷����ù��췽����
		//this();				 //�����޲εĹ��췽�������ұ���λ�ڵ�һ��
		this.a = a;
		this.b = b;
	}

	TestThis(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}

	void sing() {
	}

	void eat() {
		this.sing(); // ���ñ����е�sing();
		System.out.println("�����躰��ؼҳԷ���");
	}

	public static void main(String[] args) {
		
		TestThis hi = new TestThis(2, 3);
		hi.eat();

	}
}