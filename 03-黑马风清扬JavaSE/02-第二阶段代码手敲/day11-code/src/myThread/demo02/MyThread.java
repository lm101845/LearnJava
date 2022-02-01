package myThread.demo02;

/**
 * @Author ÀîÃ÷
 * @Date 2022/2/1  11:58
 **/
public class MyThread extends Thread{
    public MyThread(){};
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println(getName() + ":" + i);
        }
    }
}
