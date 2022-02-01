package myThread.demo01;

/**
 * @author 李明
 * @date 2021年07月07日 18:03
 */

/**
    方式1：继承Thread类
        1:定义一个类MyThread继承Thread类
        2:在MyThread类中重写run()方法
        3:创建MyThread类的对象
        4:启动线程
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        //my1.run();
        //my2.run();
        //注意：run方法的调用并没有启动线程，调用start方法才会启动线程
        //void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法
        //使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
        //start方法，底层最终还是调用的是run方法的
        my1.start();
        my2.start();
    }
}
