package zhuanXing;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午12:29:32
 * 
 * 向上转型的好处。

看上面的代码，

    public static void dosleep(Human h) {
        h.sleep();
    }

这里以父类为参数，调有时用子类作为参数，就是利用了向上转型。这样使代码变得简洁。不然的话，
如果dosleep以子类对象为参数，则有多少个子类就需要写多少个函数。这也体现了JAVA的抽象编程思想。
 */
public class Human {
	public void sleep() {
		System.out.println("Human sleep..");
	}
}

class Male extends Human {
	@Override
	public void sleep() {
		System.out.println("Male sleep..");
	}
}

class Female extends Human {
	@Override
	public void sleep() {
		System.out.println("Female sleep..");
	}
}
