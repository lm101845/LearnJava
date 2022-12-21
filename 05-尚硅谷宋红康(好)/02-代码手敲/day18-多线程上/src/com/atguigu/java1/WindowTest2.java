package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/30 18:17
 **/

/**
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 *
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器。
 *
 */
class Window2 extends Thread{
    private static int ticket = 100;  //一定要加上static，3个线程共享100张票
    //private static Object obj = new Object();
    @Override
    public void run() {
        //卖票你就不能指定哪个窗口卖多少张了，所以用while循环，不用for循环
        while(true){
//            synchronized (obj){
            //synchronized (this){  //this表示调用run方法的对象，
            //错误的方式：this代表着t1,t2,t3三个对象
            synchronized (Window2.class){  //类只会加载一次，所以这个也是唯一的，也是一个对象
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":卖票，票号为" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}
public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}


