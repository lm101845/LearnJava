package day05.demo03;

/**
 * @author ����
 * @date 2021��06��02�� 3:56
 */

/**
��λ�ȡ����ĳ��ȣ���ʽ��
��������.length

�⽫��õ�һ��int���֣���������ĳ��ȡ�

����һ�����������������ڼ䣬���Ȳ��ɸı䡣
 */
public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = {10, 20, 30, 3, 5, 4, 6, 7, 8, 8, 65, 4, 44, 6, 10, 3, 5, 4, 6, 7, 8, 8, 65, 4};
        int len = arrayB.length;
        System.out.println("arrayB����ĳ����ǣ�" + len);
        System.out.println("=============");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length); // 3
        arrayC = new int[5];
        System.out.println(arrayC.length); // 5
        //�Ⱥ���������֣��ұ߲������飡����
    }
}
