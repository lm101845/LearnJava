package day08.demo02;

/**
 * @author ����
 * @date 2021��06��04�� 16:36
 */

import java.nio.charset.StandardCharsets;

/**
String������ת����صĳ��÷����У�

public char[] toCharArray()������ǰ�ַ�����ֳ�Ϊ�ַ�������Ϊ����ֵ��
public byte[] getBytes()����õ�ǰ�ַ����ײ���ֽ����顣
public String replace(CharSequence oldString, CharSequence newString)��
�����г��ֵ����ַ����滻��Ϊ�µ��ַ����������滻֮��Ľ�������ַ�����
��ע��CharSequence��ʾ�ӿڣ���˼����˵���Խ����ַ������͡�
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);
        System.out.println(chars[4]);
        System.out.println(chars.length);  //5
        //����.length������û��С���ŵģ�����������

        System.out.println("================");

        //ת����Ϊ�ֽ�����
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        System.out.println("=================");

        //�ַ����������滻
        String str1 = "how do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);

        String lang1 = "�᲻���氡�����ү��!���ү�ģ����ү�ģ�";
        String lang2 = lang1.replace("���ү��", "****");
        System.out.println(lang2);   //�᲻���氡��****!****��****��
    }
}
