package myThread.demo06;

/**
 * @Author ����
 * @Date 2022/2/1  14:51
 **/

/**
 *��������
 * ĳ��ӰԺĿǰ������ӳ������Ƭ������100��Ʊ��������3��������Ʊ�������һ������ģ��õ�ӰԺ��Ʊ
 * ʵ�ֲ��裺
 * ����һ���� SellTicketʵ��Runnable�ӿڣ����涨��һ����Ա������private int tickets = 100;
 * �� SellTicket������дrun()����ʵ����Ʊ�����벽������
 * 1.�ж�Ʊ������ 0������Ʊ������֪���ĸ���������
 * 2.����Ʊ֮����Ʊ��Ҫ�� 1
 * 3.Ʊû���ˣ�Ҳ�����������ʣ�������������ѭ������Ʊ�Ķ���һֱִ��
 * ����һ�������� SellTicketDemo��������main���������벽������
 * 1.���� SellTicket��Ķ���
 * 2.�������� Thread��Ķ��󣬰�SellTicket������Ϊ���췽���Ĳ�������������Ӧ�Ĵ�������
 * 3.�����߳�
 * */
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
