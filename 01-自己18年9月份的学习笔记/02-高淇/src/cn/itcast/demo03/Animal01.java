package cn.itcast.demo03;

/*���Լ̳�
 * @���� ����
 * @���� 2018��10��29������9:00:24
 * 
 * Ϊʲô��Ҫ�����ࣿ��ζ�������ࣿ
 * ��һ��ģ��ģʽ��������Ϊ���������ṩ��һ��ͨ��ģ�壬������������ģ������Ͻ�����չ--���ʦ
 * ͨ�������࣬���Ա���������Ƶ������ԡ�ͨ�������࣬���ǾͿ��������ϸ������������ƣ�ʹ����֮�����ͨ��
 * 
 * Ҫ�㣺
 * 1.�г��󷽷�����ֻ�ܶ���ɳ�����
 * 2.�����಻�ܱ�ʵ��������������new��ʵ����������
 * 3.��������԰������ԡ����������췽�������ǹ��췽��������newʵ�֣�ֻ���������������
 * 4.���������������̳�
 * 5.���󷽷����뱻����ʵ��
 * 
 * 
 * 
 */
public abstract class Animal01 {
	String str;
	public abstract void run();			//���󷽷����������ڣ�����������ƺͷ�����ʵ�ַ�����
	public void breath() {
		System.out.println("����");
		run();      //ʵ�ʵ���ʱ����������󣬶�̬
	}
	
	public Animal01() {
		System.out.println("����һ�� Animal01");
	}
}

class Cat01 extends Animal01{
	@Override
	public void run() {
		System.out.println("è��С��");
	}
	
}

class Dog01 extends Animal01 {
	
	@Override
	public void run(){
		System.out.println("����");
	
	}
}


