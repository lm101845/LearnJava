package jieKou;
/**
 * @���� ����
 * @���� 2018��11��5������9:29:48
 * 
 * ����ӿ�ʱʹ��interface���壬�����ڳ����࣬����Ҫ��class��
�ӿڲ��ܱ�ʵ����������ֱ�Ӵ���������Ϊ�ӿ�����ֻ�г���ķ�����û�о���Ĺ��ܡ�
�ӿڿ��Լ̳нӿڣ��ӿ�Ҫʵ�־���Ĺ��ܱ�����ʵ���������࣬ʵ�ֽӿڵ������б�����д�ӿ�ȫ���ĳ��󷽷���
�ӿںͽӿ�֮����Զ�̳С�
�ӿڵ���������ǳ����࣬����û��ʵ�ʵ����塣
һ���������ʵ�ֶ���ӿڣ�ͨ��implements�ؼ���ȥʵ�֡�
�ӿ���Ҫͨ����̬���ܴ�������

 */
interface AA {
	public static final int i = 10;		//�ӿ�ֻ�ܶ���ȫ�ֳ�����Ҫ��public static final�������ϵͳĬ�ϸ������Ƽ��ӡ�

	public abstract void eat();
}
 
interface BB extends AA { 		// �ӿڿ��Լ̳нӿ�
	public abstract void sleep();
}
 
interface C {
	public abstract void look();
}
 
abstract class D { //����һ��������
	public void run() {
		System.out.println("������");		//��ͨ����
	}
 
	public abstract void learn();
}
 

public class TestDemo02 extends D implements B, C {		//һ��������Լ̳�һ��������ͬʱʵ�ֶ���ӿ�
	//����������ǳ�����ͱ���ʵ�����еĳ��󷽷�
	
	public void eat() {		//ʵ�ֽӿ�AA�еĳ��󷽷�
		System.out.println("�Զ���");
	}
 
	public void look() {		//ʵ�ֽӿ�C�еĳ��󷽷�
		System.out.println("���羰");
	}
 
	public void sleep() {		//ʵ�ֽӿ�BB�еĳ��󷽷�
		System.out.println("˯����");
	}
 
	@Override
	public void learn() {	//��д������D�еĳ��󷽷�
		System.out.println("ѧJava");
	}
 
	public static void main(String[] args) {
		BB b=(BB) new TestDemo02();		//��̬���ӿڵ�����ָ������Ķ���
		b.eat();
		b.sleep();
		System.out.println(BB.i);    //��̬����ͨ���ӿ���ȥ���ʣ����Ƽ��ö���ȥ����
		
		C c=new TestDemo02();
		c.look();
		
		D d=new TestDemo02();	
		d.learn();
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
}
/**
 * ���Ϊ��
�Զ���
˯����
10
���羰
ѧJava
 */
