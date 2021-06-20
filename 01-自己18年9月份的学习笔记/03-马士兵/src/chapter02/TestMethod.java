package chapter02;
//每一个i都在各自的大括号里定义，互相之间不产生冲突
public class TestMethod {
	public static void main(String[] args) {	//我们的总车间是main方法，其他的方法是分车间									
		m();			//这里是m方法的定义
		m2(2);
		m3('3', 4);		//可以这样写，字符3会转换成int类型的ASCII码
		m4(4, 6);
		int i = m4(4, 6);		//这是一个表达式，这个表达式是一个方法的调用，这个表达式的定义是：这个方法返回什么样的值，这个表达式就是什么值
		System.out.println(i);
	}
	
	public static void m() {		//m方法的调用
		//return;					//return的意思是，当方法执行到这里的时候，二话不说方法返回（结束）
		System.out.println("ok");
		System.out.println("hello");
	}
	
	public static void m2(int i) {		//事先约定好车间需要的料是圆柱形的（int型） 
		if(i > 3) 
			return;
		System.out.println(i);		//如果i大于3，return。其他的情况把i打印出来 
	}
	
	public static void m3(int i, int j) {			//一个车间有2个进货口，很正常
		System.out.println(i + j);
	}
	
	public static int m4(int i, int j) {
		return i > j ? i : j;		//i 和 j比大小，谁大返回谁      这个方法有返回值，但是你可以不用这个返回值
	}

}
