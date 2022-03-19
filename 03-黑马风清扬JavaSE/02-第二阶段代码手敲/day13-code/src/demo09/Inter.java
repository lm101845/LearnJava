package demo09;

/**
 * @Author 李明
 * @Date 2022/3/19 13:22
 **/
public interface Inter {
    //抽象方法
    void show();
    //默认方法
    default void method(){
        System.out.println("Inter中的默认方法执行了");
    }
    static void test(){
        System.out.println("Inter中的静态方法执行了");
    }
}
