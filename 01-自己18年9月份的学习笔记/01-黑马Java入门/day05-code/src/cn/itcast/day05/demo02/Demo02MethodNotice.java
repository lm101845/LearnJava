package cn.itcast.day05.demo02;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * ����û�з���ֵ�ķ�����Ҫע�⣺
 * 
 * 1.����ֵû�У���������Ͳ����в����������ͷ���ֵû�б�Ȼ��ϵ��
 * 2.�����ķ�������returnһ������ķ���ֵ
 * 3.������һ����"return;"��ô���Բ�д��д�벻д��ȫ��Ч
 * 4.����Ҫ��û�з���ֵ�ķ�����ֻ��ʹ�õ������ã�����ʹ�ô�ӡ���û��߸�ֵ���ã�����������
 * 
 */

public class Demo02MethodNotice {
	
	public static void main(String[] args) {
		//��������
		printHelloWorld();
		
		//���ܴ�ӡ����
		//System.out.println(printHelloWorld());
		//System.out.peintln(void);
		
		//����д�������ܸ�ֵ���ã�
		//int num1 = printHelloWorld();
		//int num2 = void
		//void num3 = void
	}
	
	public static void printHelloWorld() {		//����void���ͣ�������һ������ķ���ֵ
		for (int i = 1;i <=10; i++) {
			System.out.println("Java");
			//return 100;  //����д����
			//return;	���һ�е�returnһ�㶼��д��һ�㶼��ʡ�Ե�
		}
	}

}
