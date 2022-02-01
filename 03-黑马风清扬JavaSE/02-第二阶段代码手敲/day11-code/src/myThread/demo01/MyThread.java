package myThread.demo01;

/**
 * @author 李明
 * @date 2021年07月07日 18:05
 */
public class MyThread extends Thread{
    //创建新执行线程有两种方法。一种方法是将类声明为 Thread 的子类。该子类应重写 Thread 类的 run 方法。
    //为什么要重写的原因：因为在MyThread类中可能有其他代码，但并不是所有代码都需要被线程执行
    //为了区分哪些代码是可以被线程执行的，Java就提供了一个run方法，让我们封装被线程执行的代码
    @Override
    public void run() {
        for(int i = 0; i < 100;i++){
            System.out.println(i);
        }
    }
}
