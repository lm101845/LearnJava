package cn.itcast.day09.demo02;

/**
 *  ���ߣ�����
  * ���ڣ� 2018��12��1�� ����3:47:56
  * ���ı�����1
  * 
 * ���Ҫ��ʹ�ö���õĽӿڣ�����Ҫ��һ���ӿڵġ�ʵ���ࡱ��
 * 
 * public class ʵ�������� implements �ӿ�����{
 * 			//һ��Ҫ������д���еĳ��󷽷�
 * }
 * 
 * ʲô�Ǹ�����д��override�����󷽷���
 * 1.Ҳ���ǽ��ӿڵ��еĳ��󷽷���д����
 * 2.ȥ��abstract�ؼ���
 * 3.д�ϴ����ŷ�����
 * 
 * Cat����Animal�ӿڵ�ʵ���࣬Cat��ʵ����Animal�ӿ�
 */
public class Cat implements Animal {

	public void eat() {		//��������д���󷽷���
		System.out.println("è����");
	}

	public void sleep() {	//��������д���󷽷�
		System.out.println("è˯��");
	}
	
	//����һ��Cat�Լ����еķ������ӿڵ��в�û�ж���
	public void catchMouse() {
		System.out.println("èץ����");
	}
}
