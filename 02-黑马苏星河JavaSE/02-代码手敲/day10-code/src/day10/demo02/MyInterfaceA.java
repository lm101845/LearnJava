package day10.demo02;

/**
 * @author ����
 * @date 2021��06��11�� 13:45
 */


public interface MyInterfaceA {

    // ����д�����ӿڲ����о�̬�����
//    static {
//
//    }

    // ����д�����ӿڲ����й��췽��
//    public MyInterfaceA() {
//
//    }

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("Ĭ�Ϸ���AAA");
    }

}

