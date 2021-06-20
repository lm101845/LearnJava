package day08.demo03;

/**
 * @author 李明
 * @date 2021年06月04日 21:13
 */


public class Person {
    static {
        System.out.println("静态代码块执行了！");
    }

    public Person(){
        System.out.println("构造方法执行了！");
        //每次你new Person的时候，都会执行这个构造方法
    }
}
