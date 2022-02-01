package myThread.demo04;

import myThread.demo04.ThreadSleep;

/**
 * @Author 李明
 * @Date 2022/2/1  12:50
 **/
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");

        ts1.start();
        ts2.start();
        ts3.start();
    }

}
