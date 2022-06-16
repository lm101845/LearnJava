package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/17 0:40
 **/

/**
 * 面向对象的特征之二：继承性    why?
 *
 * 一、继承性的好处：
 * ① 减少了代码的冗余，提高了代码的复用性
 * ② 便于功能的扩展
 * ③ 为之后多态性的使用，提供了前提
 *
 *
 * 二、继承性的格式：
 *    class A extends B{}
 *    A:子类、派生类、subclass
 *    B:父类、超类、基类、superclass
 *
 *    2.1体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的【所有的】属性和方法。
 *    	特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
 *    只有因为【封装性的影响——比如使用了private修饰】，使得子类不能直接调用父类的结构而已。
 *    《封装性：解决的是结构的可见性问题》
 *    《继承性：解决的是我能不能拿到你里面结构的问题》
 *    《继承都能拿到里面的结构，但是拿到了以后能不能调用，还得看封装性》
 *    2.2 子类继承父类以后，还可以声明自己特有的属性或方法：实现功能的拓展。
 *    子类和父类的关系，不同于子集和集合的关系。
 *    extends：延展、扩展
 *
 * 三、Java中关于继承性的规定：
 * 	  1.一个类可以被多个子类继承。
 *    2.Java中类的单继承性：一个类只能有一个父类
 *    3.子父类是相对的概念。
 *    4.子类直接继承的父类，称为：直接父类。间接继承的父类称为：间接父类
 *    5.子类继承父类以后，就获取了直接父类以及所有间接父类中声明的属性和方法
 *
 *
 * 四、 1. 如果我们没有显式的声明一个类的父类的话，则此类继承于java.lang.Object类
 *    2. 所有的java类（除java.lang.Object类之外）都直接或间接的继承于java.lang.Object类
 *    3. 意味着，所有的java类具有java.lang.Object类声明的功能。
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.eat();

        System.out.println("===================");

        Student s1 = new Student();
        s1.eat();
//        s1.sleep();
        s1.breath();
        s1.name = "Tom";

        Creature c = new Creature();

    }
}
