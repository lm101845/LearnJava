package day05.demo03;

/**
 * @author ����
 * @date 2021��06��02�� 4:09
 */

/**
����Ԫ�صķ�ת��
���������ӣ�[1, 2, 3, 4]
֮������ӣ�[4, 3, 2, 1]

Ҫ����ʹ�������飬����ԭ����Ψһһ�����顣
   ��������һ�������飬�Ѿ�����forѭ���ߵ������������Ͳ�������
 */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };

        // ������ӡ���鱾��������
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==================");

        /*
        ��ʼ����䣺int min = 0, max = array.length - 1
        �����жϣ�min < max
        �������ʽ��min++, max--
        ѭ���壺�õ�������������
         */
        for(int min = 0,max=array.length - 1;min<max;min++,max--){
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        // �ٴδ�ӡ��������������������
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
