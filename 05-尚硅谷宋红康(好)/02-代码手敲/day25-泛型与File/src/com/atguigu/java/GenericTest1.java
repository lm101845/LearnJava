package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/8/6 19:23
 **/

import org.junit.Test;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

/** 如何自定义泛型结构：泛型类、泛型接口；泛型方法。
 *
 * 1. 关于自定义泛型类、泛型接口：
 */
public class GenericTest1 {
    @Test
    public void test1(){
        Order order = new Order();
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明类的泛型。
        order.setOrderT(123);
        order.setOrderT("abc");

        //建议：实例化时指明类的泛型
        Order<String> order1 = new Order<>("orderAA",1001,"order:AA");
        order1.setOrderT("AA:hello");
    }

    @Test
    public void test2(){
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        sub1.setOrderT(111);
        //sub1.setOrderT("222");

        SubOrder1<String> sub2 = new SubOrder1<>();  //类型推断,后面的<>里面就不用写泛型了
        sub2.setOrderT("order2xxxxxx");

//        SubOrder1<Number> sub3 = new SubOrder1<>();
//        sub2.setOrderT(123);
    }

    @Test
    public void test3(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 =  new ArrayList<Integer>();
        //泛型不同的引用不能相互赋值。
        //list1 = list2;

        Person p1 = null;
        Person p2 = null;
        p1 = p2;
    }

    //测试泛型方法
    @Test
    public void test4(){
        Order<String> order = new Order<>();
        Integer[] arr = {1, 2, 3, 4};
        //泛型方法在调用时，指明泛型参数的类型。
        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println(list);
    }
}
