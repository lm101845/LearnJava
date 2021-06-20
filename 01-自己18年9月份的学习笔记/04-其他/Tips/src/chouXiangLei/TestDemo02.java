package chouXiangLei;

/**
 * @姓名 李明
 * @日期 2018年11月5日上午8:12:38
 * 
 * 抽象类的使用原则如下： 
（1）抽象方法必须为public或者protected（因为如果为private，则不能被子类继承，子类便无法实现该方法），缺省情况下默认为public； 
（2）抽象类不能直接实例化，需要依靠子类采用向上转型的方式处理； 
（3）抽象类必须有子类，使用extends继承，一个子类只能继承一个抽象类； 
（4）子类（如果不是抽象类）则必须覆写抽象类之中的全部抽象方法（如果子类没有实现父类的抽象方法，则必须将子类也定义为为abstract类。）；
    
 */
abstract class A{//定义一个抽象类

    public void fun(){//普通方法
        System.out.println("存在方法体的方法");
    }

    public abstract void print();//抽象方法，没有方法体，有abstract关键字做修饰

}
//单继承
class B extends A{//B类是抽象类的子类，是一个普通类

    @Override
    public void print() {//强制要求覆写
        System.out.println("Hello World !");
    }

}
public class TestDemo02 {

    public static void main(String[] args) {
        A a = new B();//向上转型

        a.print();//被子类所覆写的过的方法
    }
}
/*
 * 现在就可以清楚的发现： 
（1）抽象类继承子类里面有明确的方法覆写要求，而普通类可以有选择性的来决定是否需要覆写； 
（2）抽象类实际上就比普通类多了一些抽象方法而已，其他组成部分和普通类完全一样； 
（3）普通类对象可以直接实例化，但抽象类的对象必须经过向上转型之后才可以得到。

虽然一个类的子类可以去继承任意的一个普通类，可是从开发的实际要求来讲，普通类尽量不要去继承另外一个普通类，而是去继承抽象类。
*/
