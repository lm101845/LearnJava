package day10.demo06;

/**
 * @author 李明
 * @date 2021年06月13日 22:01
 */

/**
向上转型一定是安全的，没有问题的，正确的。但是也有一个弊端：
对象一旦向上转型为父类，那么就无法调用子类原本特有的内容。

解决方案：用对象的向下转型【还原】。
 注意：本来就是猫，才能还原成为猫
 */
public class Demo01Main {
    public static void main(String[] args) {
        //对象的向上转型就是父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();

        //animal.catchMouse();
        //错误写法！！！
        //因为你现在是把它当作动物来对待的，编译看左，动物没有catchMouse这个方法！！！

        //向下转型，进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();


        // 下面是错误的向下转型
        // 本来new的时候是一只猫，现在非要当做狗
        // 错误写法！编译不会报错，但是运行会出现异常：
        // java.lang.ClassCastException，类转换异常
        Dog dog = (Dog) animal;

    }
}
