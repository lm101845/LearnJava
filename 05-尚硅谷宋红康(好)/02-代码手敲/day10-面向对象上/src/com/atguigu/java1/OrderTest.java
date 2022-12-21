package com.atguigu.java1;

import com.atguigu.java.Order;
//如果这个Order类权限是缺省的，那么我这个包就引入不了这个类了

/**
 * @Author liming
 * @Date 2022/6/15 12:35
 **/

//我们在不同的包下，类名可以取的一样，比如java包下也有一个OrderTest类，我们这里也叫OrderTest，但不会冲突
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderPublic = 2;
        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.orderDefault = 1;
        // order.orderPrivate = 3;//The field Order.orderPrivate is not visible

        order.methodPublic();
        // 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
//		order.methodDefault();
        // order.methodPrivate();//The method methodPrivate() from the type Order is not visible
    }
}
