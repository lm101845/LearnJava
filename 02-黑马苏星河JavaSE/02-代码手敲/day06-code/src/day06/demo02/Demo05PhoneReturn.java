package day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        //����two���н��գ�����Ҫ�ͷ�������ֵ����һ�£�����ǰ��д��Phone
        //main����û�д����������������������ô�����أ�
        //���Ǵӷ����ķ���ֵ(one)������
        //���ұ�û��new�����ǵ��÷����ˡ�
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone(){
        //?��������ǰ���Phone��ʲô��˼����������
        //Phone��ʾ�����ķ���ֵ����������Phone����
        Phone one = new Phone();
        one.brand = "ƻ��";
        one.price = 8388.0;
        one.color = "������";
        return one;
        //˭�������ң��ҾͰ�one�ĵ�ַ����˭
    }
}
