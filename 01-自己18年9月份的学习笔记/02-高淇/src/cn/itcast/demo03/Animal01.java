package cn.itcast.demo03;

/*测试继承
 * @姓名 李明
 * @日期 2018年10月29日下午9:00:24
 * 
 * 为什么需要抽象类？如何定义抽象类？
 * 是一种模板模式。抽象类为所有子类提供了一个通用模板，子类可以在这个模板基础上进行扩展--设计师
 * 通过抽象类，可以避免子类设计的随意性。通过抽象类，我们就可以做到严格限制子类的设计，使子类之间更加通用
 * 
 * 要点：
 * 1.有抽象方法的类只能定义成抽象类
 * 2.抽象类不能被实例化，即不能用new来实例化抽象类
 * 3.抽象类可以包含属性、方法、构造方法。但是构造方法不能用new实现，只能用来被子类调用
 * 4.抽象类智能用来继承
 * 5.抽象方法必须被子类实现
 * 
 * 
 * 
 */
public abstract class Animal01 {
	String str;
	public abstract void run();			//抽象方法的意义在于：将方法的设计和方法的实现分离了
	public void breath() {
		System.out.println("呼吸");
		run();      //实际调的时候是子类对象，多态
	}
	
	public Animal01() {
		System.out.println("创造一个 Animal01");
	}
}

class Cat01 extends Animal01{
	@Override
	public void run() {
		System.out.println("猫步小跑");
	}
	
}

class Dog01 extends Animal01 {
	
	@Override
	public void run(){
		System.out.println("狗跑");
	
	}
}


