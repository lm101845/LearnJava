package cn.itcast.day06.demo01;

/**
 * @���� ����
 * @���� 2018��11��7������11:01:43
 * ���ı�����1+1
 */
public class Person01 {
	
	String name;
	int age;
	
	//���췽��-���ֺ�����Ҫһ��
	Person01(String n , int a){
		name = n;	//��������nameֵ
		age = a;	//��������ageֵ
	}
	public static void main(String[] args) {
		
		Person01 p = new Person01("����" , 1);		//������person���͵�p���󣬲��ҵ��ù��췽������ö�������ֵ
		System.out.println("����" + p.name + "����" + p.age); //name=����  age=1
		//������󴴽�������ʱ���Ѿ������Լ������ֺ�����
	}
	
	

}
