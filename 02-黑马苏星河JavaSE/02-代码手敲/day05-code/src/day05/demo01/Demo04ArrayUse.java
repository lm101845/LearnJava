package day05.demo01;

/**
 * @author ����
 * @date 2021��06��02�� 2:40
 */

/**
ֱ�Ӵ�ӡ�������ƣ��õ����������Ӧ�ģ��ڴ��ַ��ϣֵ��������Ϊ�����������������ͣ�����
�����ƣ�01
ʮ���ƣ�0123456789
16���ƣ�0123456789abcdef

��������Ԫ�صĸ�ʽ����������[����ֵ]
����ֵ������һ��int���֣��������鵱��Ԫ�صı�š�
��ע�⡿����ֵ��0��ʼ��һֱ��������ĳ���-1��Ϊֹ��
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        // ��̬��ʼ����ʡ�Ը�ʽ
        int[] array = {10,20,30};
        System.out.println(array);
        //[I@1c53fd30

        // ֱ�Ӵ�ӡ���鵱�е�Ԫ��
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("===================");

        // Ҳ���Խ����鵱�е�ĳһ������Ԫ�أ���ֵ��������
        int num = array[1];
        System.out.println(num);
    }
}
