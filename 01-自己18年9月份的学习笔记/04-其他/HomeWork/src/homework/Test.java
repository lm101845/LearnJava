package homework;
/*
 * 1.与其他语言不同，Java语言不允许编程人员选择采用值传递还是引用传递来传递参数。基本数据类型总是采用值传递。
 * 不能把对象传递给方法，而只能传递对象的引用。引用本身也是采用值传递----将引用的拷贝传递给方法。当方法收到对象的应用后，
 * 他就可以直接操作这个对象。
2.当通过return语句从方法返回信息时，基本数据类型的变量总是以值的形式返回（即返回拷贝），而对象总是以应用的方式返回。
方法调用过程：
1.为调用方法的内存中开辟空间。
2.将实参传递给形参。
3.程序流程跳转到方法里，并执行方法。
4.执行完方法，程序流程跳转到main方法，带回返回值如果有的话，为方法开辟的空间被销毁。
Example:

---------------------
 */
public class Test {
	public static void main(String args[]) {
		int a = 10, b = 20;
		String str1 = "abc";
		String str2 = "def";
		swap(a, b);
		swap(str1, str2);
		System.out.println(a + "/t" + b);
		System.out.println(str1 + "/t" + str2);
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void swap(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
	}
}