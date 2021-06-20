package zhuanXing;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午1:45:47
 * 
 * 前三个，强行分析，还能看得懂。但是第四个，大概你就傻了吧。为什么不是b and b呢？

这里就要学点新东西了。

当父类对象引用变量引用子类对象时，被引用对象的类型决定了调用谁的成员方法，引用变量类型决定可调用的方法。
如果子类中没有覆盖该方法，那么会去父类中寻找。
 */
class A {
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}

}

class B extends A {
	public String show(B obj) {
		return ("B and B");
	}

	public String show(A obj) {
		return ("B and A");
	}
}

class C extends B {

}

class D extends B {

}

public class Demo03 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println("1--" + a1.show(b)); 	 //1--A and A
		System.out.println("2--" + a1.show(c)); 	 //2--A and A
		System.out.println("3--" + a1.show(d)); 	//3--A and D
		System.out.println("4--" + a2.show(b)); 	//4--B and A
		System.out.println("5--" + a2.show(c)); 	//5--B and A
		System.out.println("6--" + a2.show(d)); 	//6--A and D
		System.out.println("7--" + b.show(b)); 		//7--B and B
		System.out.println("8--" + b.show(c)); 		//8--B and B
		System.out.println("9--" + b.show(d)); 		//9--A and D
	}
}

