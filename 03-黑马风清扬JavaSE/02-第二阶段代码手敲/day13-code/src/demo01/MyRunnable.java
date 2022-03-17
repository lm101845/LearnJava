package demo01;

/**
 * @Author 李明
 * @Date 2022/2/4  12:42
 **/
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("多线程程序启动了");
    }
}
