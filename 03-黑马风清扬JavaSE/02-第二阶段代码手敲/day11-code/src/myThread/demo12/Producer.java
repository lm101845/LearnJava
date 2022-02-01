package myThread.demo12;

/**
 * @Author 李明
 * @Date 2022/2/1  17:07
 **/
public class Producer implements Runnable{
    private Box b;
    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 30; i++){
            b.put(i);
            //生产者生产了30瓶牛奶
        }
    }
}
