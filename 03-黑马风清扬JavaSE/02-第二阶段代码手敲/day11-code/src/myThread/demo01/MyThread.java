package myThread.demo01;

/**
 * @author 李明
 * @date 2021年07月07日 18:05
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100;i++){
            System.out.println(i);
        }
    }
}
