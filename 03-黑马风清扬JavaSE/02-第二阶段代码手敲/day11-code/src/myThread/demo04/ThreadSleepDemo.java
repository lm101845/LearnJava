package myThread.demo04;

import myThread.demo04.ThreadSleep;

/**
 * @Author ����
 * @Date 2022/2/1  12:50
 **/
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("�ܲ�");
        ts2.setName("����");
        ts3.setName("��Ȩ");

        ts1.start();
        ts2.start();
        ts3.start();
    }

}
