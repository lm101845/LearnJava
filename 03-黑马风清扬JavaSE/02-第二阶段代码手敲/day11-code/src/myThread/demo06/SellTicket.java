package myThread.demo06;

/**
 * @Author ����
 * @Date 2022/2/1  14:52
 **/
//����һ���� SellTicketʵ��Runnable�ӿڣ����涨��һ����Ա������private int tickets = 100;
public class SellTicket implements Runnable{
    private int tickets = 100;
    //�� SellTicket������дrun()����ʵ����Ʊ�����벽������
    @Override
    public void run(){
        // 1.�ж�Ʊ������ 0������Ʊ������֪���ĸ���������
        // 2.����Ʊ֮����Ʊ��Ҫ�� 1
        // 3.Ʊû���ˣ�Ҳ�����������ʣ�������������ѭ������Ʊ�Ķ���һֱִ��
        while(true){
            if(tickets > 0){
                System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
                tickets--;
            }
        }
    }
}
