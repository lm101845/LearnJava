package myThread.demo01;

/**
 * @author ����
 * @date 2021��07��07�� 18:05
 */
public class MyThread extends Thread{
    //������ִ���߳������ַ�����һ�ַ����ǽ�������Ϊ Thread �����ࡣ������Ӧ��д Thread ��� run ������
    //ΪʲôҪ��д��ԭ����Ϊ��MyThread���п������������룬�����������д��붼��Ҫ���߳�ִ��
    //Ϊ��������Щ�����ǿ��Ա��߳�ִ�еģ�Java���ṩ��һ��run�����������Ƿ�װ���߳�ִ�еĴ���
    @Override
    public void run() {
        for(int i = 0; i < 100;i++){
            System.out.println(i);
        }
    }
}
