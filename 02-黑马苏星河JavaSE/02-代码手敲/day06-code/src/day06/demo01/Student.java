package day06.demo01;
/**
����һ���࣬����ģ�⡰ѧ����������о���������ɲ��֣�

���ԣ���ʲô����
    ����
    ����
��Ϊ������ʲô����
    �Է�
    ˯��
    ѧϰ

��Ӧ��Java���൱�У�

��Ա���������ԣ���
    String name; // ����
    int age; // ����

��Ա��������Ϊ����
    public void eat() {} // �Է�
    public void sleep() {} // ˯��
    public void study() {} // ѧϰ

ע�����
1. ��Ա������ֱ�Ӷ������൱�еģ��ڷ�����ߡ�
2. ����Ա������Ҫдstatic�ؼ��֡���
 */
public class Student {
    //�����Ȳ�дMain����

    //��д��Ա����(��ǰд�ı������оֲ���������Ϊ���Ƕ�д�ڷ����ڲ���)
    //����������ֱ�Ӱѱ���д���൱�У�λ�÷����˸ı䣬���ͳ��˳�Ա������
    String name;  //����
    int age;      //����

    //��д��Ա����
    public void eat(){
        System.out.println("�Է�����");
    }

    public void sleep(){
        System.out.println("˯������");
    }

    public void study(){
        System.out.println("ѧϰ��");
    }
}
