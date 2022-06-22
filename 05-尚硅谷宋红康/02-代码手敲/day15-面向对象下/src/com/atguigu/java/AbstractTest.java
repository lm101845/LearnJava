package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/22 18:08
 **/

/**
 * abstract关键字的使用
 * 1.abstract:抽象的
 * 2.abstract可以用来修饰的结构：类、方法——只有这2种
 *
 * 3. abstract修饰类：抽象类
 * 		> 此类不能实例化
 *      > 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 *      > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 *
 *
 * 4. abstract修饰方法：抽象方法
 * 		> 抽象方法只有方法的声明，没有方法体
 * 		> 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
 *      > 若子类重写了父类中的所有的抽象方法后，此子类方可实例化
 *        若子类没有重写父类中的所有的抽象方法，则此子类也必须 是一个抽象类，需要使用abstract修饰
 */
public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person类抽象了，就不可实例化
//		Person p1 = new Person();
//		p1.eat();
    }
}

abstract class Creature{
    public abstract void breath();
}

abstract class Person extends Creature{
    String name;
    int age;

    //Person是抽象类，不能直接new Person,那构造器自己也用不了
    //但是子类继承我这个类的时候，它一定会调用我父类的构造器，这个构造器是给子类服务的
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    //不是抽象方法：
//	public void eat(){
//
//	}

    //抽象方法——这个方法里面只有方法的声明，而没有方法体
    //如果一个类中有抽象方法，那么这个类一定是抽象类
    public abstract void eat();
    public void walk(){
        System.out.println("人走路");
    }
}


class Student extends Person{

    public Student(String name,int age){
        super(name,age);
    }
    public Student(){
    }

    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    @Override
    public void breath() {
        System.out.println("学生应该呼吸新鲜的没有雾霾的空气");
    }
}
