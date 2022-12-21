package src.exer;

/**
 * @Author liming
 * @Date 2022/6/4 20:03
 **/

/**
 * 2.利用面向对象的编程方法，设计类Circle计算圆的面积。
 */
//测试类
public class CircleTest {
    public static void main(String[] args) {
        //我们现在在main方法中调用别的方法，必须是非静态的，你得先造对象才能调用
        Circle c1 = new Circle();
        c1.radius = 2;

        //方式一：
//        double area = c1.findArea();
//        System.out.println(area);

        //方式二：
        c1.findArea();
    }
}

//圆
class Circle{
    //属性
    double radius;

    //求圆的面积——不需要定义半径参数，类的属性里面就有属性
    //方式一：
//	public double findArea(){
//		double area = Math.PI * radius * radius;
//		return area;
//	}

    //方式二：
    public void findArea(){
        double area = Math.PI * radius * radius;
        System.out.println("面积为：" + area);
    }

    //错误情况：
//	public double findArea(double r){
//		double area = 3.14 * r * r;
//		return area;
//	}
}
