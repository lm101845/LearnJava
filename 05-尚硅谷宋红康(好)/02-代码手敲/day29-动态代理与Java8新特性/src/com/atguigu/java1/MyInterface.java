package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/8/20 15:40
 **/

//显式的声明这个接口是一个函数式接口，不加的话，它也算！！
//只有一个抽象方法的接口，就叫做函数式接口
//Lambda表达式的本质：作为函数式接口的实例
@FunctionalInterface
public interface MyInterface {
    void method1();
}
