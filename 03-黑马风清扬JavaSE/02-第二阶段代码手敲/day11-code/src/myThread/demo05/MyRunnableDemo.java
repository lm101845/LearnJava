package myThread.demo05;

/**
 * @Author ����
 * @Date 2022/2/1  14:39
 **/

/**
 * ʵ�ֲ���
 * ����һ���� MyRunnableʵ��Runnable�ӿ�
 * �� MyRunnable������дrun()����
 * ���� MyRunnable��Ķ���
 * ���� Thread��Ķ��󣬰�MyRunnable������Ϊ���췽���Ĳ���
 * �����߳�
 * */
public class MyRunnableDemo {
    public static void main(String[] args) {
        //���� MyRunnable��Ķ���
        MyRunnable my = new MyRunnable();
        //���� Thread��Ķ��󣬰�MyRunnable������Ϊ���췽���Ĳ���
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);
        Thread t1 = new Thread(my,"����");
        Thread t2 = new Thread(my,"�ɻ�");

        //�����߳�
        t1.start();
        t2.start();
    }
}
