package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/30 15:03
 **/

/**
 * 例子：创建三个窗口卖票，总票数为100张.使用实现Runnable接口的方式
 * 存在线程的安全问题，待解决。
 *
 */

class Window1 implements Runnable{
    private int ticket = 100;  //这里没有加static，但是总共是100张票！！！因为我们这里只造了一个对象
    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        //我们这里只造了一个对象，这一个对象用在了3个构造器当中，说明我们用的是同一个Window
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
