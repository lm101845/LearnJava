package gouzaoqi;
/**
 * @姓名 李明
 * @日期 2018年11月6日下午8:19:37
 * 
 * 看不懂
 */
class Person {
	public void eat(Apple apple) {
		Apple a = apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		// ... remove peel
		return apple; // Peeled
	}
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}


public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
} 
/*
 * Output: Yummy
*/
