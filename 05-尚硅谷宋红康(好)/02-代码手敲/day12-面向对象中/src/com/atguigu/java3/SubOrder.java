package com.atguigu.java3;

import com.atguigu.java2.Order;

/**
 * @Author liming
 * @Date 2022/6/18 11:37
 **/
public class SubOrder extends Order {
    //这是在不同包里面的子类了
    //虽然不是同一个包了，但还是你的子类
    public void method(){
        //我是你的子类，你所有的方法都能继承，但是因为一些权限的影响，虽然继承了，但是用不了
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
//        orderDefault = 3;
//        orderPrivate = 4;
//
//        methodDefault();
//        methodPrivate();
    }
}
