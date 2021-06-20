package changYongLei;

/**
 * @姓名 李明
 * @日期 2018年11月6日下午2:49:38
 * 
 *     为什么需要包装类？
 *     Java并不是纯面向对象的语言，java语言是一个面向对象的语言，但是java中的基本数据类型却是不面向对象的，但是我们在实际使用
 *     中经常需要将基本数据转换成对象，便于操作。比如：集合的操作中。这时，我们就需要经基本数据类型转换成对象！
 * 
 *     包装类（wrapper class)均位于java.lang包中（系统会自动导入）
 * 
 * 
 *     intValue()是把Integer对象类型变成int的基础数据类型；
 * 
 *     parseInt()是把String 变成int的基础数据类型；
 * 
 *     Valueof()是把给定的String参数转化成Integer对象类型；（现在JDK版本支持自动装箱拆箱了。）
 *     intValue()用法与另外两个不同，比如int i = new Integer("123"), j = i.intValue();
 *            相当于强制类型转换（强制类型转换事实上就是调用的这个方法）。  另外两个用法： Integer.Valueof() ，
 *      Integer.parseInt() 用的是Interger类名。i.intValue()用的是对象i
 *    
 *     另外， Integer a=new Integer(1)
 * 
 *     Integer a=Integer.valueOf(1);
 * 
 *     两个都是得到一个Integer对象，但是Integer.valueOf的效率高。
 * 
 */
public class BaoZhuangLei {

	public static void main(String[] args) {
		Integer i = new Integer(1000);

		System.out.println(Integer.MAX_VALUE); // 求Integer最大的数21亿多

		System.out.println(Integer.toHexString(i)); // 把变量转成16进制的
		Integer i2 = Integer.parseInt("234"); // 把字符串转成数字
		// Integer i2 = Integer.parseInt("2好4"); //这样不行

		Integer i3 = new Integer("333"); // 直接new也行，也可以把一个字符串转成数字
		System.out.println(i3);

		System.out.println(i2.intValue());
		
		String str = 235 + "";
		System.out.println(str);   //数字转字符串

	}
}
