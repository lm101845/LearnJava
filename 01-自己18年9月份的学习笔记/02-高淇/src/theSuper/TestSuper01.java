package theSuper;

/**
 * @姓名 李明
 * @日期 2018年10月29日下午3:47:16
 */
/*
 * super是直接父类对象的引用，可以通过super来访问父类中被子类覆盖的方法或属性 使用super调用普通方法，语句没有位置限制，
 * 可以在子类中随意调用
 * 
 * 若是构造方法的第一行代码没有显式的调用super(...)或者this(...),那么java默认都会调用super(),含义是调用父类的无参数构造方法，
 * 这里的super()可以省略
 */
public class TestSuper01 {
	public static void main(String[] args) {

		new ChildClass().f(); // 这个不写不行，有什么作用我没有看懂
	}
}

class FatherClass {
	public int value;

	public void f() {
		value = 100;
		System.out.println("FatherClass.value=" + value); // FatherClass.value=100
	}
}

class ChildClass extends FatherClass {
	public int value; // 子类中有个属性也叫value 这个有什么用我也没看懂

	public void f() { // 子类中的f()方法重写了父类中的f()方法，把父类的方法已经覆盖掉了
		// f(); 如果直接写f那是调用自己的
		super.f(); // 调用父类对象的普通方法
		value = 200;
		
		System.out.println("ChildClass.value=" + value); // ChildClass.value=200
		System.out.println(value); // 200
		System.out.println(super.value); // 调用父类对象的成员变量 结果100
	}
}