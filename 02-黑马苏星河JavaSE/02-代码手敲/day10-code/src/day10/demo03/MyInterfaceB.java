package day10.demo03;

/**
 * @author ����
 * @date 2021��06��11�� 16:31
 */
public interface MyInterfaceB {
    public abstract void methodB();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
