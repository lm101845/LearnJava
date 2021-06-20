package cn.itcast.day06.demo04;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 当局部变量和成员变量重名的时候，方法当中会根据“就进原则”使用局部变量
 * 如果希望区分一下，就需要使用格式：
 * this.成员变量名（成员变量！！！！！！！！！！！！)
 * 
 * this关键字的经典作用，将重名的成员变量和局部变量区分开（成员变量前加this,局部变量前什么都不用加
 * 
 * 扩展一丢丢：
 * this关键字其实代表的是“当前对象”
 * 记住一句话：通过谁调用的方法，谁就是this(通过person调用的方法，person就是this） 
 * 
 * 
 * 马士兵：
 * 1.在类的方法定义中使用的this关键字代表使用该方法的对象的引用
 * 2.当必须指出当前使用方法的对象是谁时要使用this
 * 3.有时使用this可以处理方法中成员变量和参数重名的情况
 * 4.this可以看作是一个变量，它的值是当前对象的引用
 */

public class Person {
	
	String name ;	//我自己的名字
	
		//public void sayHello(String who) {	//对方的名字
		//System.out.println(who + ",你好。我是" + name + "。");
	
	public void sayHello(String name) {	//对方的名字
		
		System.out.println(name + ",你好。我是" + this.name + "。");
	}

} 
