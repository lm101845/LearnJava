package keyWord01;
/*
 * .在Java中每个类都默认继承Object类，除非声明继承某个类。而Object类中有一个叫做toString的方法。
 * 该方法返回的是该Java对象的内存地址经过哈希算法得出的int类型的值在转换成十六进制。
 * 这个输出的结果可以等同的看作Java对象在堆中的内存地址。
 */

public class Test01 {
	public static void main(String[] args){
		
		Object o1 = new Object();
		System.out.println(o1.toString());    //java.lang.Object@7b1d7fff
	}
}
