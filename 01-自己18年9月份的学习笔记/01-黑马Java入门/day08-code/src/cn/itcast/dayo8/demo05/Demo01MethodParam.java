package cn.itcast.dayo8.demo05;
/**
 *  作者：李明
  * 日期： 2018年12月1日 下午3:47:56
  * 看的遍数：1
 * 
 * 方法的参数可以是什么类型？
 * 1.基本类型
 * 2.数组
 * 3.字符串
 * 4.自定义的类
 * 
 * 结论：所有的数据类型都可以作为方法的参数类型
 * 
 */
public class Demo01MethodParam {
	
	public static void main(String[] args) {
		
		method1(100);
		System.out.println("===============================");
		
		int[] arr = {10, 20, 30};
		method2(arr);			//数组arr保存的是个地址值
		System.out.println("===============================");
		
		method3("how do you do?");
		System.out.println("===============================");
		
		Student xuesheng = new Student("赵丽颖" ,20);
		method4(xuesheng);
	}
	
	//使用基本类型作为方法的参数：可以
	public static void method1(int num) {
		num += 20;
		System.out.println(num);
		System.out.println("================================");
	}
	
	//使用数组作为方法的参数，也可以
	public static void method2(int[] array) {
		System.out.println(array[0]);   //10
		System.out.println(array[1]);	//20
		System.out.println(array[2]);	//30
		System.out.println("================================");
	}
	
	//使用字符串作为方法的参数：还可以
	public static void method3(String str) {
		String result = str.replace("o", "*");
		System.out.println(result);    //h*w d* y*u d*?

	}
	
	//使用自定义的类作为方法的参数，照样可以
	public static void method4(Student stu) {
		System.out.println("姓名: " + stu.getName() + ",年龄:" + stu.getAge());
		
	}
}
