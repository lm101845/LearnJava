package com.atguigu.exer1;

/**
 * @Author liming
 * @Date 2022/6/19 0:52
 **/
public class Circle extends GeometricObject{
    private double radius;
    //此时Circle默认的是空参构造器，父类中没有空参构造器，就会报错
    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }
}
