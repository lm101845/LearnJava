package day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();   //无参构造
        //当你在通过new创建对象的时候，其实就是在使用构造方法
        //【构造方法的调用】是通过new关键字加空格，而不是通过什么点来调用的。

        System.out.println("=================");

        Student stu2 = new Student("赵丽颖",20);  //全参构造
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());
        //如果需要改变对象当中的成员变量数据内容，仍然还需要使用setxxx方法

        stu2.setAge(21);  //改变年龄
        System.out.println("姓名：" + stu2.getName() + ",年龄：" + stu2.getAge());

    }
}
