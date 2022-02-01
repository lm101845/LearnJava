package myThread.demo12;

/**
 * @Author ����
 * @Date 2022/2/1  17:04
 **/
public class Box {
    //����һ����Ա��������ʾ��xƿ��
    private int milk;
    //����һ����Ա��������ʾ�����״̬
    private boolean state = false;
    //�ṩ�洢ţ�̺ͻ�ȡţ�̵Ĳ���
    public synchronized void put(int milk){
        //�����ţ�̣��ȴ����ѣ���������
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //���û��ţ�̣�������ţ��
        this.milk = milk;
        System.out.println("���̹�����" + this.milk + "ƿ�̷�������");
        //�������֮���޸�����״̬
        state = true;
        //���������ȴ����߳�
        notifyAll();
    }

    public synchronized void get(){
        //���û��ţ�̣��ȴ�����
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //�����ţ�̣�������ţ��
        System.out.println("�û��õ���" + this.milk + "ƿ��");
        //�������֮���޸�����״̬
        state = false;
        //���������ȴ����߳�
        notifyAll();
    }
}
