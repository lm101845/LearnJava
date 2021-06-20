package yiChang;

import java.util.Scanner;

/**
 * @姓名 李明
 * @日期 2018年11月6日下午9:44:45
 * 
 * java异常是java提供的用于处理程序中错误的一种机制
 * 
 * java是采用面向对象的方式来处理异常的。处理过程：
 * 
 * 抛出异常：在执行一个方法时，如果发生异常，则这个方法生成代表该异常的一个对象，停止当前执行路径，
 * 并把异常对象提交给JRE。
 * 
 * 捕获异常：JRE得到该异常后，寻找相应的代码来处理该异常。JRE在方法的调用栈中查找，从生成异常的方法
 * 开始回溯。直到找到相应的异常处理代码为止。
 * 
 * 所有异常对象都是派生于Throwable类的一个实例。如果内置的异常类不能满足需要，还可以创建自己的异常类
 * 
 * try:
 * try语句指定了一段代码，该段代码就是一次捕捉并处理的范围。在执行过程中，当任意一条语句产生异常时，
 * 就会跳过该段中后面的代码。代码中可能会产生并抛出一种或几种类型的异常对象，它后面的catch语句要分别
 * 对这些异常做相应的处理。
 * 
 * 一个try语句必须至少带有一个catch语句块  或  一个finally语句块(二者至少要有其一）
 * 
 * 注：当异常处理的代码执行结束以后，是不会回到try语句去执行尚未执行的代码
 * 
 * 
 * finally:
 * 有些语句，不管是否发生了异常，都必须要执行，那么就可以把这样的语句放到finally语句块中
 * 通常在finally中关闭程序块已打开的资源，比如:文件流、释放数据库连接等
 * 
 */
public class TestException {
	public static void main(String[] args) {
		/*int i = 1/0;    //这是unchecked exception,编译器没有检查，直接过--不检查是这样的异常太平常
		//车在形式，前面路断了，需要在行使手册上写应该怎么办；但是比如绕左道，绕右道没有必要写
		
		try {
			Thread.sleep(3000);		//程序暂停3秒钟     这是checked exception(已被编译器检查过的ex)
		} catch (InterruptedException e) {
			e.printStackTrace();    打印堆栈轨迹
		} finally{
		System.out.println("aaa");    
		}*/   
		
		/*Computer c = null;    //这个变量栈里面有，但是没有值
		if(c!=null) {  //遇到空指针，通常前面加个判断
		c.start();			//java.lang.NullPointerException   对象是空的，调用了对象的方法和属性
		}*/
		
		/*Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(a);
		*/
		String str = "1234abcd";
		Integer i = new Integer(str);    //java.lang.NumberFormatException
		System.out.println(i);
	}

}

class Computer{
	void start() {
		System.out.println("计算机启动！");
	}
}
