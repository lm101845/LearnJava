package day08.demo02;

/**
 * @author ����
 * @date 2021��06��04�� 15:58
 */

/**
String�������ȡ��صĳ��÷����У�

public int length()����ȡ�ַ������к��е��ַ��������õ��ַ������ȡ�
public String concat(String str)������ǰ�ַ����Ͳ����ַ���ƴ�ӳ�Ϊ����ֵ�µ��ַ�����
public char charAt(int index)����ȡָ������λ�õĵ����ַ�����������0��ʼ����
public int indexOf(String str)�����Ҳ����ַ����ڱ��ַ��������״γ��ֵ�����λ�ã����û�з���-1ֵ��
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        // ��ȡ�ַ����ĳ���
        int length = "skjdflkjsdlafjlsdjlaksdkf".length();
        System.out.println(length);

        //ƴ���ַ���
        //�ַ���������Ҫ�ĸ���ַ��������ݲ��ɸı䣡����������������������
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);  //helloworld,�µ��ַ���!!!!
        System.out.println("===================");

        // ��ȡָ������λ�õĵ����ַ�
        char ch = "hello".charAt(1);
        System.out.println("��һ������λ�õ��ַ��ǣ�" + ch);
        System.out.println("===================");

        // ���Ҳ����ַ����ڱ����ַ������г��ֵĵ�һ������λ��
        // �������û�У�����-1ֵ
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("��һ�ε�����ֵ�ǣ�" + index);  //2

        System.out.println("HelloWorld".indexOf("abc"));  //-1

    }
}
