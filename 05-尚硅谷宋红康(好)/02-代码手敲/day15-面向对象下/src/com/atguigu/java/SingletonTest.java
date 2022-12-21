package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/22 12:48
 **/
public class SingletonTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.instance;
//        Bank.instance = null;
        //静态方法如果是public的话，就暴露出去了调用和修改的功能。你可以这么写，破坏那唯一的一个单例——所以就不好
        //你可以写final
        Bank bank2 = Bank.instance;
        System.out.println(bank1 == bank2);

    }
}

class Bank{
    //私有化构造器
    private Bank(){

    }

//    private static Bank instance = new Bank();
//    public static Bank instance = new Bank();
    public static final Bank instance = new Bank();
}
