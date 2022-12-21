package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/17 0:36
 **/
public class Person extends Creature{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
        sleep();
        //student在public权限的eat里面调private的sleep，可以调到，说明：
        // *    2.1体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有的属性和方法。
        // *    	特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
        // *    只有因为封装性的影响，使得子类不能直接调用父类的结构而已。
        System.out.println("*********************");
    }

//    public void sleep(){
    //虽然父类sleep方法是私有的，但是子类仍然继承到了
    private void sleep(){
        System.out.println("睡觉");
    }

}
