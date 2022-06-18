package com.atguigu.java4;

/**
 * @Author liming
 * @Date 2022/6/18 15:00
 **/
public class Man extends Person{

    boolean isSmoking;

    int id = 1002;

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk(){
        System.out.println("男人霸气的走路");
    }
}
