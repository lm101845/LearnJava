package day08.demo04;

/**
 * @author ����
 * @date 2021��06��04�� 21:30
 */

import java.util.Arrays;

/**
java.util.Arrays��һ����������صĹ����࣬�����ṩ�˴�����̬����������ʵ�����鳣���Ĳ�����

public static String toString(����)���������������ַ���������Ĭ�ϸ�ʽ��[Ԫ��1, Ԫ��2, Ԫ��3...]��
public static void sort(����)������Ĭ�����򣨴�С���󣩶������Ԫ�ؽ�������

��ע��
1. �������ֵ��sortĬ�ϰ��������С����
2. ������ַ�����sortĬ�ϰ�����ĸ����
3. ������Զ�������ͣ���ô����Զ��������Ҫ��Comparable����Comparator�ӿڵ�֧�֡������ѧϰ��
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        // ��int[]���鰴��Ĭ�ϸ�ʽ����ַ���
        System.out.println(intStr);  //[10, 20, 30]

        int[] array1 = {2,1,3,8,3,9};
        Arrays.sort(array1);
        //sort����ֵ������void���ͣ������������һ�������飬���Ǹ��������������
        System.out.println(array1);  //[I@75412c2f
        System.out.println(Arrays.toString(array1));  //[1, 2, 3, 3, 8, 9]

        String[] array2 = {"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));  //[aaa, bbb, ccc]
    }
}
