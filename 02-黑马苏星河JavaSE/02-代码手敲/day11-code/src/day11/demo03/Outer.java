package day11.demo03;

/**
 * @author ����
 * @date 2021��06��14�� 22:22
 */

// �������������������ô��ʽ�ǣ��ⲿ������.this.�ⲿ���Ա������
public class Outer {
    int num = 10;  //�ⲿ��ĳ�Ա����
    public class Inner /*extends Object*/{
        //������Ǽ̳й�ϵ������˵�������һ������
        //����������˵���������һ�����壬��仰�ǲ��Եģ���������
        int num = 20;   //�ڲ���ĳ�Ա����
        public void methodInner(){
            int num = 30;    //�ڲ��෽���ľֲ�����
            System.out.println(num);   //�ֲ��������ͽ�ԭ��
            System.out.println(this.num);   //�ڲ���ĳ�Ա����
            //System.out.println(super.num);
            //������Ϊ�ڲ�����ⲿ�ಢ���Ǽ̳й�ϵ������
            System.out.println(Outer.this.num);   //�ⲿ��ĳ�Ա����
        }
    }
}
