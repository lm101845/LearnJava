package cn.itcast.day07.demo03;

/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� ����7:10:40
 * ���ı�����1
 */
public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
