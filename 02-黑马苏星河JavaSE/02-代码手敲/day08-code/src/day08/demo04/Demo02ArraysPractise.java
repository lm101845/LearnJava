package day08.demo04;

/**
 * @author ����
 * @date 2021��06��04�� 21:58
 */

import java.util.Arrays;

/**
��Ŀ��
��ʹ��Arrays��ص�API����һ������ַ����е������ַ��������У��������ӡ��
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "asv76agfqwdfvasdfvjh";

        // ��ν����������У�sort
        // ������һ�����飬������Arrays.sort����
        // String --> ���飬��toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);   //���ַ����������������


        for (int i = chars.length-1; i >= 0; i--) {
            //��Ҫ�������(�Ӻ���ǰ)
            //�����ݼ���chars.forr
            System.out.println(chars[i]);
        }
    }
}
