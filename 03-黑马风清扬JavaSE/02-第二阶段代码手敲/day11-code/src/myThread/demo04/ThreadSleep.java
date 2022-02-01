package myThread.demo04;

/**
 * @Author 李明
 * @Date 2022/2/1  12:49
 **/
public class ThreadSleep extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(1000);
                //我们每输出一次之后，就让线程休眠一秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
