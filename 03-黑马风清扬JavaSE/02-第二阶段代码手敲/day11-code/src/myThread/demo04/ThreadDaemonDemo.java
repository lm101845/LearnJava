package myThread.demo04;

/**
 * @Author ����
 * @Date 2022/2/1  12:49
 **/
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("����");
        td2.setName("�ŷ�");
        //�������߳�Ϊ����
        Thread.currentThread().setName("����");
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //�ŷɺ͹��������������ģ���������(���9)�Ժ���������Ҳ���ܻ�
            //��������֮������2��Ӧ����ɱ(���ù����ŷ�Ϊ�ػ��̼߳���)
            //������9�Ժ󣬹����ŷɲ��������ҵ������ǻ����ִ��1,2�ε�(��ɱҲҪ��������)
        }
    }
}
