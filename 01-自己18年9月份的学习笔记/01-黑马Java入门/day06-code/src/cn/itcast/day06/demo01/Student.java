package cn.itcast.day06.demo01;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * ����һ����,����ģ����ʵ����"ѧ��"��
 * 
 * ѧ��������������ɲ��֣�
 * ���ԣ�����������
 * ��Ϊ���Է���˯����ѧϰ
 * 
 * ��Ӧ���൱��Ҳ��������ɲ��֣�
 * 
 * ��Ա���������ԣ�
 * 	String name;	//����
 * 	int age;		//����
 * 
 * ��Ա��������Ϊ����
 * 	public  void eat() {...}	//�Է�	//ɾ��static
 * 	public  void sleep() {...}	//˯��
 * 	public  void study() {...}	//ѧϰ
 */

public class Student {					//����һ��ѧ������
	
	//��Ա����--Ҳ�о�̬����
	String name;	//����
	int age;		//����
	
	//��Ա����--Ҳ�ж�̬����
	public void eat() {
		System.out.println("�Է�����");
	}
	
	public void sleep() {
		System.out.println("˯������");
	}
	
	public void study() {
		System.out.println("ѧϰ��");
	}
	
	
}
