package cn.itcast.day06.demo07;

/**
 * @姓名 李明
 * @日期 2018年11月6日下午8:29:30
 * 看的遍数：1+1
 * 
 * 扩展一丢丢：
 * this关键字其实代表的是“当前对象”
 * 记住一句话：通过谁调用的方法，谁就是this
 */
public class Person {

	private String name;
	private int age;

	public Person() {  //默认的构造方法

	}

	public Person(String name, int age) {   //增加的构造方法
		this.name = name;
		this.age = age;
	}

	public void sayHello(String name) {
		
		System.out.println(name + ",你好" + " 我叫" + this.name + ",今年" + this.age + "岁。");
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
