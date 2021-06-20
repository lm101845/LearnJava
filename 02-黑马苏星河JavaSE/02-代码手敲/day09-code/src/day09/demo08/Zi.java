package day09.demo08;

/**
 * @author 李明
 * @date 2021年06月09日 7:37
 */

/**
 * super关键字的用法有三种：
 * 1. 在子类的成员方法中，访问父类的成员变量。
 * 2. 在子类的成员方法中，访问父类的成员方法。
 * 3. 在子类的构造方法中，访问父类的构造方法。
 */
public class Zi extends Fu {
    int num = 20;

    public void methodZi() {
        System.out.println(num);
        System.out.println(super.num);
    }

    public void method(){
        super.method();  //访问父类中的成员方法
        System.out.println("子类方法");
    }
}
