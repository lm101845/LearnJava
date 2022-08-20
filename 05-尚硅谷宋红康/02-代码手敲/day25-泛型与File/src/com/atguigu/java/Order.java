package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liming
 * @Date 2022/8/6 19:17
 **/
public class Order<T> {
    String orderName;
    int orderId;
    //类的内部结构就可以使用类的泛型
    T orderT;   //这个参数只有在实例化的时候才指明是什么类型的，定义的时候还不知道
    public Order(){
        //T[] arr = new T[10];   //这样写编译不通过
        T[] arr = (T[]) new Object[10];   //这样写编译过了
    };
    public Order(String orderName,int orderId,T orderT){
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }

    //如下的三个方法都不是泛型方法
    public T getOrderT(){
        return orderT;
    }

    public void setOrderT(T orderT){
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

//    public static void show(T orderT){
//        System.out.println(orderT);
//        //Non-static field 'orderT' cannot be referenced from a static context
//        //原因：类的泛型是造对象的时候定义的，而静态结构是早于对象的创建
//    }

    public void show(){
        //编译不通过
//        try{
//        }catch(T t){
//
//        }
    }

    //泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系。
    //换句话说，泛型方法所属的类是不是泛型类都没有关系。
    //泛型方法，可以声明为静态的。原因：泛型参数是在调用方法时确定的。并非在实例化类时确定。
    public static <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list= new ArrayList<>();
        for(E e : arr){
            list.add(e);
        }
        return list;
    }
}
