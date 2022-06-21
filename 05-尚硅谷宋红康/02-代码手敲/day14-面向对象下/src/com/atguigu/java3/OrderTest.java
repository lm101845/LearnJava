package com.atguigu.java3;
/*
 * 对属性可以赋值的位置：
 * ①默认初始化
 * ②显式初始化/⑤在代码块中赋值
 * ③构造器中初始化
 * ④有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值

 * 
 * 执行的先后顺序：① - ② / ⑤ - ③ - ④
 */


public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.orderId);
	}
}

class Order{
	//显式赋值
	int orderId = 3;
	{
		//代码块中赋值——在后面
		orderId = 4;
	}
//	//显式赋值
//	int orderId = 3;
	//这个不是在方法体里面，是在类里面，你先写谁，后写谁，无所谓
	//显式赋值和代码块赋值，谁后写，显示谁
}
