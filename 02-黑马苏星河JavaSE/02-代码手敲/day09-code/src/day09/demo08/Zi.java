package day09.demo08;

/**
 * @author ����
 * @date 2021��06��09�� 7:37
 */

/**
 * super�ؼ��ֵ��÷������֣�
 * 1. ������ĳ�Ա�����У����ʸ���ĳ�Ա������
 * 2. ������ĳ�Ա�����У����ʸ���ĳ�Ա������
 * 3. ������Ĺ��췽���У����ʸ���Ĺ��췽����
 */
public class Zi extends Fu {
    int num = 20;

    public void methodZi() {
        System.out.println(num);
        System.out.println(super.num);
    }

    public void method(){
        super.method();  //���ʸ����еĳ�Ա����
        System.out.println("���෽��");
    }
}
