package day08.demo02;

/**
 * @author ����
 * @date 2021��06��04�� 15:41
 */

/**
==�ǽ��ж���ĵ�ֵַ�Ƚϣ����ȷʵ��Ҫ�ַ��������ݱȽϣ�����ʹ������������

public boolean equals(Object obj)�������������κζ���ֻ�в�����һ���ַ�������������ͬ�ĲŻ��true�����򷵻�false��
ע�����
1. �κζ�������Object���н��ա�
2. equals�������жԳ��ԣ�Ҳ����a.equals(b)��b.equals(a)Ч��һ����
3. ����Ƚ�˫��һ������һ���������Ƽ��ѳ����ַ���д��ǰ�档
�Ƽ���"abc".equals(str)    ���Ƽ���str.equals("abc")

public boolean equalsIgnoreCase(String str)�����Դ�Сд���������ݱȽϡ�
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));  //true
        System.out.println(str2.equals(str3));  //true
        //str2��str3�����==���бȽϵĻ�����false����Ϊ��ֵַ��ͬ������equalsֻ�Ƚ����ݣ�������true
        System.out.println(str3.equals("hello"));  //true
        System.out.println("hello".equals(str1));;  //true
        String str4 = "Hello";
        System.out.println(str1.equals(str4));   //false һ����дһ��Сд

        System.out.println(str1.equalsIgnoreCase(str4)); //true  ���Դ�Сд�Ƚ�����
        //ע�⣺����Ĵ�Сдֻ��ʾӢ�ĵĴ�Сд�����������ĵĴ�Сд��������
        //�����ʦʵ����̫ϸ�ˣ�������С�׽�ѧ��

        //String str5 = "abc";
        String str5 = null;
        System.out.println("abc".equals(str5));  //�Ƽ������str5Ϊnull���������ᱨ��
        //System.out.println(str5.equals("abc"));  //���Ƽ�,���str5Ϊnull���ᱨ��.NullPointerException����ָ���쳣
    }
}
