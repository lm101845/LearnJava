package day10.demo01;

/**
 * @author ����
 * @date 2021��06��11�� 6:30
 */

/**
���κΰ汾��Java�У��ӿڶ��ܶ�����󷽷���
��ʽ��
public abstract ����ֵ���� ��������(�����б�);
 (���󷽷���û�з�����ģ�û�д����ŵ�)

ע�����
1. �ӿڵ��еĳ��󷽷������η������������̶��Ĺؼ��֣�public abstract
2. �������ؼ������η�������ѡ���Ե�ʡ�ԡ��������ѧ�����Բ��Ƽ�����
3. ��������Ҫ�أ��������ⶨ�塣
 */
public interface MyInterfaceAbstract {

    //����һ�����󷽷�
    public abstract void methodAbs1();

    //��Ҳ�ǳ��󷽷�
    abstract void methodAbs2();

    //��Ҳ�ǳ��󷽷�
    public void methodAbs3();

    //��Ҳ�ǳ��󷽷�
    void methodAbs4();
}
