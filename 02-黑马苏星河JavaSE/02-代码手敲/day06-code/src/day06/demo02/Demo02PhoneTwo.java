package day06.demo02;

public class Demo02PhoneTwo {
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


        System.out.println("======================");

        Phone two = new Phone();

        System.out.println(two.brand);      //null
        System.out.println(two.price);      //0.0
        System.out.println(two.color);      //null
        System.out.println("======================");

        two.brand = "����";
        two.price = 5999.0;
        two.color = "��ɫ";

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("======================");

        two.call("ŷ��");
        two.sendMesage();
    }
}
