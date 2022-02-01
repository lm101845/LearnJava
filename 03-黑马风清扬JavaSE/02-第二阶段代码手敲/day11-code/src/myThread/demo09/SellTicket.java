package myThread.demo09;

/**
 * @Author ����
 * @Date 2022/2/1  14:52
 **/
public class SellTicket implements Runnable{
//    private int tickets = 100;
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;
    //ע�⣺3���߳�ֻ����һ����
    @Override
    public void run(){
        while(true){
            if(x%2 == 0){
                //���Ǿ�̬ͬ����������
                synchronized (SellTicket.class){
//                synchronized (this){
//                synchronized (obj){
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
            }else{
//                synchronized (obj){
//                    //t1�����󣬾ͻ����δ����������
//                    if(tickets > 0){
//                        try {
//                            Thread.sleep(100);
//                            //t1��Ϣ100����
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
//                        tickets--;
//                    }
//                }
                sellTicket();
            }
            x++;
        }
    }

//    private void sellTicket() {
//        synchronized (obj){
//            //t1�����󣬾ͻ����δ����������
//            if(tickets > 0){
//                try {
//                    Thread.sleep(100);
//                    //t1��Ϣ100����
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
//                tickets--;
//            }
//        }
//    }

    //�������synchronized��ʾ�Է����ڲ���������������this
//    private synchronized void sellTicket() {
//            //t1�����󣬾ͻ����δ����������
//            if(tickets > 0){
//                try {
//                    Thread.sleep(100);
//                    //t1��Ϣ100����
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "���ڳ��۵�" + tickets + "��Ʊ");
//                tickets--;
//            }
//    }

    private static synchronized void sellTicket() {
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
