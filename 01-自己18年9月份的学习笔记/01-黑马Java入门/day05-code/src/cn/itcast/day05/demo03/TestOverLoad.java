package cn.itcast.day05.demo03;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午9:37:21
 * 看的遍数：1+1
 * 
 * 构造方法的重载--这个例子不太熟
 */
public class TestOverLoad {

	public static void main(String[] args) {

		Person p = new Person();		
		Person p1 = new Person(400);
		Person p2 = new Person(2, 500);
		
		p.info();		//我的id是 :0；我的年龄 是 : 20岁
		p.info("小红"); //小红的id是 :0；小红的年龄是 :20岁
		p1.info();		//我的id是 :400；我的年龄 是 : 23岁
		p2.info();		//我的id是 :2；我的年龄 是 : 500岁
	}
}

class Person {

	Person() { // 构造方法的重载 构造方法必须要和类名一致
		id = 0;
		age = 20;
	}

	Person(int id) {
		this.id = id; // 年龄我帮你定义好了，id你自己定义
		age = 23;
	}

	Person(int id, int age) {
		this.id =   id;
		this.age = age;
	}

	// 成员变量定义
	private int id;
	private int age = 20;

	// 方法定义
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
		System.out.println("我的id是 :" + id + "；"+"我的年龄 是 : " + age + "岁");
	}

	void info(String t) {
		System.out.println(t + "的id是 :" + id +"；"+ t + "的年龄是 :" + age + "岁");
	}

}
