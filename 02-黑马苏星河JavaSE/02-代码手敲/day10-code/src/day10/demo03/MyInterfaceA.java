package day10.demo03;

/**
 * @author ����
 * @date 2021��06��11�� 16:31
 */
public interface MyInterfaceA {
    public abstract void methodA();

    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("AAA");
    }

}
