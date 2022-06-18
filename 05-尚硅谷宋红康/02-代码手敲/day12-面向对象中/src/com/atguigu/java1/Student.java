package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/18 0:12
 **/
public class Student extends Person{
    String majar;

    public Student() {
    }

    public Student(String majar) {
        this.majar = majar;
    }

    public void study(){
        System.out.println("学习，专业是：" + majar);
    }

    //对父类中的eat方法进行了重写
    //void eat(){   //重写方法的权限修饰符要 >= 父类方法的权限修饰符！！！！
    //煎饼果子摊煎饼，刚开始摊一个小圆，然后想覆盖掉它，你起码要摊的比之前的大，才能覆盖掉它
    public void eat(){
        System.out.println("学生多吃有营养的食物");
    }

    //父类的show方法是Private，是不允许你重写的，我这里权限弄的更大，还是不能重写，编译器不认为这个是重写
    public void show(){
        System.out.println("我是一个人");
    }

    public String info(){
        return "父类被重写的方法的返回值类型是A类型(Object)，则子类重写的方法的返回值类型可以是A类或A类的子类(String)";
    }

    //基本数据类型，重写，返回值类型必须要和父类一致！！！！
//    public int info1(){
    public double  info1(){
        return 1;
    }

    @Override
    public void walk(int distance) {
        System.out.println("重写的方法");
    }
}
