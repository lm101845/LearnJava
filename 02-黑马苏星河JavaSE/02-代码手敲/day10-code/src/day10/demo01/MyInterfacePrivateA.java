package day10.demo01;

/**
 * @author ����
 * @date 2021��06��11�� 7:28
 */

/**
����������
������Ҫ��ȡһ�����з����������������Ĭ�Ϸ���֮���ظ���������⡣
����������з�����Ӧ����ʵ����ʹ�ã�Ӧ����˽�л��ġ�

���������
��Java 9��ʼ���ӿڵ���������˽�з�����
1. ��ͨ˽�з�����������Ĭ�Ϸ���֮���ظ���������
��ʽ��
private ����ֵ���� ��������(�����б�) {
    ������
}

2. ��̬˽�з�������������̬����֮���ظ���������
��ʽ��
private static ����ֵ���� ��������(�����б�) {
    ������
}
 */
public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("Ĭ�Ϸ���1");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//        �ظ����벻Ҫ�ظ�д�ˣ����ظ����뵥��дһ�����룬���е��ü���
//        methodCommon();
    }

    public default void methodDefault2(){
        System.out.println("Ĭ�Ϸ���2");
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//        methodCommon();

    }

    // private void methodCommon(){
    //    System.out.println("AAA");
    //    System.out.println("BBB");
    //    System.out.println("CCC");
    //}
}
