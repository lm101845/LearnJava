package myThread.demo01;

/**
 * @author ����
 * @date 2021��07��07�� 18:05
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100;i++){
            System.out.println(i);
        }
    }
}
