package changYongLei;

/**
 * @姓名 李明
 * @日期 2018年11月6日下午3:37:02
 * 
 * 自动装箱(auto-boxing)：
 * 基本类型就自动的封装到与它相同类型的包装中，如：
 * Integer i = 10;
 * 本质上是，编译器为我们添加了：
 * Integer i = new Integer(10);
 * 
 * 自动拆箱：
 * 包装类对象自动装换成基本数据类型，如：
 * int a = new Integer(10);
 * 本质上，编译器为我们添加了：
 * int a = new Integer(10).intvalue(); 
 * 
 *
 * 
 */
public class ZiDongZhuangXiang {

	public static void main(String[] args) {
		
//		Integer a = new Integer(1000);
		Integer a = 1000;  //jdk5.0之后 .  自动装箱，编译器帮我们改进代码：Integer a = new Integer(1000);
		
		Integer b = null;    //对象没有，空指针，你去调它的方法，所以报错
		//Exception in thread "main" java.lang.NullPointerException
		//int c = b;  //自动拆箱，编译器改进：b.intValue();
		
		//System.out.println(c); 
		
		Integer  d1 = 1234;
		Integer  d2 = 1234;
		
		System.out.println(d1==d2);		//false
		System.out.println(d1.equals(d2));		//true
		
		System.out.println("=================================="); 
		Integer d3 = -100;    //[-128,127]之间的数，仍然当做基本数据类型来处理,可以提高效率。
		Integer d4 = -100;
		System.out.println(d3==d4);		//true
		System.out.println(d3.equals(d4));		//true
		
		
	}
}

