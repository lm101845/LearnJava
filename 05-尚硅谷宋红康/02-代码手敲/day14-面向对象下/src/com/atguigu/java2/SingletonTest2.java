package com.atguigu.java2;

/**
 * @Author liming
 * @Date 2022/6/21 19:10
 **/

/**
 * 单例模式的懒汉式实现
 *
 */
public class SingletonTest2 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }
}

class Order{
    //1.私有化类的构造器
    private Order(){

    }

    //2.声明当前类对象，没有初始化
    //4.此对象也必须声明为static的
    private static Order instance = null;   //懒：刚开始就给你一个空的，等你用了我才给你造一个

    //3.声明public、static的返回当前类对象的方法
    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}
