��һ�⣺��ϰ���յĴ���

�ڶ��⣺��JDK�в���
		���ҳ�����
			final���ε��ࡢ��final���εķ�������final���εı���
		��ע��
			����Ҫÿ����һ�������ҵ��������ɡ�

�����⣺�����������󣬲��ô���ʵ��
	interface Inter {
		void show(); 
	}
	class Outer { 
		//������� 
	}
	public class OuterDemo {
		public static void main(String[] args) {
			  Outer.method().show();
		  }
	}
	Ҫ���ڿ���̨�����HelloWorld��	


	
�����⣺�����������󣬲��ô���ʵ��

	Ҫ��:�ڲ�����Test�д���A�Ķ���a�����ó�Ա����methodA(),Ҫ�������ַ�ʽʵ�� 
	
	public class Test {
		public static void main(String[] args) {		
		}
	}
	//����ӿ�
	interface InterA {
		void showA();	
	}
	class A {
		public void methodA(InterA a) {
			a.showA();		
		}	
	}