package day09.demo11;

/**
 * @author 李明
 * @date 2021年06月09日 9:35
 */
public class DemoMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        // 错误写法！不能直接创建抽象类对象

        Cat cat = new Cat();
        //创建的是子类对象，当然运行的是子类方法
        cat.eat();
    }
}
