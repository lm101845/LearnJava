package cn.itcast.day05.demo03;

/**
 * @���� ����
 * @���� 2018��11��7������9:37:21
 * ���ı�����1+1
 * 
 * ���췽��������--������Ӳ�̫��
 */
public class TestOverLoad {

	public static void main(String[] args) {

		Person p = new Person();		
		Person p1 = new Person(400);
		Person p2 = new Person(2, 500);
		
		p.info();		//�ҵ�id�� :0���ҵ����� �� : 20��
		p.info("С��"); //С���id�� :0��С��������� :20��
		p1.info();		//�ҵ�id�� :400���ҵ����� �� : 23��
		p2.info();		//�ҵ�id�� :2���ҵ����� �� : 500��
	}
}

class Person {

	Person() { // ���췽�������� ���췽������Ҫ������һ��
		id = 0;
		age = 20;
	}

	Person(int id) {
		this.id = id; // �����Ұ��㶨����ˣ�id���Լ�����
		age = 23;
	}

	Person(int id, int age) {
		this.id =   id;
		this.age = age;
	}

	// ��Ա��������
	private int id;
	private int age = 20;

	// ��������
	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		age = i;
	}

	public int getId() {
		return id;
	}

	void info() {
		System.out.println("�ҵ�id�� :" + id + "��"+"�ҵ����� �� : " + age + "��");
	}

	void info(String t) {
		System.out.println(t + "��id�� :" + id +"��"+ t + "�������� :" + age + "��");
	}

}
