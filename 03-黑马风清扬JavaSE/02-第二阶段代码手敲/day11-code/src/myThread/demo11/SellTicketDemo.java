package myThread.demo11;

/**
 * @Author ����
 * @Date 2022/2/1  16:41
 **/
public class SellTicketDemo {
    public static void main(String[] args) {
        //���� SellTicket��Ķ���
        SellTicket st = new SellTicket();
        //�������� Thread��Ķ��󣬰�SellTicket������Ϊ���췽���Ĳ�������������Ӧ�Ĵ�������
        Thread t1 = new Thread(st,"����1");
        Thread t2 = new Thread(st,"����2");
        Thread t3 = new Thread(st,"����3");

        //�����߳�
        t1.start();
        t2.start();
        t3.start();
    }
}
