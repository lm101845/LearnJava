package myThread.demo04;

/**
 * @Author ����
 * @Date 2022/2/1  12:49
 **/
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("����");
        tj2.setName("�İ���");
        tj3.setName("�˰���");

        tj1.start();
        try {
            tj1.join();
            //ֻ�п�������(�߳�ִ�����֮��)�������2���̲߳ſ�ʼִ��(�����λ)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
