package cn.itcast.day06.demo01;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午11:01:43
 * 看的遍数：1+1
 */
public class Person01 {
	
	String name;
	int age;
	
	//构造方法-名字和类名要一致
	Person01(String n , int a){
		name = n;	//给对象赋予name值
		age = a;	//给对象赋予age值
	}
	public static void main(String[] args) {
		
		Person01 p = new Person01("张三" , 1);		//创建了person类型的p对象，并且调用构造方法赋予该对象属性值
		System.out.println("姓名" + p.name + "年龄" + p.age); //name=张三  age=1
		//这个对象创建出来的时候已经有了自己的名字和年龄
	}
	
	

}
