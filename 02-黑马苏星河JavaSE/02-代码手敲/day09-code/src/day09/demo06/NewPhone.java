package day09.demo06;

/**
 * @author ����
 * @date 2021��06��09�� 6:59
 */

//����һ�����ֻ���ʹ�����ֻ���Ϊһ������
public class NewPhone extends Phone{
    @Override
    public void show() {
        //System.out.println("��ʾ����");
        //��ʾ���븸���У��ҿ��Բ�д��ʹ��super�ؼ�����ʹ�ø��෽��

        super.show();  //�Ѹ����show�����ù����ظ�����
        //�Լ�������Ӷ���ĸ�������
        System.out.println("��ʾ����");
        System.out.println("��ʾͷ��");
    }
}
