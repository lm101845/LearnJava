package demo01;

/**
 * @Author ����
 * @Date 2022/2/4  12:41
 **/

/**
 * ��������һ���̣߳��ڿ���̨���һ�仰�����̳߳���������
 * */
public class LambdaDemo {
    public static void main(String[] args) {
        //���õ�ʵ����ķ�ʽʵ��������
//        MyRunnable my = new MyRunnable();
//        Thread t = new Thread(my);
//        t.start();

        //ʹ�������ڲ���ķ�ʽ���иĽ�
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("���̳߳���������");
//            }
//        }).start();

        //Lambda���ʽ�ķ�ʽ�Ľ�
        new Thread(()->{
            System.out.println("���̳߳���������111");
        }).start();
    }
}
