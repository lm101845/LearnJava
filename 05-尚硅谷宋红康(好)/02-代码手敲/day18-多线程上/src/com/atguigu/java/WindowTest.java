package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/30 14:32
 **/

/**
 *
 * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 *
 * 存在线程的安全问题
 *
 */

class Window extends Thread{
    private static int ticket = 100;  //一定要加上static，3个线程共享100张票
    @Override
    public void run() {
        //卖票你就不能指定哪个窗口卖多少张了，所以用while循环，不用for循环
        while(true){
            if(ticket > 0){
                System.out.println(getName() + ":卖票，票号为" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
