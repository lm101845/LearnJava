package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/15 13:09
 **/
/**
 * 类的结构之三：构造器（或构造方法、constructor）的使用
 * construct：建设、建造。  construction:CCB    constructor:建设者
 *
 * 一、构造器的作用：
 * 1.创建对象
 * 2.【初始化】对象的信息
 * 2.1如同我们规定每个“人”一出生就必须先洗澡，我们就可以在“人”的
 * 构造器中加入完成“洗澡”的程序代码，于是每个“人”一出生就会自
 * 动完成“洗澡”，程序就不必再在每个人刚出生时一个一个地告诉他们
 * 要“洗澡”了。
 *
 * 二、说明：
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符  类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5.一个类中，至少会有一个构造器(可能是默认的，也可以是你自己写的)。——抽象类虽然不能实例化，但是它也有构造器！！！！
 * 6.构造器是没有返回值的，而且构造器前面记得别写void啊！！！！！
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建类的对象:new + 构造器
        Person p = new Person();
        Person p1 = new Person("Tom");
        System.out.println(p1.name);
    }
}

class Person{
    //属性
    String name;
    int age;

    //构造器——用来造对象的
    //构造器是构造器，方法是方法，构造器并不是方法的一种，它和方法时并列的关系
    public Person(){
        System.out.println("Person().....");
    }

    //我们在造这个对象的同时，把name值也给赋上了
    public Person(String n){
        name = n;

    }
    public Person(String n,int a){
        name = n;
        age = a;
    }


    //方法——通过对象实例调用，用来完成某一个功能的
    public void eat(){
        System.out.println("人吃饭");
    }

    public void study(){
        System.out.println("人可以学习");
    }

}
