package day10.demo03;

/**
 * @author ����
 * @date 2021��06��11�� 16:32
 */

/**
����ӽӿڵ����м�����������4����
methodA ��Դ�ڽӿ�A
methodB ��Դ�ڽӿ�B
methodCommon ͬʱ��Դ�ڽӿ�A��B
method ��Դ�����Լ�
 */
public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
