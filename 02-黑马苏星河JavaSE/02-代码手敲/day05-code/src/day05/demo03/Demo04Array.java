package day05.demo03;

/**
 * @author ����
 * @date 2021��06��02�� 4:01
 */

/**
�������飬˵�ľ��Ƕ����鵱�е�ÿһ��Ԫ�ؽ�����һ������������Ĭ�ϵĴ���ʽ���Ǵ�ӡ�����
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = { 15, 25, 30, 40, 50, 60, 75 };

        // ����ʹ��ԭʼ��ʽ
        System.out.println(array[0]); // 15
        System.out.println(array[1]); // 25
        System.out.println(array[2]); // 30
        System.out.println(array[3]); // 40
        System.out.println(array[4]); // 50
        System.out.println(array[5]); // 50
        System.out.println("=================");

        // ʹ��ѭ����������ʵ��������ĳ��ȡ�
        for (int i = 0; i < 6; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=================");

//        int len = array.length; // ����
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
