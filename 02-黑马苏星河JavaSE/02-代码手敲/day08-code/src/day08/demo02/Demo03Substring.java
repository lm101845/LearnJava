package day08.demo02;

/**
 * @author ����
 * @date 2021��06��04�� 16:12
 */

/*
�ַ����Ľ�ȡ������

public String substring(int index)����ȡ�Ӳ���λ��һֱ���ַ���ĩβ���������ַ�����
public String substring(int begin, int end)����ȡ��begin��ʼ��һֱ��end�������м���ַ�����
��ע��[begin,end)��������ߣ��������ұߡ�
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "helloworld";
        String str2 = str1.substring(5);
        System.out.println(str1);   //helloworld��ԭ�ⲻ��
        System.out.println(str2);   //world�����ַ���
        System.out.println("=============");

        String str3 = str1.substring(4,7);
        System.out.println(str3);  //owo
        System.out.println("=============");


        // ��������д�����ַ�����������Ȼ��û�иı��
        // �����������ַ�����"Hello"��"Java"
        // strA���б�����ǵ�ֵַ��
        // ������ֵַ��Hello��0x666��
        // ������ֵַ�����Java��0x999
        String strA = "Hello";
        System.out.println(strA);  //Hello
        strA = "Java";
        System.out.println(strA);  //Hello

    }
}
