package myThread.demo01;

/**
 * @author ����
 * @date 2021��07��07�� 18:03
 */

/**
    ��ʽ1���̳�Thread��
        1:����һ����MyThread�̳�Thread��
        2:��MyThread������дrun()����
        3:����MyThread��Ķ���
        4:�����߳�
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        //my1.run();
        //my2.run();
        //ע�⣺run�����ĵ��ò�û�������̣߳�����start�����Ż������߳�
        //void start() ���´��߳̿�ʼִ��; Java��������ô��̵߳�run����
        //ʹ���߳̿�ʼִ�У�Java ��������ø��̵߳� run ������
        //start�������ײ����ջ��ǵ��õ���run������
        my1.start();
        my2.start();
    }
}
