package homework;
/*
 *int 是基本类型，Integer是引用类型。。
    比如int a= 5；
      Integer b = 5
对于a你只能用来做计算。。比如加减乘除。。
b你可以用来做很多事情，因为他是一个对象，他有很多方法，你可以像使用String对象那样使用它。

int 是基本类型，直接存数值，而integer是对象，用一个引用指向这个对象
 */
public class IntegerTest {
	public static void main(String[] args) {
		
		Integer a=100;
		Integer b=100;
		Integer c=500;
		Integer d=500;
				
		System.out.println(a == b);  
		System.out.println(c == d);
	}
}
