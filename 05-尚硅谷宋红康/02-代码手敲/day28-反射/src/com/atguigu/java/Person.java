package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/8/14 19:17
 **/
public class Person {
    private String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        System.out.println("Person空参构造器");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //这个方法在外面调不了
    private Person(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("你好，我是一个人");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String showNation(String nation){
        System.out.println("我的国籍是：" + nation);
        return nation;
    }
}
