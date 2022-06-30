package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/30 12:12
 **/

/**
 * 测试Thread中的常用方法：
 * 1. start():启动当前线程；调用当前线程的run()
 * 2. run(): 通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3. currentThread():静态方法，返回执行当前代码的线程
 * 4. getName():获取当前线程的名字
 * 5. setName():设置当前线程的名字
 * 6. yield():释放当前cpu的执行权
 * 7. join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才
 * 结束阻塞状态。
 * 8. stop():已过时。当执行此方法时，强制结束当前线程。
 * 9. sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前
 * 线程是阻塞状态。——可以用于倒计时
 * 10. isAlive():判断当前线程是否存活
 * <p>
 * <p>
 * 线程的优先级：
 * 1.
 * MAX_PRIORITY：10
 * MIN _PRIORITY：1
 * NORM_PRIORITY：5  -->默认优先级
 * 2.如何获取和设置当前线程的优先级：
 * getPriority():获取线程的优先级
 * setPriority(int p):设置线程的优先级
 * <p>
 * 说明：高优先级的线程要抢占低优先级线程cpu的执行权。但是只是【从概率上讲】，高优先级的线程高概率的情况下
 * 被执行。【并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行。】
 */

class HelloThread extends Thread {
    @Override
    public void run() {
        //父类的run方法没有抛异常，你就更加不能抛了，只能try...catch
        //子类重写的方法抛的异常要 <= 父类的方法
        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 0) {
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + ":" + i + "线程优先级为" + Thread.currentThread().getPriority() + ":");
//            }
                System.out.println(Thread.currentThread().getName() + ":" + i + "线程优先级为" + Thread.currentThread().getPriority() + ":");
//            if (i % 20 == 0) {
////                this.yield();
////                 yield():释放当前cpu的执行权——它释放了，就有可能被另外线程拿到(也可能拿不到，又被我自己抢到了)
//                yield();
//            }
        }
    }

    //通过调用构造器也能够给线程起名字
    public HelloThread(String name) {
        super(name);
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread h1 = new HelloThread("Thread--1");
        //你一定要在线程开始执行之前取名字，不然人家都开始执行了，你再取名字就晚了
//        h1.setName("线程一");
        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);
        h1.start();
        //给主线程命名
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "线程优先级为" + Thread.currentThread().getPriority() + ":");
            }
//            if(i == 20){
//                try {
//                    h1.join();
//                    //我们在主线程当中，调用另一个线程的join方法
//                    // join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才
//                    // 结束阻塞状态。
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        }
//        System.out.println(h1.isAlive());
    }
}
