package day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        //����Phone�ഴ��һ����Ϊone�Ķ���
        // ��ʽ�������� ������ = new ������();
        Phone one = new Phone();

        System.out.println(one.brand);      //null
        System.out.println(one.price);      //0.0
        System.out.println(one.color);      //null
        System.out.println("======================");

        one.brand = "ƻ��";
        one.price = 8388.0;
        one.color = "��ɫ";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("======================");

        one.call("�ǲ�˹");
        one.sendMesage();
    }
}
