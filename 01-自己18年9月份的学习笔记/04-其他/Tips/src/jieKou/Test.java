package jieKou;

/**
 * @���� ����
 * @���� 2018��11��5������10:27:17
 * 
 * �ӿ�ע�����
 * 1.�ӿ��еı����������϶���static�ģ�������Ӳ���static����
 * 2.��java�����У����ǰѾ����õı����������ڽӿ��У���Ϊȫ�����ʹ�á�������ʽ���ӿ���.������
 * 3.һ���ӿڲ��ܼ̳��������࣬���ǿ��Լ̳б�Ľӿ�
 * 
 * �ӿ��Ǹ��ӳ���ĳ�����
 */
public class Test {
	public static void main(String[] args) {
		System.out.println(Usb.a);
		
		Computer computer = new Computer();
		
		Camera camera1 = new Camera();
		
		Phone01 phone1 = new Phone01();
		
		computer.useUsb(camera1);
		computer.useUsb(phone1);
		
	}

}
//����Usb�ӿ�
interface Usb{
	int a = 1;   //�ӿ��п����б������ұ����϶��Ǿ�̬��(������Ӳ���static)
	
	//������2������
	public void start();
	public void stop();
}
//�ӿڼ̳б�Ľӿ�
class Aaa{
	
}
interface Tt{
	
}
interface Son extends Tt{
	
}
//�ӿڲ��ܼ̳��࣬���ܼ̳���һ���ӿ�
interface Kkk /*extends Aaa*/{		//ʲô��ûдҲ��һ���ӿڣ����Ǹ���򵥵Ľӿ�
	// public void cry();
}
//��д������࣬��ʵ��Usb�ӿ�
//һ����Ҫ��ԭ��:��һ����ʵ����һ���ӿڣ���Ҫ����������ӿڵ����з���ͳͳʵ��
class Camera implements Usb,Kkk{
	
	public void start() {
		
		System.out.println("�����������ʼ�����ˣ�");
	}
	
	public void stop() {
		
		System.out.println("���������ֹͣ�����ˣ�");
	}
}


class Phone01 implements Usb{
	public void start() {
		
		System.out.println("�����ֻ�����ʼ�����ˣ�");
	}
	
	public void stop() {
		
		System.out.println("�����ֻ���ֹͣ�����ˣ�");
	}
	
}
//�����
class Computer{
	public void useUsb(Usb usb) {
		
		usb.start();
		usb.stop();
	}
}

