package myThread.demo08;

/**
 * @Author ����
 * @Date 2022/2/1  14:52
 **/
public class SellTicket implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();
    //ע�⣺3���߳�ֻ����һ����
    @Override
    public void run(){
        while(true){
            //tickets = 100
            //t1,t2,t3
            //����t1������CPU��ִ��Ȩ
            //����t2������CPU��ִ��Ȩ(t1��Ϣ��ʱ������)�����Ƿ��ֱ����ˣ���Ȼ�����˻����ò��ˣ�ֻ�ܵ�
            synchronized (obj){
                //t1�����󣬾ͻ����δ����������
                if(tickets > 0){
                    try {
                        Thread.sleep(100);
                        //t1��Ϣ100����
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
                    tickets--;
                }
            }

        }
    }
}
