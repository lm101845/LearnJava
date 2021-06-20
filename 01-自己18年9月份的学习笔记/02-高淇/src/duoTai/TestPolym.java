package duoTai;

/**
 * 测试多态
 * 
 * @姓名 李明
 * @日期 2018年10月29日下午6:44:19
 */
/*
 * 多态指的是同一个方法调用，由于对象不同可能会有不同的行为（同样是睡觉，人在床上躺着睡，蝙蝠倒着睡）现实生活中，
 * 同一个方法， 具体实现会完全不同
 * 
 * 多态的要点：
 *  1.多态是方法的多态，不是属性的多态（多态与属性无关） 
 *  2.多态的存在要有3个必要条件：继承、方法重写、父类引用指向子类对象
 *  3.父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了
 * 
 * final关键字的作用：
 *  1.修饰变量：被他修饰的变量不可改变。一旦赋了初值，就不能被重新赋值
 *  2.修饰方法：该方法不可被子类重写，但是可以被重载
 *  3.修饰类：修饰的类不能被继承。比如：Math、String等
 * 
 * 重写和重载的区别： 1.重写： 2.重载：
 * 
 * 
 */
public class TestPolym {

	public static void main(String[] args) {

		Animal a = new Animal();
		animalCry(a);

		Animal d = new Dog(); 
		// 自动向上转型 虽然贴了animal的标签，但是本质上还是dog,运行的时候还是运行dog的方法
		// 编译器在编译时认为d就是animal，只有在运行时才认为d是dog
		animalCry(d);
		
		Animal c = new Cat();
		animalCry(new Cat());

		// d.seeDoor(); //编译器不认识d,把它当作animal
		Dog d2 = (Dog) d; // 强制向下转型 d原来是animal( Animal d),但强制把它转为dog
		d2.seeDoor();
		
    	//Dog d3 = (Dog) c;    
		//把一只猫强制转换成一只狗，不可以的。编译没有问题，但是会报错ClassCastException（类型转化错误）
		
        //d3.seeDoor();

	}

	static void animalCry(Animal a) { // 类似于static void sum(int a) 类型是Animal ,变量为a
		a.shout();
	}

	/*
	 * static void animalCry(Dog a){ a.shout(); } static void animalCry(Cat a){
	 * a.shout(); }
	 */

}

class Animal {

	public void shout() {
		System.out.println("动物叫了一声！");
	}
}

class Dog extends Animal {

	public void shout() {
		System.out.println("狗旺旺旺！"); // 方法的重写
	}

	public void seeDoor() {
		System.out.println("狗看门！！！");   //狗自身的方法
	}

}

class Cat extends Animal {

	public void shout() {
		System.out.println("猫喵喵喵！");
	}
}
