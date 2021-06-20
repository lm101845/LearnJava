package ziFuChuan;

/**
 * @姓名 李明
 * @日期 2018年11月5日下午7:33:35
 * 
 *     String类：不可变字符序列
 * 
 *     一、Java String 类——String字符串常量
 * 
 *     字符串广泛应用 在Java 编程中，在 Java 中字符串属于对象，Java 提供了 String 类来创建和操作字符串。
 * 
 *     需要注意的是，String的值是不可变的，这就导致每次对String的操作都会生成新的String对象，这样不仅效率低下，
 *     而且大量浪费有限的内存空间。
 * 
 */
public class TestString {
	public static void main(String[] args) {
		String str1 = new String("abcd");
		String str2 = new String("abcd");

		System.out.println(str1.charAt(2));

		System.out.println(str2.equals(str1)); // 比较内容是否相等 true
		System.out.println(str2 == str1); // false

		String str3 = "def";
		String str4 = "def";
		System.out.println(str3.equals(str4)); // true
		System.out.println(str3 == str4); // true

		System.out.println(str3.indexOf('e'));

		String s = str1.substring(0);
		System.out.println(s);

		String str5 = str3.replace('e', '*');
		System.out.println(str5);

		String str6 = "abcde,rrtt,ccceee";
		String[] strArray = str6.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		String str7 = "  a abb  dk gh";
		String str8 = str7.trim(); // 去除收尾空格，中间空格不去
		System.out.println(str8.length());

		System.out.println("ABc".equalsIgnoreCase("abC")); // 忽略大小写
		System.out.println("Abcbd".indexOf('b')); // 从左往右找
		System.out.println("Abcbd".lastIndexOf('b')); // 从右往左找
		System.out.println("Abcbd".startsWith("Ab")); // 是不是以Ab开头
		System.out.println("Abcbd".endsWith("bd")); // 是不是以bd结尾
		System.out.println("ALGKDG".toLowerCase()); // 转小写
		System.out.println("sldjglgjk".toUpperCase()); // 转大写
		System.out.println("===============================");

		// String gh = "a"; //一共有11个对象
		// String gh1 = new String("a"); //一共有12个对象
		StringBuilder gh = new StringBuilder("a"); // 数组长度初始化为17（16+1）
		for (int i = 0; i < 1000; i++) {
			// gh += i;
			gh.append(i);
		}
		System.out.println(gh);
		/*
		 * 不是说String类：不可变字符序列，怎么gh的值改了呢？因为gh的地址值是不可变的， 但是它指向的内容是可以改变的
		 */
	}

}
