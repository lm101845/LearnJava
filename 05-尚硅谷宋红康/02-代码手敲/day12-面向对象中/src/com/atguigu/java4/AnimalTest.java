package com.atguigu.java4;

import java.sql.Connection;

/**
 * @Author liming
 * @Date 2022/6/18 15:34
 **/
//多态性的使用举例一：
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());   //声明的是animal类型，但是new的却是子类的对象，这个就是多态
        test.func(new Cat());
    }

    public void func(Animal animal){//Animal animal = new Dog();
        animal.eat();
        animal.shout();

        if(animal instanceof Dog){
            Dog d = (Dog)animal;
            d.watchDoor();
        }
    }

//  如果没有多态，就只能这么写了
//  有了多态性以后，我们就省去了写很多重载方法的设计了
//	public void func(Dog dog){
//		dog.eat();
//		dog.shout();
//	}
//	public void func(Cat cat){
//		cat.eat();
//		cat.shout();
//	}
}


class Animal{
    public void eat(){
        System.out.println("动物：进食");
    }
    public void shout(){
        System.out.println("动物：叫");
    }

}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void shout(){
        System.out.println("汪！汪！汪！");
    }

    public void watchDoor(){
        System.out.println("看门");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void shout(){
        System.out.println("喵！喵！喵！");
    }
}


//举例二：
class Order{

    public void method(Object obj){
        //方法形参是Object类型，这个方法的通用性就很好，形参我们随便传一个Object类型的都可以，实现了多态
    }
}

//举例三：
class Driver{
    public void doData(Connection conn){//conn = new MySQlConnection(); / conn = new OracleConnection();
        //规范的步骤去操作数据
//		conn.method1();
//		conn.method2();
//		conn.method3();
    }
}
