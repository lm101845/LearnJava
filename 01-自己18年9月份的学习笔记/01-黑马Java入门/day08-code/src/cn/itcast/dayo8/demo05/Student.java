package cn.itcast.dayo8.demo05;
/**
 *  作者：李明
  * 日期： 2018年12月1日 下午3:47:56
  * 看的遍数：1
  * 
 * 封装类：用getter方法和setter方法，防止别人对你的参数进行直接修改
 * 
 * 封装的基本原则：
 * 1.将你的实例变量标记为私有的private
 * 2.提供共有的get和set方法来控制存取动作。（public)
 * 
 * 封装会对我们类的实例变量加上绝对领域，因此没有人会再去恶搞我们的实例变量，因为大部分的实例变量都有一个
 * 适当的范围，比如身高height就不能低于人类的最低身高60（（这里假设是60)。然后就是强迫其他的程序必须通过set方法检查并判断
 * 是否能执行实例变量的赋值
 */
public class Student {
	
	private String name;   //姓名
	private int age;   //年龄
	
	public Student() {		//默认的构造方法
		
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {    //getAge前面有个int数据类型代表什么？方法也要表明数据类型吗？
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
