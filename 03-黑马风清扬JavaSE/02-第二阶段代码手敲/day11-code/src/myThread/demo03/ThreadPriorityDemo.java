package myThread.demo03;

/**
 * @Author ����
 * @Date 2022/2/1  12:32
 **/
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("����");
        tp2.setName("�ɻ�");
        tp3.setName("����");

//        System.out.println(tp1.getPriority());  //5
//        System.out.println(tp2.getPriority());  //5
//        System.out.println(tp3.getPriority());  //5
        //�߳�Ĭ�ϵ����ȼ���5

//        tp1.setPriority(10000);
//        System.out.println(Thread.MAX_PRIORITY);  //10
//        System.out.println(Thread.MIN_PRIORITY);  //1
//        System.out.println(Thread.NORM_PRIORITY); //5

        //������ȷ�����ȼ�
        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(2);
        tp1.start();
        tp2.start();
        tp3.start();
    }
}
