package cn.itcast.day06.demo07;

/**
 * @���� ����
 * @���� 2018��11��6������8:29:30
 * ���ı�����1+1
 * 
 * ��չһ������
 * this�ؼ�����ʵ������ǡ���ǰ����
 * ��סһ�仰��ͨ��˭���õķ�����˭����this
 */
public class Person {

	private String name;
	private int age;

	public Person() {  //Ĭ�ϵĹ��췽��

	}

	public Person(String name, int age) {   //���ӵĹ��췽��
		this.name = name;
		this.age = age;
	}

	public void sayHello(String name) {
		
		System.out.println(name + ",���" + " �ҽ�" + this.name + ",����" + this.age + "�ꡣ");
	}
	
	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
