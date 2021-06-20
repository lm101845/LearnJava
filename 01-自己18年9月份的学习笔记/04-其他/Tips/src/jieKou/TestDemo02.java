package jieKou;
/**
 * @姓名 李明
 * @日期 2018年11月5日上午9:29:48
 * 
 * 定义接口时使用interface定义，区别于抽象类，不需要加class。
接口不能被实例化，不能直接创建对象，因为接口里面只有抽象的方法，没有具体的功能。
接口可以继承接口，接口要实现具体的功能必须有实现他的子类，实现接口的子类中必须重写接口全部的抽象方法。
接口和接口之间可以多继承。
接口的子类可以是抽象类，但是没有实际的意义。
一个子类可以实现多个接口，通过implements关键字去实现。
接口需要通过多态才能创建对象。

 */
interface AA {
	public static final int i = 10;		//接口只能定义全局常量需要加public static final如果不加系统默认给出，推荐加。

	public abstract void eat();
}
 
interface BB extends AA { 		// 接口可以继承接口
	public abstract void sleep();
}
 
interface C {
	public abstract void look();
}
 
abstract class D { //定义一个抽象类
	public void run() {
		System.out.println("跑起来");		//普通方法
	}
 
	public abstract void learn();
}
 

public class TestDemo02 extends D implements B, C {		//一个子类可以继承一个抽象类同时实现多个接口
	//子类如果不是抽象类就必须实现所有的抽象方法
	
	public void eat() {		//实现接口AA中的抽象方法
		System.out.println("吃东西");
	}
 
	public void look() {		//实现接口C中的抽象方法
		System.out.println("看风景");
	}
 
	public void sleep() {		//实现接口BB中的抽象方法
		System.out.println("睡懒觉");
	}
 
	@Override
	public void learn() {	//重写抽象类D中的抽象方法
		System.out.println("学Java");
	}
 
	public static void main(String[] args) {
		BB b=(BB) new TestDemo02();		//多态，接口的引用指向子类的对象
		b.eat();
		b.sleep();
		System.out.println(BB.i);    //静态常量通过接口名去访问，不推荐用对象去调用
		
		C c=new TestDemo02();
		c.look();
		
		D d=new TestDemo02();	
		d.learn();
		
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}
}
/**
 * 输出为：
吃东西
睡懒觉
10
看风景
学Java
 */
