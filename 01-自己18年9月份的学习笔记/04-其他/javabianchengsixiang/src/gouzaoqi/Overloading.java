package gouzaoqi;

/**
 * @姓名 李明
 * @日期 2018年11月6日下午7:43:58
 * 
 *     在java中，通过提供构造器，类的设计者可确保每个对象都得到初始化。创建对象时，如果其类具有构造器，
 *     java就会在用户有能力操作对象之前自动调用相应的构造器，从而保证了初始化的进行
 * 
 *     构造器是一种特殊类型的方法，因为它没有返回值。这与返回值为空明显不同。
 */
//: initialization/Overloading.java
//Demonstration of both constructor
//and ordinary method overloading.

class Tree {
	int height;

	Tree() {
		System.out.println("Planting a seedling");
		height = 0;
	}

	Tree(int initialHeight) {
		height = initialHeight;
		System.out.println("Creating new Tree that is " + height + " feet tall");
	}

	void info() {
		System.out.println("Tree is " + height + " feet tall");
	}

	void info(String s) {
		System.out.println(s + ": Tree is " + height + " feet tall");
	}
}

public class Overloading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		// Overloaded constructor:
		new Tree();
	}
} 
