package cn.itcast.day07.demo02;
/**
 * 作者：李明
 * 日期： 2018年11月26日 
 * 看的遍数：1
 * 
 * 如何进行字符串内容的比较？
 * 如果使用==进行比较，那么是进行地址值的相同判断
 * 如果就是希望进行字符串的内容比较，则需要使用String当中的成员方法
 * 
 * public boolean equals (Object obj):进行字符串的内容比较，严格区分大小写。参数obj就是另一个对象（跟谁比）
 * object也是一种类型，可以接收任何类型的数据
 * 
 * public boolean equalsIgnoreCase(String str):进行字符串的内容比较，但是忽略大小写
 * 
 * 注意事项：
 * 1.要想进行字符串的内容比较，一定要使用equals方法，不要使用==运算
 * 2.equals方法具有对称性，a.equals(b) 和 b.equals(a)效果一样
 * 3.小技巧：如果equals方法需要比较的两个字符串当中，有一个是常量，那么尽量将常量写在前面
 * 调用方法的时候，对象名当中如果存储的是null值，那么将会发生"空指针异常"，NullPointerException
 * 4.直接写上的双引号就是字符串对象，所以用双引号直接点儿也能调用方法   System.out.println("hello".equals("Hello"));  
 */
public class Demo01StringEquals {
	
	public static void main(String[] args) {
		
		char[] array = {'a', 'b' ,'c'};     //全新的
		String str1 = new String(array);
		
		String str2 = "abc";    //在池里
		System.out.println(str1 == str2);     //false
		
		//进行内容比较应该使用equals方法
		//拿着str1和str2进行内容比较
		boolean same =str1.equals(str2);
		System.out.println(same);    //true
		System.out.println(str2.equals(str1));    //true
		System.out.println("===================================");
		
		String str3 = null;
		//System.out.println(str3.equals("abc"));   //错误写法，可能会发生异常
		System.out.println("abc".equals(str3));   //true   推荐这个
		System.out.println("===================================");
		
		String str4 = "HELLO";
		String str5 = "hello";
		System.out.println(str4.equals(str5));   //false
		System.out.println(str4.equalsIgnoreCase(str5));  //true   忽略大小写
 		
	}

}
