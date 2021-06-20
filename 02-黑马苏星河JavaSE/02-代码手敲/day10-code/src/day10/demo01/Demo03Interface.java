package day10.demo01;

/**
 * @author 李明
 * @date 2021年06月11日 7:20
 */

/**
注意事项：不能通过接口实现类的对象来调用接口当中的静态方法。
正确用法：通过接口名称，直接调用其中的静态方法。(静态方法是最简单的方法了)
格式：
接口名称.静态方法名(参数);
 */
public class Demo03Interface {
    public static void main(String[] args) {
        //创建了实现类对象
        //静态方法和对象没有关系，和类有关系
        //既然和对象没有关系，你就没有必要再new一个对象了
        //MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();

        //错误写法！
        //impl.methodStatic();
        //创建的对象不能直接调用静态方法

        //直接通过接口名称调用静态方法

        MyInterfaceStatic.methodStatic();
    }
}
