package theEquals;

/**
 * @姓名 李明
 * @日期 2018年10月29日下午4:10:04
 */
/*
 * 输出结果顺序为：
 * 开始创建一个ChildClass对象......
 *	创建FatherClass
 *	创建ChildClass
 *
 *new的是childclass2,照理说应该先显示"创建ChildClass"，但实际上显示的是FatherClass
 *
 *构造方法调用顺序：
 *构造方法的第一句总是：super(...)来调用父类对应的构造方法。所以，流程就是：先向上追溯到Object,然后再依次向下执行类的初始化块和
 *构造方法，直到当前子类为止
 *注：静态初始化块调用顺序，与构造方法调用顺序一样，不再重复
 */
public class TestSuper02 {
	public static void main(String[] args) {
		
		System.out.println("开始创建一个ChildClass对象......");
		new ChildClass2();
	}
}

class FatherClass2 {
	public FatherClass2() {
		super();
		System.out.println("创建FatherClass");
	}
}

class ChildClass2 extends FatherClass2 {
	public ChildClass2() {
		super();   //这句话写有，不写默认还会加这句话
		System.out.println("创建ChildClass");
	}
}