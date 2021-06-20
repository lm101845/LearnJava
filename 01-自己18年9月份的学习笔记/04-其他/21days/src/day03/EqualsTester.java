package day03;
/*
 * == 和！==用于“对象”时，这些运算符的功能并不是检查一个对象的“值”是否与另一个对象相同，而是判断运算符两边引用的是否是同一个对象

对象（object)也叫实例（instance）
数字和字符基本数据类型创建数字和字符，但为提高效率，它们不是对象。在第五章中，您将学习如何使用对象来表示基本类型值
*/
 class EqualsTester {
	 public static void main(String[] args) {
		String str1 , str2;
		str1 = "123";
		str2 = str1;			//现在str1 和str2指向同一个对象
		
		System.out.println("String1:" + str1);
		System.out.println("String2:" + str2);
		System.out.println("Same object?" + (str1 = str2));
		
		str2 = new String(str1);		//创建了一个新的String对象（其值与str1)相同，并赋给str2		
		
		System.out.println("String1:" + str1);
		System.out.println("String2:" + str2);
		System.out.println("Same object?" + (str1 == str2));		//此时二者指向了不同的对象
		System.out.println("Same object?" + str1.equals (str2));
		
		
	}
}
