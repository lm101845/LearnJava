package day10.demo02;

/**
 * @author 李明
 * @date 2021年06月11日 13:45
 */


public interface MyInterfaceA {

    // 错误写法！接口不能有静态代码块
//    static {
//
//    }

    // 错误写法！接口不能有构造方法
//    public MyInterfaceA() {
//
//    }

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("默认方法AAA");
    }

}

