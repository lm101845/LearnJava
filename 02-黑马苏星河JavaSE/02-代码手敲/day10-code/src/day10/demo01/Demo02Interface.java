package day10.demo01;

/**
 * @author ����
 * @date 2021��06��11�� 6:59
 */

/**
1. �ӿڵ�Ĭ�Ϸ���������ͨ���ӿ�ʵ�������ֱ�ӵ��á�
2. �ӿڵ�Ĭ�Ϸ�����Ҳ���Ա��ӿ�ʵ������и�����д��
 */
public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();

        //������ʵ�������
        //���ó��󷽷���ʵ�����е����Ҳ�ʵ����
        a.methodAbs();

        //����Ĭ�Ϸ��������ʵ���൱��û�У��������ҽӿ�
        a.methodDefault();   //ʵ���˳��󷽷���AAA

        System.out.println("=====================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefault();  //ʵ����B������д�˽ӿڵ�Ĭ�Ϸ���
    }
}
