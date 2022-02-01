package myThread.demo08;

/**
 * @Author 李明
 * @Date 2022/2/1  14:52
 **/
public class SellTicket implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();
    //注意：3个线程只能有一把锁
    @Override
    public void run(){
        while(true){
            //tickets = 100
            //t1,t2,t3
            //假设t1抢到了CPU的执行权
            //假设t2抢到了CPU的执行权(t1休息的时候抢的)，但是发现被锁了，虽然抢到了还是用不了，只能等
            synchronized (obj){
                //t1进来后，就会把这段代码给锁起来
                if(tickets > 0){
                    try {
                        Thread.sleep(100);
                        //t1休息100毫秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            }

        }
    }
}
