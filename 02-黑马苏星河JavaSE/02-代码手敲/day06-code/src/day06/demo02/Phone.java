package day06.demo02;
/**
����һ���࣬����ģ�⡰�ֻ������
���ԣ�Ʒ�ơ��۸���ɫ
��Ϊ����绰��������

��Ӧ���൱�У�
��Ա���������ԣ���
    String brand; // Ʒ��
    double price; // �۸�
    String color; // ��ɫ
��Ա��������Ϊ����
    public void call(String who) {} // ��绰
    public void sendMessage() {} // Ⱥ������
 */
public class Phone {
    //��Ա����
    String brand;  //Ʒ��
    double price;  //�۸�
    String color;  //��ɫ

    //��Ա����
    //��绰
    public void call(String who){
        System.out.println("��" + who + "��绰");
    }

    //Ⱥ������
    public void sendMesage(){
        System.out.println("Ⱥ������");
    }
}
