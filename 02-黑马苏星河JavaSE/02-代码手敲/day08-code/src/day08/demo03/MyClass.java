package day08.demo03;

/**
 * @author 李明
 * @date 2021年06月04日 20:27
 */


public class MyClass {
    int num;
    //成员变量

    static int numStatic;
    //静态变量

    //成员方法
    public void method(){
        System.out.println("这是一个普通的成员方法");
        //成员方法可以访问成员变量——没报错
        System.out.println(num);

        //成员方法可以访问静态变量——没报错
        System.out.println(numStatic);
    }

    //静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法");

        //静态方法可以访问静态变量
        System.out.println(numStatic);

        //静态方法不能直接访问非静态变量！！！！重要！！！
        // System.out.println(num);  //错误写法！
        //System.out.println(this);    //错误写法！！
        //因为当你调用静态的时候，不应该通过对象名去调用，而应该直接通过类去调用
    }
}
