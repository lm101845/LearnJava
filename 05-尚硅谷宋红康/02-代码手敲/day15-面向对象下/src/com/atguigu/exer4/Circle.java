package com.atguigu.exer4;

/**
 * @Author liming
 * @Date 2022/6/23 18:48
 **/

/**
 * 定义一个Circle类，声明radius属性，提供getter和setter方法

 */

public class Circle {
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    public Circle(Double radius) {
        super();
        this.radius = radius;
    }
}
