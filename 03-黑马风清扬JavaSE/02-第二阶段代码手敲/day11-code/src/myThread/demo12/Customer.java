package myThread.demo12;

/**
 * @Author ����
 * @Date 2022/2/1  17:07
 **/
public class Customer implements Runnable{
    private Box b;
    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run(){
        while(true){
            b.get();
            //������ͨ����ѭ����һ�̲�ͣ�Ļ�ȡ�����е�ţ��
        }
    }
}
