package day08.demo03;

/**
 * @author ����
 * @date 2021��06��04�� 20:27
 */


public class MyClass {
    int num;
    //��Ա����

    static int numStatic;
    //��̬����

    //��Ա����
    public void method(){
        System.out.println("����һ����ͨ�ĳ�Ա����");
        //��Ա�������Է��ʳ�Ա��������û����
        System.out.println(num);

        //��Ա�������Է��ʾ�̬��������û����
        System.out.println(numStatic);
    }

    //��̬����
    public static void methodStatic(){
        System.out.println("����һ����̬����");

        //��̬�������Է��ʾ�̬����
        System.out.println(numStatic);

        //��̬��������ֱ�ӷ��ʷǾ�̬��������������Ҫ������
        // System.out.println(num);  //����д����
        //System.out.println(this);    //����д������
        //��Ϊ������þ�̬��ʱ�򣬲�Ӧ��ͨ��������ȥ���ã���Ӧ��ֱ��ͨ����ȥ����
    }
}
