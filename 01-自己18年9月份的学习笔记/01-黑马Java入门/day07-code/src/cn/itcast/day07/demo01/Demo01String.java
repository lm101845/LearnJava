package cn.itcast.day07.demo01;
/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1
 *
 * java当中的数据类型只有两种：基本类型、引用类型
 * 基本类型就是8个关键字，只要不是这八者之一，那么剩下的全都叫引用类型，所以字符串就是一种引用类型
 * 
 * 注意，只要是字符串，就是一个对象！
 * 
 * 字符串就是一个java.lang.String的对象，里面也可以包含三个部分
 * 1.成员变量
 * 2.构造方法
 * 3.成员方法
 * 
 * 
 */
public class Demo01String {
	
	public static void main(String[] args) {
		
		int[] array = new int[5];
		//动态初始化一个数组，这就是创建了一个对象。数组就是一个对象
		
		//静态初始化一个数组，也照样是对象
		int[] array2 = {10 , 20, 30};
		
		//字符串直接写上双引号，就是一个String类型的对象！String就是类名称
	}

}
