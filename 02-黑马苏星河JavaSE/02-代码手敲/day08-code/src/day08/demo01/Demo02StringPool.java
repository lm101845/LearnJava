package day08.demo01;

/**
 * @author ����
 * @date 2021��06��04�� 15:25
 */

/**
�ַ��������أ�������ֱ��д�ϵ�˫�����ַ����������ַ����������С�

���ڻ���������˵��==�ǽ�����ֵ�ıȽϡ�
��������������˵��==�ǽ��С���ֵַ���ıȽϡ�
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str3);
        //ȫ������һ����3���ַ���

        System.out.println(str1 == str2);  //true
        System.out.println(str1 == str3);  //false
        System.out.println(str2 == str3);  //false
    }
}
