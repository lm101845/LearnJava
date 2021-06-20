package duoTai;
/**
 * @姓名 李明
 * @日期 2018年11月5日上午7:19:34
 * 
 * 多态概述：

在设计一个方法时，通常希望该方法具备定的通用性。 例如要实现一个动物叫的方法，由于每种动物的叫声是不同的，
因此可以在方法中接收一个动物类型的参数，当传入猫类对象时就发出猫类的叫声，传人犬类对象时就发出犬类的叫声。
在同一个方法中，这种由于参数类型不同而导致执行效果各异的现象就是多态。

在Java中为了实现多态，允许使用一个父类类型的变量来引用一个子类类型的对象，根据被引用子类对象特征的不同，
得到不同的运行结果。

 */
abstract class Animal {
	public abstract void shout(); // 定义抽象shout()方法
}

//定义Cat类继承Animal
class Cat extends Animal {
	// 实现shout()方法
	public void shout() {
		System.out.println("喵喵...");

	}
}

//定义Dog类继承Animal
class Dog extends Animal {
	// 实现shout()方法
	public void shout() {
		System.out.println("汪汪...");

	}
}


public class Duotai {
	public static void main(String[] args) {
		Animal cat = new Cat();     //将Cat对象当作Animal类型来使用
		Animal dog = new Dog();		//将Dog对象当作Animal类型来使用
		/*
		 * 将子类对象当作父类使用时不需要任何显式地声明，需要注意的是，此时不能通过父类变量去调用子类中的某些方法
		 * 这种不需要显式声明的类型转换叫自动类型转换。
		 * 
		 * 对于animalShout()方法来说，传入的对象可以是Animal类型，还可以是Animal的子类型，
		 * 它要怎么知道传入的到到底是哪一个类型呢？Java提供了一个instanceof关键字来判断一个对象的类型，其使用格式如下：
		 * 对象（或对象的引用变量）  instanceof  类（或接口）
		 * 
		 * 对上面animalShout()方法代码进行修改：
		 * 	public static void animalShout(Animal animal) {
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.shout();
		} else if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.shout();
		} else {
			animal.shout();
		}
	}

		利用instanceof进行类型判断的好处就是避免了强制类型转换过程中类型不匹配的错误。


		 */

		animalShout(dog);   //汪汪...
		animalShout(cat);   //喵喵...
/*
 * Animal cat = new Cat();和 Animal dog = new Dog(); 两行代码实现了父类类型变量引用不同的子类对象。
调用animalShout()方法时，将父类引用的两个不同子类对象分别传入，结果打印出了“汪汪...”和“喵喵...”。
由此可见，多态不仅解决了方法同名的问题，而且还使程序变得更加灵括，从而有效地提高程序的可扩展性和可维护性
*/


	}

	// 定义一个静态的animalShout()方法,接收一个Animal类型的对象
	public static void animalShout(Animal animal) {
		animal.shout();// 调用实际参数的shout()方法
	}
}
