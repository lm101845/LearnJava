package cn.itcast.day06.demo05;
/**
 *@����
 *@���� 2018��11��26�� 
 *���ı�����1+1
 *
 * ���췽��Ҳ��һ�ַ���������Ҳ���Խ��з������أ�Overload��
 * ���أ�������������ͬ�����ǲ����б�ͬ
 * 
 * ���췽�����صĺô���
 * ����һ�����ص�ȫ�����Ĺ��췽����������new�����ͬʱ����Գ�Ա�������и�ֵ
 * 
 */
public class Student {
	
	private String name;
	private int age;
	
	public Student() {
		System.out.println("�޲����Ĺ��췽��ִ�У�");
	}
	
	public Student(int num) {
		System.out.println("�в����Ĺ��췽��ִ�У�" + num);
	}
	
	public Student (String str,int num) {	//���ǵ�����������
		System.out.println("��2�������Ĺ��췽��ִ�У�");
		name = str;
		age = num;
	}

	public String getName() {    //��ȡ
		return name;
	}

	public void setName(String name) {		//����
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
