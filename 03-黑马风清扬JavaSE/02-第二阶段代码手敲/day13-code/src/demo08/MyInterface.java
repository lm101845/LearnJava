package demo08;

/**
 * @Author 李明
 * @Date 2022/3/19 12:59
 **/
public interface MyInterface {
    //接口的2个抽象方法
    void show1();
    void show2();

    //随着使用,对接口进行升级
    //void show3();

    public default void show3(){
        //默认方法是可以有方法体的
        //我们使用默认方法进行接口升级是不会破坏原先的代码的
        //public可以省略
        //默认方法主要用于接口的升级,而不破坏现有的代码
        System.out.println("show3");
    }
}
