package com.atguigu.java5;


import java.util.Random;

//面试题：多态是编译时行为还是运行时行为？——运行时行为！！！！！！！
//证明如下：
class Animal  {
	protected void eat() {
		System.out.println("animal eat food");
	}
}

class Cat  extends Animal  {
	protected void eat() {
		System.out.println("cat eat fish");
	}
}

class Dog  extends Animal  {
	public void eat() {
		System.out.println("Dog eat bone");
	}
}

class Sheep  extends Animal  {
	public void eat() {
		System.out.println("Sheep eat grass");

	}

 
}

public class InterviewTest {
	//定义了一个静态方法
	public static Animal  getInstance(int key) {
		switch (key) {
		case 0:
			return new Cat ();
		case 1:
			return new Dog ();
		default:
			return new Sheep ();
		}

	}

	public static void main(String[] args) {
		int key = new Random().nextInt(3);
		System.out.println(key);
		Animal  animal = getInstance(key);
		animal.eat();
		//这个时候你是看不出来这个animal是哪个动物，它吃什么食物，这个也证明了，多态是运行时行为
	}
}
