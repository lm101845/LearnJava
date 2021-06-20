package day10.demo03;

/**
 * @author 李明
 * @date 2021年06月11日 16:31
 */
public interface MyInterfaceA {
    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("AAA");
    }

}
