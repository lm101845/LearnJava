package day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "ƻ��";
        one.price = 8388.0;
        one.color = "������";

        method(one);
        //���ݽ�ȥ�Ĳ�����ʵ���ǵ�ֵַ
    }

    public static void method(Phone param){
        //��param�յ�����ʵҲ�ǵ�ֵַ
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
    //����static�ľ�����ͨ�ķ�����������Ҫ����ֱ�Ӿ��ܵ���
}
