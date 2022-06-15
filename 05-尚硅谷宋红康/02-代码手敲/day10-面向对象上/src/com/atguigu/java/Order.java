package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/15 12:25
 **/
public class Order {
//class Order {
    private int orderPrivate;   //private——只能用在内部类
    int orderDefault;           //缺省——可用于内部类和同一个包
    public int orderPublic;     //pubilc——可用于整个项目
    //default以后再讲——可用于不同包的子类

    //我们在类的方法内调用这三个属性，都是可以调用的
    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}
