package day02;
/*
 * 变量分为三种：
 * 1.静态变量（类变量static variable)-------活的时间最久
 * 使用static定义。从属于类，生命周期伴随类始终，从类加载到卸载
 * 
 * 2.成员变量（也叫实例变量 member varible)-----活的时间一般
 * 方法外部、类的内部定义的变量。从属于对象，生命周期伴随对象始终
 * 
 * 3.局部变量（local variable)---活的时间最短
 * 方法或语句块内部定义的变量。生命周期是从生命位置开始到方法或语句块执行完毕为止
 * 
 */
public class TestVarible {
	
	int a;  //成员变量，从属于对象；  成员变量会自动被初始化
	static int size;  //静态变量，从属于类
	
	public static void main(String[] args) {
		
		{
			int age;      //在大括号里面的就是语句块
			age = 18;
		}
	}

}
