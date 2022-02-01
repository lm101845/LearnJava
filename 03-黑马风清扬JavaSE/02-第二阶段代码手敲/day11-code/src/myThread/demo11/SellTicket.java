package myThread.demo11;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author 李明
 * @Date 2022/2/1  16:41
 **/
public class SellTicket implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();

    //它是接口，不能实例化，我们用它的实现类来实例化
    @Override
    public void run() {
        while (true) {
            //把多条语句共享数据的代码给加锁/释放锁
            //在外面加一个try,即使出问题了，最终它也是会释放锁的
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
