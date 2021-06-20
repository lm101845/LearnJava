package cn.itcast.day07.demo01;
/**
 *作者：李明
 *日期： 2018年11月26日 
 *看的遍数：1
 *
 * 字符串对象在内存中一旦被创建，那么内容不可以被改变
 * 字符串是常量；它们的值在创建之后不能更改。字符串缓冲区支持可变的字符串。因为 String 对象是不可变的，所以可以共享
 * 
 * 字符串的内容不会发生改变，每当你觉得好像变了的时候，一定是创建了新的字符串
 */
public class Demo05StringEternal {
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		
		str = "World";				//str只不过是存放地址的变量，它里面变得不是字符串，而是存放字符串的地址值
		System.out.println(str);
		
		String str2 = "Love";
		str2 += " Java";
		System.out.println(str2);
	}

}
