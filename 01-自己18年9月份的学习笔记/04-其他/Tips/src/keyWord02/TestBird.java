package keyWord02;
/*
 * The public type must be defined in its own file

翻译：公共类必须被定义在它自己的文件中

产生错误的原因：

1.定义Java类名同文件名不一样

2.一个文件中有多个类，只有与文件名一致的类名，才能声明为：public

内部类不能声明为：public

一个文件中只能有一个public类


继承：
1.子类会继承父类所有public类型的实例变量和方法，但不会继承父类所有private的类型和方法
2.继承下来的方法可以被覆盖掉，但实例变量不能被覆盖掉
3.当某个方法在子类中被覆盖过，调用这个方法时会调用到覆盖过的版本会
 */
 class Bird {
	// 这里指的是父类

	public void fly() {

		System.out.println("我只一只鸟，我能飞");

	}

}

 class Ostrich extends Bird {
	// 这里定义一个跟父类一样的方法;

	public void fly() {
		System.out.println("我是一只鸟，但我不能飞");

	}

}

public class TestBird {

	public static void main(String[] args) {

		Ostrich f = new Ostrich();

		f.fly();

	}

}
