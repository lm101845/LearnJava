package myThread.demo09;

/**
 * @Author 李明
 * @Date 2022/2/1  14:52
 **/
public class SellTicket implements Runnable{
//    private int tickets = 100;
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;
    //注意：3个线程只能有一把锁
    @Override
    public void run(){
        while(true){
            if(x%2 == 0){
                //这是静态同步方法的锁
                synchronized (SellTicket.class){
//                synchronized (this){
//                synchronized (obj){
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
            }else{
//                synchronized (obj){
//                    //t1进来后，就会把这段代码给锁起来
//                    if(tickets > 0){
//                        try {
//                            Thread.sleep(100);
//                            //t1休息100毫秒
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                        tickets--;
//                    }
//                }
                sellTicket();
            }
            x++;
        }
    }

//    private void sellTicket() {
//        synchronized (obj){
//            //t1进来后，就会把这段代码给锁起来
//            if(tickets > 0){
//                try {
//                    Thread.sleep(100);
//                    //t1休息100毫秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                tickets--;
//            }
//        }
//    }

    //这个加了synchronized表示对方法内部加了锁，锁的是this
//    private synchronized void sellTicket() {
//            //t1进来后，就会把这段代码给锁起来
//            if(tickets > 0){
//                try {
//                    Thread.sleep(100);
//                    //t1休息100毫秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                tickets--;
//            }
//    }

    private static synchronized void sellTicket() {
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
