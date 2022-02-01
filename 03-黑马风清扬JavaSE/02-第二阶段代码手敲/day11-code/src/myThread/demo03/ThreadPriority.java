package myThread.demo03;

/**
 * @Author ÀîÃ÷
 * @Date 2022/2/1  12:32
 **/
public class ThreadPriority extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + ":" + i);
        }
    }
}
