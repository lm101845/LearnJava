package demo09;

/**
 * @Author 李明
 * @Date 2022/3/19 13:20
 **/

/**
    需求：
        1:定义一个接口Inter，里面有三个方法：一个是抽象方法，一个是默认方法，一个是静态方法
            void show();
            default void method(){ }
            public static void test(){ }
        2:定义接口的一个实现类：
            InterImpl
        3:定义测试类：
            InterDemo
            在主方法中，按照多态的方式创建对象并使用
 */
public class InterDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        i.show();
        i.method();
        //i.test();
        //静态方法只能被接口调用,不能被实例调用
        Inter.test();
        //InterImpl.test();  //使用实现类调用也是不可以的
        //如果可以调用,那它调用的是Inter里面的静态方法还是Flyable里面的静态方法呢?它区分不出来的
        //所以接口中的静态方法它限制了只能通过接口名来调用
        Flyable.test();
    }
}
