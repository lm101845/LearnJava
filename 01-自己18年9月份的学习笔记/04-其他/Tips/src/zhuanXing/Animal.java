package zhuanXing;

/**
 * @���� ����
 * @���� 2018��11��7������12:15:52
 * 
 *     ����ת�ͣ�ͨ�׵ؽ����ǽ��������תΪ������󡣴˴������������ǽӿڡ�
 * 
 *     ע�����������ת�ͣ�
 * 
 *     Animal b=new Bird(); //����ת�� b.eat();
 * 
 *     �˴������������eat()������ԭ��bʵ��ָ�����Bird���࣬�ʵ���ʱ��������౾��ķ�����
 * 
 *     ��Ҫע���������ת��ʱb����ʧ���븸������е������������籾���е�fly��������Ϊb���С�
 * 
 *     2������ת�͵ĺô���
 * 
 *     ������Ĵ��룬
 * 
 *     public static void dosleep(Human h) { h.sleep(); }
 * 
 *     �����Ը���Ϊ����������ʱ��������Ϊ��������������������ת�͡�����ʹ�����ü�ࡣ��Ȼ�Ļ���
 *     ���dosleep���������Ϊ���������ж��ٸ��������Ҫд���ٸ���������Ҳ������JAVA�ĳ�����˼�롣
 */

public class Animal {
	public void eat() {
		System.out.println("animal eatting...");
	}
}

class Bird extends Animal {
	@Override
	public void eat() {
		System.out.println("bird eatting...");    
	}

	public void fly() {
		System.out.println("bird flying...");
	}
}

class Main {
	public static void main(String[] args) {
		Animal b = new Bird(); // ����ת��
		b.eat();
		// ! error: b.fly(); b��ָ��������󣬵���ʱ��ʧfly()����
		dosleep(new Male());
		dosleep(new Female());
	}

	public static void dosleep(Human h) {
		h.sleep();
	}
}