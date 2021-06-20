package day03;

import java.awt.Point;
/*
 * Point(4,13)--圆括号中可包含的参数个数和类型由类本身决定，这是通过一种叫做构造函数（又叫构造器constructor)的特殊方法定义的
 * 如果您使用类创建对象时，提供的参数的数目和类型不正确（或者在需要参数时，您没有提供），则编译程序时将出错
 * 
 * 同一个类可以有多个构造函数，每个构造函数的参数和类型各不相同。使用new时，您可以在参数列表中指定不同的参数，这样将调用
 * 相应的构造函数
 * 
 * 基本数据类型表示语言中最小的元素，它们不是对象，虽然在很多情况下处理起来与对象类似-可以将其赋给变量，传递给方法或从方法返回
 * 对象是类的实例，因此通常是比数字和字符复杂的多的数据类型，并常常将数字和字符作为实例变量和类变量
 */
 class PointSetter {
	 public static void main(String[] args) {
		 
		Point location = new Point(4,13);
		
		System.out.println("Starting location:");
		System.out.println("X equals"  +  location.x);
		System.out.println("Y equals"  +  location.y);
		
		System.out.println("\nMoving to (7,6)");
		location.x = 7;
		location.y = 6;
		
		System.out.println("\nEnding location");
		System.out.println("X equals"  +  location.x);
		System.out.println("Y equals"  +  location.y);
	}

}
