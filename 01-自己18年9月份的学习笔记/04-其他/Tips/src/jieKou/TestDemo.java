package jieKou;
/**
 * @姓名 李明
 * @日期 2018年11月5日上午9:16:34
 * 
 * 由于接口里面存在抽象方法，所以接口对象不能直接使用关键字new进行实例化。接口的使用原则如下： 
（1）接口必须要有子类，但此时一个子类可以使用implements关键字实现多个接口； 
（2）接口的子类（如果不是抽象类），那么必须要覆写接口中的全部抽象方法； 
（3）接口的对象可以利用子类对象的向上转型进行实例化。

 */
interface A{//定义一个接口A

    public static final String MSG = "hello";//全局常量

    public abstract void print();//抽象方法
}

interface B{//定义一个接口B

    public abstract void get();
}

class X implements A,B{//X类实现了A和B两个接口

    @Override
    public void print() {
        System.out.println("接口A的抽象方法print()");
    }

    @Override
    public void get() {
        System.out.println("接口B的抽象方法get()");
    }

}


public class TestDemo {

    public static void main(String[] args){

        X x = new X();//实例化子类对象
        A a = x;//向上转型
        B b = x;//向上转型

        a.print();
        b.get();
    }

}

