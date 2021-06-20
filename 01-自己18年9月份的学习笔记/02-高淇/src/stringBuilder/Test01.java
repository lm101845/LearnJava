package stringBuilder;

/**
 * @姓名 李明
 * @日期 2018年11月5日下午9:08:46
 * 
 *     测试可变字符序列：StringBuilder(线程不安全，效率高-一般用这个)，StringBuffer(线程安全，效率低)
 *     String:不可变字符序列
 * 
 * 
 *     当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
 * 
 *     和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
 * 
 *     StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder
 *     的方法不是线程安全的（不能同步访问）。
 * 
 *     由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder
 *     类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // 字符数组长度初始为16
		StringBuilder sb1 = new StringBuilder(32); // 字符数组长度初始为32
		StringBuilder sb2 = new StringBuilder("abcd"); // 字符数组长度初始为32, value[] = {'a','b','c','d',\u0000,\u0000..}
		sb2.append("efg");
		sb2.append(true).append(321).append("随便"); // 通过return this实现方法链

		System.out.println(sb2);

	}

}
