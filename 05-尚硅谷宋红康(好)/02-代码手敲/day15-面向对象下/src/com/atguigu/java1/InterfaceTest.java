package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/23 12:31
 **/

/**
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.Java中，接口和类是【并列】的两个结构——他们是平起平坐的！！！
 * 3.如何定义接口：定义接口中的成员
 *
 * 		3.1 JDK7及以前：接口中只能定义全局常量和抽象方法
 * 			>全局常量：public static final的.但是书写时，可以省略不写——接口当中的权限都是public！！！
 * 			>抽象方法：public abstract的
 *
 * 		3.2 JDK8：除了定义全局常量和抽象方法之外，接口中还可以定义静态方法、默认方法（略）
 *
 * 4. 接口中不能定义构造器的！意味着【接口不可以实例化】
 *
 * 5. Java开发中，接口通过让类去实现(implements)的方式来使用.
 *    如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *    如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
 *
 * 6. Java类可以实现多个接口   --->弥补了Java单继承性的局限性
 *   格式：class AA extends BB implements CC,DD,EE
 *
 * 7. 接口与接口之间可以继承，而且可以【多继承】
 *
 * *******************************
 * 8. 接口的具体使用，体现多态性
 * 9. 接口，实际上可以看做是一种【规范】
 *
 * 我们知道抽象类是从子类中发现公共部分，然后泛化成抽象类，子类继承该父类即可，但是接口不同。实现它的子类可以不存在任何关系，共同之处。
 * 例如猫、狗可以抽象成一个动物类抽象类，具备叫的方法。鸟、飞机可以实现飞Fly接口，具备飞的行为，这里我们总不能将鸟、飞机共用一个父类吧！
 * 所以说抽象类所体现的是一种继承关系，要想使得继承关系合理，父类和派生类之间必须存在"is-a" 关系，即父类和派生类在概念本质上应该是相同的。
 * 对于接口则不然，并不要求接口的实现者和接口定义在概念本质上是一致的， 仅仅是实现了接口定义的规则而已。
 *
 * 链接：https://www.zhihu.com/question/28887491/answer/117886746
 *
 * 面试题：抽象类与接口有哪些异同？
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {
        //静态常量也是可以通过接口来调用的
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
//		Flyable.MIN_SPEED = 2;
//        你想重新赋值是不可以的，因为MIN_SPEED不是变量，它是final的静态常量

        Plane plane = new Plane();
        plane.fly();
    }
}

interface Flyable{
    //定义全局常量(前面必须是public static final，并且可以省略)
    public static final int MAX_SPEED = 7900;  //第一宇宙速度
    int MIN_SPEED = 1;                         //省略了public static final,删了以后还是常量，不是变量！！！！

    //抽象方法
    public abstract void fly();
    void stop();  //省略了public abstract

    //Interfaces cannot have constructors
    // ——接口中不能定义构造器，意味着接口不可以实例化
    // ——抽象类也不能实例化，但是抽象类中是有构造器的，抽象类的构造器是让子类new的时候用的
    //抽象类既然不能实例化，那怎么用呢？【让他和类发生关系】
    //我们Java是面向对象，我们得通过类去new对象，所以我们必须要把接口转换到类的层面去使用才可以
//	public Flyable(){
//
//	}
}

//可以攻击的接口
interface Attackable{

    void attack();  //抽象方法，省略了前面的public abstract

}


//类Plane和Flyable是平起平坐的关系！！！
class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}

//Kite只实现了一个接口中的抽象方法，所以它必须是抽象类
abstract class Kite implements Flyable{

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

}

//狗狗风筝继承了Kite,它只要重写一个stop方法就可以实例化了，就不用是抽象类了
class DogKite extends Kite implements  Flyable{

    @Override
    public void stop() {

    }
}

//先写extends，后写implements
class Bullet extends Object implements Flyable,Attackable,CC{

    @Override
    public void attack() {
        // TODO Auto-generated method stub

    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method1() {
        // TODO Auto-generated method stub

    }

    @Override
    public void method2() {
        // TODO Auto-generated method stub

    }

}
//************************************
interface AA{
    void method1();
}
interface BB{

    void method2();
}

interface CC extends AA,BB{

}