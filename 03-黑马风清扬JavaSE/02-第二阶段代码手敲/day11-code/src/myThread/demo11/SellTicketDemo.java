package myThread.demo11;

/**
 * @Author 李明
 * @Date 2022/2/1  16:41
 **/
public class SellTicketDemo {
    public static void main(String[] args) {
        //创建 SellTicket类的对象
        SellTicket st = new SellTicket();
        //创建三个 Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
