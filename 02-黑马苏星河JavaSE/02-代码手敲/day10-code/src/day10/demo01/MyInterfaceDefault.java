package day10.demo01;

/**
 * @author ����
 * @date 2021��06��11�� 6:52
 */

/**
 ��Java 8��ʼ���ӿ���������Ĭ�Ϸ�����
 ��ʽ��
 public default ����ֵ���� ��������(�����б�) {
 ������
 }

 ��ע���ӿڵ��е�Ĭ�Ϸ��������Խ���ӿ����������⡣
 */

public interface MyInterfaceDefault {
    //���󷽷�
    public abstract void methodAbs();

    //�����һ�����󷽷�
    //public abstract void methodAbs2();

    //����ӵķ������ĳ�Ĭ�Ϸ���
    public default void methodDefault(){
        System.out.println("��������ӵ�Ĭ�Ϸ���");
    }
}
