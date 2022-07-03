package com.atguigu.java2;

/**
 * @Author liming
 * @Date 2022/7/1 16:51
 **/

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 *
 */
public class BankTest {
}

class Bank{
    //构造器私有化
    private Bank(){}
    private static Bank instance = null;
    //静态的同步方法，它的锁就是Bank.getClass——类本身也充当了对象
//    写法1：
//    public static synchronized Bank getInstance(){
    public static  Bank getInstance(){
        //写法2：效率稍差
//        synchronized (Bank.class){
//            if(instance == null){
//                instance = new Bank();
//            }
//            return instance;
//        }

        //写法3：效率更高。前1,2,3个线程可能同时进去，但是后来的那些线程就不会了，instance被前面的线程给改了
        if(instance == null){
            synchronized (Bank.class){
                if(instance == null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}