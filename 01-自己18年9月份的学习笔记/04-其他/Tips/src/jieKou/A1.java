package jieKou;

/**
 * @姓名 李明
 * @日期 2018年11月5日上午9:08:41
 * 
 *     接口（Interface），在JAVA编程语言中是一个抽象类型，是抽象方法的集合。接口通常以interface来声明。一个类通过继承接口的方式，
 *     从而来继承接口的抽象方法。
 * 
 *     如果一个类只由抽象方法和全局常量组成，那么这种情况下不会将其定义为一个抽象类。只会定义为一个接口，
 *     所以接口严格的来讲属于一个特殊的类，而这个类里面只有抽象方法和全局常量，就连构造方法也没有。
 * 
 *     范例：定义一个接口
 * 
 */
public interface A1 { // 定义一个接口
	public static final String MSG = "hello";// 全局常量

	public abstract void print();// 抽象方法
}
