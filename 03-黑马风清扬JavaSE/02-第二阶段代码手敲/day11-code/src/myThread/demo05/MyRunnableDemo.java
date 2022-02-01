package myThread.demo05;

/**
 * @Author 李明
 * @Date 2022/2/1  14:39
 **/

/**
 * 实现步骤
 * 定义一个类 MyRunnable实现Runnable接口
 * 在 MyRunnable类中重写run()方法
 * 创建 MyRunnable类的对象
 * 创建 Thread类的对象，把MyRunnable对象作为构造方法的参数
 * 启动线程
 * */
public class MyRunnableDemo {
    public static void main(String[] args) {
        //创建 MyRunnable类的对象
        MyRunnable my = new MyRunnable();
        //创建 Thread类的对象，把MyRunnable对象作为构造方法的参数
//        Thread t1 = new Thread(my);
//        Thread t2 = new Thread(my);
        Thread t1 = new Thread(my,"高铁");
        Thread t2 = new Thread(my,"飞机");

        //启动线程
        t1.start();
        t2.start();
    }
}
