package myThread.demo07;

/**
 * @Author 李明
 * @Date 2022/2/1  14:52
 **/
//定义一个类 SellTicket实现Runnable接口，里面定义一个成员变量：private int tickets = 100;
public class SellTicket implements Runnable{
    private int tickets = 100;
    //在 SellTicket类中重写run()方法实现卖票，代码步骤如下
    @Override
    public void run(){
        // 1.判断票数大于 0，就卖票，并告知是哪个窗口卖的
        // 2.卖了票之后，总票数要减 1
        // 3.票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行

        //问题1：相同的票出现了多次
//        while(true){
//            //tickets = 100;
//            //t1,t2,t3
//            //假设t1线程抢到了CPU的执行权
//            if(tickets > 0){
//                //通过sleep方法来模拟出票时间
//                try {
//                    Thread.sleep(100);
//                    //t1线程休息了100毫秒
//                    //在t1线程休息的时候，我t2线程抢到了CPU的执行权,t2线程就开始执行，执行到这里时，t2线程也休息100毫秒
//                    //在t2线程休息的时候，我t3线程抢到了CPU的执行权,t3线程就开始执行，执行到这里时，t3线程也休息100毫秒
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                //假设线程按照顺序醒过来
//                //t1抢到CPU的执行权，在控制台输出：窗口1正在出售第100张票
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                //t2抢到了CPU的执行权，在控制台输出：窗口2正在出售第100张票
//                //t3抢到了CPU的执行权，在控制台输出：窗口3正在出售第100张票
//                //这就是相同的票被卖了多次的原因
//                tickets--;
//                //如果这3个线程还是按照执行顺序来，这里就执行了3次--的操作，最终票就变成了97
//            }
//        }


        //问题2：出现了负数票的情况
        while(true){
            //tickets = 1;
            //t1,t2,t3
            //假设t1线程抢到了CPU的执行权
            if(tickets > 0){
                //通过sleep方法来模拟出票时间
                try {
                    Thread.sleep(100);
                    //t1线程休息了100毫秒
                    //在t1线程休息的时候，我t2线程抢到了CPU的执行权,t2线程就开始执行，执行到这里时，t2线程也休息100毫秒
                    //在t2线程休息的时候，我t3线程抢到了CPU的执行权,t3线程就开始执行，执行到这里时，t3线程也休息100毫秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //假设线程按照顺序醒过来
                //t1抢到CPU的执行权，在控制台输出：窗口1正在出售第1张票
                //假设t1继续拥有CPU的执行权，就会执行tickets--;操作，操作完毕后tickets = 0;
                //假设t2抢到了CPU的执行权，在控制台输出：窗口2正在出售第0张票
                //假设t2继续拥有CPU的执行权，就会执行tickets--;操作,tickets = -1
                //t3抢到了CPU的执行权，在控制台输出：窗口3正在出售第1张票
                //假设t3继续拥有CPU的执行权，就会执行tickets--;操作,tickets = -2
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
}
