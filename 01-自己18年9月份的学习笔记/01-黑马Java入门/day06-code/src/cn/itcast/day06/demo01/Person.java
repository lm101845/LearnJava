package cn.itcast.day06.demo01;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午11:01:13
 * 看的遍数：1+1
 */
public class Person {
	
	String name;
	int age;
	
	public static void main(String[] args) {
		
		Person p = new Person();		//根据person类创建了一个p对象
		System.out.println("姓名" + p.name + "年龄：" + p.age);  	//name=null, age =0
		//这个小孩出生的时候没有名字和年龄
		
	}

}
