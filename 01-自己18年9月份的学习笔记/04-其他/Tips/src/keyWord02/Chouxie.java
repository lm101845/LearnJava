package keyWord02;

 class Pet {

	public void play() { // 这是宠物类,普通父类，方法里是空的
	}
}

 class Cat extends Pet { // 这是子类，是一个猫类,重写了父类方法
	public void play() {
		System.out.println("1、猫爬树");
	}
}

 class Dog extends Pet { // 这是子类，是一个狗类,重写了父类方法
	public void play() {
		System.out.println("2、狗啃骨头");
	}
}

public class Chouxie {
	public static void main(String[] args) { // 这是测试类，分别调用了子类的不同方法

		Pet p1 = new Dog(); // 多典型的多态表现啊，相当的给力
		Pet p2 = new Cat();

		p1.play();
		p2.play();
	}
}
