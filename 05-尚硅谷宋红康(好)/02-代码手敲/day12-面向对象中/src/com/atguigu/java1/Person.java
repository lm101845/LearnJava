package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/18 0:12
 **/
public class Person {
    String name;
    int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void walk(int distance){
        System.out.println("走路，走的距离是" + distance + "公里");
        show();    //在public权限的walk方法中间使用private权限的show方法
        eat();
    }

    private void show(){
        System.out.println("我是一个人");
    }

    public Object info(){
        return null;
    }

    public double info1(){
        return 1.0;
    }
}
