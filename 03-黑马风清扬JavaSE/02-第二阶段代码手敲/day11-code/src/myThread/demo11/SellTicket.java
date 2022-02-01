package myThread.demo11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author ����
 * @Date 2022/2/1  16:41
 **/
public class SellTicket implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    //���ǽӿڣ�����ʵ����������������ʵ������ʵ����
    @Override
    public void run() {
        while (true) {
            //�Ѷ�����乲�����ݵĴ��������/�ͷ���
            //�������һ��try,��ʹ�������ˣ�������Ҳ�ǻ��ͷ�����
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
