package day09.demo03;

/**
 * @author ����
 * @date 2021��06��09�� 0:13
 */
public class Zi extends Fu{
    int num = 20;

    public void method(){
        int num = 30;
        //�ں����ڲ�����ı��������ֲ�����
        //ͨƪ�����ϣ���3��num
        //һ���Ǹ��൱�еĳ�Ա������һ�������൱�еĳ�Ա����������һ�������෽���ľֲ�����

        System.out.println(num);   //30,�ֲ�����
        System.out.println(this.num);   //20������ĳ�Ա����
        System.out.println(super.num);  //10,����ĳ�Ա����
    }
}
