package day08.demo02;

/**
 * @author ����
 * @date 2021��06��04�� 16:49
 */

/**
�ָ��ַ����ķ�����
public String[] split(String regex)�����ղ����Ĺ��򣬽��ַ����зֳ�Ϊ���ɲ��֡�

ע�����
split�����Ĳ�����ʵ��һ����������ʽ�������ѧϰ��
����Ҫע�⣺�������Ӣ�ľ�㡰.�������з֣�����д"\\."��������б�ܣ�
 */

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,d";
        //������ֻ��һ��˫���ţ���������ֻ��һ���ַ���
        //����������һ��
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("==============");

        String str2 = "aaa bbb ccc ddd";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===============");

        String str3 = "XXX.YYY.ZZZ";
        //String[] array3 = str3.split(".");
        //ֱ��д.���У�.��������ʽ�������⺬��
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length);  //0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
