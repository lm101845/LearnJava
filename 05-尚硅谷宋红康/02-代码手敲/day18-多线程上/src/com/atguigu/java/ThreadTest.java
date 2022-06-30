package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/30 10:29
 **/

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 * <p>
 * 例子：遍历100以内的所有的偶数
 */

//1. 创建一个继承于Thread类的子类
class MyThread extends Thread {
    //2. 重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

//我们线程的最后执行要在主线程里面去做
public class ThreadTest {
    public static void main(String[] args) {
        //main方法里面是主线程做的事情
        //3. 创建Thread类的子类的对象
        MyThread t1 = new MyThread();  //造了一个对象,这个对象还是main方法对应的主线程做的
        //4.通过此对象调用start(),它有2个作用:①启动当前线程 ② 调用当前线程的run()
        t1.start();   //帮我们这个对象调用start方法也是主线程做的
        //当调完start以后，这个线程就开始执行了，就开始进入到上方的代码块去了，新线程就开始了

        //问题一：我们【不能】通过直接调用run()的方式启动线程。——但是这个也是可以执行，只不过是对象调方法，并没有开启一个新的线程
        //t1.run();

        //问题二：再启动一个线程，遍历100以内的偶数。不可以还让已经start()的线程去执行。会报IllegalThreadStateException
//        t1.start();
        //我们需要重新创建一个线程的对象
        MyThread t2 = new MyThread();
        t2.start();

        //如下操作仍然是在main线程中执行的。
        System.out.println(Thread.currentThread().getName() + ":" + "hello");
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i + "***********main()************");
            }
        }
    }
}
