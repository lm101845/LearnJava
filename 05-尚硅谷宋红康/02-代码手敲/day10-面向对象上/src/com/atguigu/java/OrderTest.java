package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/15 12:25
 **/
public class OrderTest {
    public static void main(String[] args) {
        //我们要调用还得通过类的对象来调用
        Order order = new Order();
        order.orderDefault = 1;
        order.orderPublic = 2;
        //出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 3;//The field Order.orderPrivate is not visible

        order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();//The method methodPrivate() from the type Order is not visible
    }
}
