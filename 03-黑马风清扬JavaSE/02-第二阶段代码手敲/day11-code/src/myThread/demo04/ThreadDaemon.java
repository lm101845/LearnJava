package myThread.demo04;

/**
 * @Author ÀîÃ÷
 * @Date 2022/2/1  12:48
 **/
public class ThreadDaemon extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
