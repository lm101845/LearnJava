package day09.demo06;

/**
 * @author ����
 * @date 2021��06��09�� 7:03
 */


public class Demo01Phone {
    public static void main(String[] args) {
        //���ֻ����ܡ���������Ҫ�޸��ϵ��࣬�����Ҫ�¹��ܣ�������
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("========================");

        //���ֻ�����
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.send();
        newPhone.show();
    }
}
