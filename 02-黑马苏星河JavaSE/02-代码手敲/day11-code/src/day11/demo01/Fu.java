package day11.demo01;

/**
 * @author ����
 * @date 2021��06��13�� 23:57
 */

/**
��final�ؼ�����������һ��������ʱ����������������շ�����Ҳ���ǲ��ܱ�������д��
��ʽ��
���η� final ����ֵ���� ��������(�����б�) {
    // ������
}

ע�����
�����ࡢ������˵��abstract�ؼ��ֺ�final�ؼ��ֲ���ͬʱʹ�ã���Ϊì�ܡ�(���󷽷�������д����final������������д������ì��)
 */
public abstract class Fu {
    public final void method(){
        System.out.println("���෽��ִ�У�");
    }

    public abstract /*final*/ void methodAbs();
}
