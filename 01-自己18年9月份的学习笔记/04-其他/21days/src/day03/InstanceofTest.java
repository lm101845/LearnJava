package day03;
/*
 * 1.instanceof运算符的前一个操作数通常是一个引用类型变量，后一个操作数通常是一个类
 * （也可以是接口，可以把接口理解成一种特殊的类），它用于判断前面的对象是否是后面的类，
 * 或者其子类、实现类的实例。如果是，则返回true，否则返回false。
2.在使用instanceof运算符时需要注意：instanceof运算符前面操作数的编译时类型要么与后面的类相同，
要么与后面的类具有父子继承关系，否则会引起编译错误。

 */
class BaseClass{}
class SubClass extends BaseClass{}
 
public class InstanceofTest
{
	public static void main(String[] args)
	{
		//声明hello时使用Object类，则hello的编译类型是Object
		//Object是所有类的父类，但hello变量的实际类型是String
		Object hello = "Hello";
		System.out.println("字符串是否是Object类的实例:"+(hello instanceof Object));
		System.out.println("字符串是否是String类的实例:"+(hello instanceof String));
		System.out.println("字符串是否是Math类的实例:"+(hello instanceof Math));
		System.out.println("字符串是否是Comparable接口的实例:"+(hello instanceof Comparable));
		String a = "hello";
		//System.out.println("字符串是否是Object类的实例:"+(a instanceof Math));
 
		BaseClass b = new BaseClass();
		SubClass aa = new SubClass();
		System.out.println(aa instanceof BaseClass);
	}
}
