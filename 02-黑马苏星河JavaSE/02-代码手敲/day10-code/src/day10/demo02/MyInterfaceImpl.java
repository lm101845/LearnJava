package day10.demo02;

/**
 * @author ����
 * @date 2021��06��11�� 13:59
 */
public class MyInterfaceImpl implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {
        System.out.println("������д��A����");
    }



    @Override
    public void methodB() {
        System.out.println("������д��B����");
    }

//    @Override
//    public void methodBbs() {
//
//    }

    @Override
    public void methodAbs() {
        System.out.println("������д��AB�ӿڶ��еĳ��󷽷�");
        //��������ȥ�Է����Ұ�Ҳ����ȥ�Է�������ֻ��ȥ��һ�μ���
    }

    @Override
    public void methodDefault(){
        System.out.println("�Զ���ӿڵ��г�ͻ��Ĭ�Ϸ��������˸�����д");
    }
}
