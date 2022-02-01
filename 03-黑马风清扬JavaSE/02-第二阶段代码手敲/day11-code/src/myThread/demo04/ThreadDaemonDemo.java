package myThread.demo04;

/**
 * @Author 李明
 * @Date 2022/2/1  12:49
 **/
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");
        //设置主线程为刘备
        Thread.currentThread().setName("刘备");
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //张飞和关羽是来保刘备的，刘备死了(输出9)以后，你们两个也不能活
            //刘备死了之后，你们2个应该自杀(设置关羽、张飞为守护线程即可)
            //刘备到9以后，关羽，张飞不会立即挂掉，还是会继续执行1,2次的(自杀也要挣扎几下)
        }
    }
}
