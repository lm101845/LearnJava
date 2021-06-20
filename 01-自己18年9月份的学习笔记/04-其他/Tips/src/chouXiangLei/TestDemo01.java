package chouXiangLei;

/**
 * @姓名 李明
 * @日期 2018年11月5日上午8:03:46
 * 
 * 范例：直接实例化抽象类的对象
 */
abstract class A2{//定义一个抽象类

    public void fun(){//普通方法
        System.out.println("存在方法体的方法");
    }

    public abstract void print();//抽象方法，没有方法体，有abstract关键字做修饰

}

public class TestDemo01 {

    public static void main(String[] args) {
        //A2 a = new A2();     //没有办法实例化这个类
        /*
         * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    	   Cannot instantiate the type A2
    	   
    	   从上可知，A是抽象的，无法直接进行实例化操作。为什么不能直接实例化呢？当一个类实例化之后，就意味着这个对象可以调用类中的属性或者放过了，但在抽象类里存在抽象方法，而抽象方法没有方法体，没有方法体就无法进行调用。既然无法进行方法调用的话，又怎么去产生实例化对象呢。

     */
    }
}
