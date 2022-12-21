package com.exer1;

/**
 * @Author liming
 * @Date 2022/6/14 17:23
 **/
/**
 * 定义一个Circle类，包含一个double型的radius属性代表圆的半径，
 * 一个findArea()方法返回圆的面积。
 *
 */
public class Circle {
    double radius;//半径

    //求圆的面积
    //这个函数不要写参数！！用成员变量
    public double findArea(){
        return Math.PI * radius * radius;
    }
}

