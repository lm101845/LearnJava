package day09.demo11;

/**
 * @author 李明
 * @date 2021年06月09日 9:30
 */

/**
抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
抽象类：抽象方法所在的类，必须是抽象类才行。在class之前写上abstract即可。

如何使用抽象类和抽象方法：
1. 不能直接创建new抽象类对象。
2. 必须用一个子类来继承抽象父类。
3. 子类必须覆盖重写抽象父类当中【所有的】抽象方法。
覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号。
4. 创建子类对象进行使用。
 */
public abstract class Animal {
//    public void eat(){
//        //System.out.println("吃鱼");
//        //System.out.println("吃骨头");
//        //这个大括号里面写什么具体方法都不合适
//    }


    // 这是一个抽象方法，代表吃东西，但是具体吃什么（大括号的内容）不确定。
    //抽象方法没有大括号方法体
    //抽象方法所在的类必须是抽象类
    //抽象类也很简单，加上abstract就可以了
    public abstract void eat();

    // 这是普通的成员方法
//    public void normalMethod() {
//
//    }
}
