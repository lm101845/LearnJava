package cn.itcast.day07.demo03;

/**
 * 作者：李明
 * 日期： 2018年11月26日 下午7:10:40
 * 看的遍数：1
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
