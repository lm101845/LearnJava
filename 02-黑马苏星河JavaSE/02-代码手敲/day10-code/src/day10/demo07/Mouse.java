package day10.demo07;

/**
 * @author ����
 * @date 2021��06��13�� 22:54
 */

//������һ��USB�豸
//�ʼǱ����Ա�������һ��USB�豸����ֻ���õ���USB�豸
public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("�����");
    }

    @Override
    public void close() {
        System.out.println("�ر����");
    }

    //�������з���
    public void click(){
        System.out.println("�����");
    }
}
