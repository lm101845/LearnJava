package zhuanXing;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午12:15:52
 * 
 *     向上转型：通俗地讲即是将子类对象转为父类对象。此处父类对象可以是接口。
 * 
 *     注意这里的向上转型：
 * 
 *     Animal b=new Bird(); //向上转型 b.eat();
 * 
 *     此处将调用子类的eat()方法。原因：b实际指向的是Bird子类，故调用时会调用子类本身的方法。
 * 
 *     需要注意的是向上转型时b会遗失除与父类对象共有的其他方法。如本例中的fly方法不再为b所有。
 * 
 *     2，向上转型的好处。
 * 
 *     看上面的代码，
 * 
 *     public static void dosleep(Human h) { h.sleep(); }
 * 
 *     这里以父类为参数，调有时用子类作为参数，就是利用了向上转型。这样使代码变得简洁。不然的话，
 *     如果dosleep以子类对象为参数，则有多少个子类就需要写多少个函数。这也体现了JAVA的抽象编程思想。
 */

public class Animal {
	public void eat() {
		System.out.println("animal eatting...");
	}
}

class Bird extends Animal {
	@Override
	public void eat() {
		System.out.println("bird eatting...");    
	}

	public void fly() {
		System.out.println("bird flying...");
	}
}

class Main {
	public static void main(String[] args) {
		Animal b = new Bird(); // 向上转型
		b.eat();
		// ! error: b.fly(); b虽指向子类对象，但此时丢失fly()方法
		dosleep(new Male());
		dosleep(new Female());
	}

	public static void dosleep(Human h) {
		h.sleep();
	}
}