package myThread.demo05;

/**
 * @Author ����
 * @Date 2022/2/1  14:40
 **/
public class MyRunnable implements Runnable{
    //����д�ĺô����������������Լ�ʵ�ֵĸ�����
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            // System.out.println(getName() + ":" + i);
            //�������ʵ����Runnable�ӿڣ���Thread��û�й�ϵ�����Ե���getName�����ᱨ��
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //����д����
        }
    }
}
