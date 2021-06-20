package cn.itcast.demo03;

/*
 * @���� ����
 * @���� 2018��10��29������10:30:44
 * 
 * Ϊʲô��Ҫ�ӿڣ��ӿںͳ����������
 * �ӿھ��Ǳȡ������ࡱ�������󡱵ĳ����࣬���Ը��ӹ淶�Ķ��������Լ����ȫ���רҵ��ʵ���ˣ��淶�;���ʵ�ֵķ���
 * 
 * �ӿھ��ǹ淶���������һ�������������ʵ�����С��������.......�������......"��˼�롣�����������ʹ���ͱ����ܷɣ��������������
 * �ͱ������ܣ�������ǻ��ˣ��ͱ����۸����ˣ�
 * 
 * �ӿڵı�������Լ�����������˼�ķ���һ�����ƶ��ú��Ҷ����ء�
 * 
 * ��Ŀ�ľ��������Ƕ��ģ����Ǳ����Բ���Ӧ�����ܴ��ݿ������˴��ġ����䡱���ǡ��淶������ˣ����ǿ�����Ŀ������������ӿڱ��
 */
public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HEIGHT =1; 
	void fly();

}

interface Attack{
	void attack();
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("�ɻ������������ڷ�");
		
	}
}

class Man implements Flyable{

	@Override
	public void fly() {
		System.out.println("���������ɣ�");
		
	}
	
}

 class Stone implements Flyable,Attack{
	int weight;
	@Override
	public void fly() {
		System.out.println("ʯͷ�ӳ�ȥ���ɣ�");
		
	}
	@Override
	public void attack() {
		System.out.println("ʯͷ������");
		
	}
	
}
