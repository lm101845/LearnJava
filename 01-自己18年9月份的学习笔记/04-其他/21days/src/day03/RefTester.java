package day03;
import java.awt.Point;
/*
 * 对处理对象而言，理解引用（！！！）至关重要。引用是一个地址，它指明了对象的（变量和方法）的存储位置
 * 将对象赋给变量或将其参数传递给方法时，您实际上并没有引用对象。您甚至没有使用对象的拷贝，您使用的是对象的引用
 * 
 * 在java中，没有C和C++中那样的显示指针和指针算术，然而，使用引用和java数组，可以实现大多数指针功能，同时避免了指针的众多缺点
 * 
 * 类方法：可用来将通用的方法集中起来，放在一个地方（即类中）。例如，在java.lang包中定义的类Math,将大量的数学运算作为类方法。
 * 不能创建（new）对象，但您可以使用它的类方法，并将数字和布尔值作为参数
 * 
 * 句点表示法被用来调用类方法。与类变量一样，句点的左边可以是类实例或类本身。然而，基于讨论类变量时提到的原因，使用类名（!)将
 * 使代码更容易阅读
 * 
 */
 class RefTester {
	 public static void main(String[] args) {
		 
		Point pt1;
		Point pt2;
		pt1 = new Point(100, 100);
		pt2 = pt1;	  //这行让pt2引用pt1,而不是将pt1的拷贝赋给pt2
		
		//pt1 = new Point(100, 100);
		//pt2 = new Point(100, 100);
		//要让pt1和pt2指向不同的对象，可以分别使用new Point语句来创建不同的对象
		
		pt1.x = 200;
		pt1.y = 200;
		System.out.println("Point1:" + pt1.x + " , " + pt1.y);   //200,200
		System.out.println("Point2:" + pt2.x + " , " + pt2.y);	//200,200
		System.out.println("============================================");
		//输出结果二者一样。pt2的变量x和y也被修改了，虽然在程序中没有对它们做任何显式的修改
		//这是因为在第12行让pt2引用了pt1,而不是将pt1的拷贝赋给pt2
		
		
		//System.out.println("Point1:" + pt1.x + " , " + pt1.y);
		//System.out.println("Point2:" + pt2.x + " , " + pt2.y);
		
	}

}
