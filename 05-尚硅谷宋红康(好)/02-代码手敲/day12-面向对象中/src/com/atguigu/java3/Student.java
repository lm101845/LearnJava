package com.atguigu.java3;

/**
 * @Author liming
 * @Date 2022/6/18 11:51
 **/
public class Student extends Person{
    String major;
    int id = 1002;
//    int age = 28;
    //学号——父类里面也有id,父子类里面出现了同名的属性，如何进行区分呢？使用super
    //对于属性来讲，不会像方法一样存在覆盖之说，【属性是不会被覆盖的！！！！！！！！！！！！！！！】
    //所以Student类里面有2个id，自己的id和父类的id

    public Student(){
        super();
        //不写super也是会调用父类中的无参构造方法的
    }
    public Student(String major){
//        super();
        this.major = major;
    }

    public Student(String name,int age,String major){
//		this.name = name;
//		this.age = age;
        //现在还能这么写,this.name = name,但是如果父类把权限缩小为private，就不能这么写了
        super(name,age);
        //super加形参列表调用的是父类的构造器，这里调用的是父类执行name,age的形参构造器
        this.major = major;
    }

    @Override
    public void eat()  {
        System.out.println("学生：多吃有营养的食物");
    }

    public void study(){
        System.out.println("学生：学习知识");
        this.eat();
        super.eat();
        walk();
    }

    public void show(){
        System.out.println("name = " + name + ", age = " + age);
        //这种写法写法其实是省略了this.的
        //this.name：它先在自己本类去找，【找不到再去父类去找】————我去，这个以前好像没注意过！！！this还会去父类找啊！！！
        //super.age：它不会在本类去找，直接去父类去找了
        System.out.println("name = " + this.name + ", age = " + super.age);
        System.out.println("id = " + this.id);
        //我们在方法里面试图调用父类的属性
        System.out.println("id = " + super.id);
        Student s2 = new Student("计算机");

    }
}
