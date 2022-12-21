package com.atguigu.java2;

/**
 * @Author liming
 * @Date 2022/6/21 19:02
 **/

/**
 * 单例设计模式：
 * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
 *
 * 2. 如何实现？
 * 	 饿汉式  vs 懒汉式
 *
 * 3. 区分饿汉式 和 懒汉式
 *   饿汉式：
 *   	坏处：对象加载时间过长。
 *   	好处：饿汉式是线程安全的(银行卡里5000元，你用支付宝取，你老婆用微信取，你取的时候系统查询到卡里确实有5000，还没取出的时候，同时你老婆也在取，
 *      系统又查询到卡里有5000，最终你们2个都取了5000，银行哭了，损失5000)
 *
 *   懒汉式：好处：延迟对象的创建。——饿汉式早早就把对象创建好了，但我可能先不用，会浪费一些空间
 * 		  目前的写法坏处：线程不安全。--->到多线程内容时，再修改
 *
 *
 */
public class SingletonTest {
    public static void main(String[] args) {
//        构造器私有化了之后，就不能在Bank类外面创建对象了，只能在Bank类里面造了
//        Bank bank1 = new Bank();
//        Bank bank2 = new Bank();

        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}

//银行类式单例的，则要求这个类只能造一个对象
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }

    //2.内部创建类的对象
    private static Bank instance = new Bank();
    //4.要求此对象也必须声明为静态的
    //3.提供公共的静态的方法，返回类的对象
    //静态的方法只能调用静态的结构，所以我们创建的对象也要是staic的
    public static Bank getInstance(){
        return instance;
    }
}
