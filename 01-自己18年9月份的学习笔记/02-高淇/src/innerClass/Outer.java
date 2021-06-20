package innerClass;

import innerClass.Face.Nose;

/**
 * @姓名 李明
 * @日期 2018年11月5日下午5:11:03
 * 
 * 内部类：
 * 1.定义：一般情况，我们把类定义成独立的单元。有些情况下，我们 把一个类放在另一个类的内部定义，成为内部类。
 * 
 * 2.内部类的作用：
 * a.内部类提供了更好的封装，只能让外部类直接访问，不允许同一个包中的其他类直接访问
 * b.内部类可以直接访问外部类的私有属性，内部类被当成其外部类的成员。但外部类不能访问内部类的内部属性。
 * 
 * 3.内部类的使用场合：
 * 通常内部类在只为所外外部类提供服务的情况下优先使用
 * 
 */
public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Nose n = f.new Nose();
		n.breath();
		Face.Ear e = new Face.Ear();	
		e.listen();
	}

}

class Face{
	int type;
	String shape = "瓜子脸";
	static String color = "红润";
	
	class Nose{
		 String type;
		 
		 void breath() {
			 System.out.println(Face.this.type);
			 System.out.println("呼吸");
			 
		 }
	}
	
	static class Ear{
		void listen() {
			//System.out.println(shape);
			System.out.println(color);
			System.out.println("听");
		}
	}
}