package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/22 18:35
 **/

/**
 * abstract使用上的注意点：
 * 1.abstract不能用来修饰：属性、构造器等结构——方法可以重写，构造器不能重写，只能重载
 *
 * 2.abstract不能用来修饰私有方法、静态方法、final的方法、final的类
 *  (声明为private的方法是不能够被重写的)
 *  父类和子类都有一个同名同参数的静态方法，不认为是重写(覆盖)
 *  子类和父类中的同名同参数的方法要么都声明为非static的(考虑重写)，要么都声明为static的(不是重写)
 */
public class AbstractTest1 {
}
