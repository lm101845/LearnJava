package gouzaoqi;
/**
 * @���� ����
 * @���� 2018��11��6������8:19:37
 * 
 * ������
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
