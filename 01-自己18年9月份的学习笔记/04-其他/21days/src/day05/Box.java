package day05;

import java.awt.Point;

/*
 * @姓名 李明
 * @日期 2018年10月30日下午4:27:01
 * 
 * 构造函数不能被直接调用
 * 
 * 使用new来创建类的实例时，java完成下述三项工作：
 * 1.为对象分配内存
 * 2.初始化对象的实例变量
 * 3.调用类的构造函数
 * */
class Box {
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;

	Box buildBox(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		return this;
	}

	Box buildBox(Point topLeft, Point bottomRight) {
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = bottomRight.x;
		y2 = bottomRight.y;
		return this;
	}

	Box buildBox(Point topLeft, int w, int h) {
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = (x1 + w);
		y2 = (y1 + h);
		return this;
	}

	void printBox() {
		System.out.print("Box: <" + x1 + ", " + y1);
		System.out.println(", " + x2 + ", " + y2 + ">");
	}

	public static void main(String[] arguments) {
		Box rect = new Box();

		System.out.println("Calling buildBox with " + "coordinates (25,25) and (50,50):");
		rect.buildBox(25, 25, 50, 50);
		rect.printBox();

		System.out.println("\nCalling buildBox with " + "points (10,10) and (20,20):");
		rect.buildBox(new Point(10, 10), new Point(20, 20));
		rect.printBox();

		System.out.println("\nCalling buildBox with " + "point (10,10), width 50 and height 50:");

		rect.buildBox(new Point(10, 10), 50, 50);
		rect.printBox();
	}
}
