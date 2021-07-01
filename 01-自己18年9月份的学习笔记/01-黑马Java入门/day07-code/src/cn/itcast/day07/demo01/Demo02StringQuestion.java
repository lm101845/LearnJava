package cn.itcast.day07.demo01;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1
 *
 * 既然说字符串就是一个变量，那么有两个问题需要解释：
 * 
 * 1.对象肯定有一个类与之对应，那么字符串对应的类是谁：String
 * 为什么String这个类不需要导包直接就能用？
 * 
 * 所有的类都需要导包才能使用，除了两种情况：
 * A.要使用的目标类，和当前的类位于同一个包下。
 * B.要使用的目标类，位于java.lang包下，但是不包含子包内容。
 * 
 * 
 * 2.既然字符串是对象，那么为什么直接打印出来就是内容呢？
 * 打印println方法逻辑：
 * a.如果是字符串类型，那么直接显示内容
 * b.如果不是字符串类型，那么就想办法内部转换成字符串，然后再显示。
 * 
 * 一般的对象都是使用“类型信息+@+地址值”作为字符串内容的
 */
public class Demo02StringQuestion {
	
	public static void main(String[] args) {
		
		String str  = "Hello";
		System.out.println(str);   //Hello
		
		Person per = new Person();
		System.out.println(per);    //cn.itcast.day07.MyMap.demo01.Person@299a06ac
		
	}	
	
	/*
	 * Object类具有一个toString()方法，你创建的每个类都会继承该方法。它返回对象的一个String表示，
	 * 并且对于调试非常有帮助。然而对于默认的toString()方法往往不能满足需求，需要覆盖这个方法。
	toString（）方法将对象转换为字符串。
	
	它通常只是为了方便输出，比如System.out.println(xx)，括号里面的“xx”如果不是String类型的话，就自动调用xx的toString()方法
	总而言之，它只是sun公司开发java的时候为了方便所有类的字符串操作而特意加入的一个方法
	 */
}
