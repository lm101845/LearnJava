package day08.demo01;

/**
 * @author ����
 * @date 2021��06��04�� 15:04
 */

/**
java.lang.String������ַ�����
API����˵��Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡�
��ʵ����˵�����������е�˫�����ַ���������String��Ķ��󡣣�����û��new��Ҳ�����ǡ���

�ַ������ص㣺
1. �ַ��������������ɱ䡣���ص㡿
2. ������Ϊ�ַ������ɸı䣬�����ַ����ǿ��Թ���ʹ�õġ�
3. �ַ���Ч�����൱����char[]�ַ����飬���ǵײ�ԭ����byte[]�ֽ����顣
        �����ַ��������⴮�����ַ������������ַ���

�����ַ����ĳ���3+1�ַ�ʽ��
���ֹ��췽����
public String()������һ���հ��ַ������������κ����ݡ�
public String(char[] array)�������ַ���������ݣ���������Ӧ���ַ�����
public String(byte[] array)�������ֽ���������ݣ���������Ӧ���ַ�����
һ��ֱ�Ӵ�����
String str = "Hello"; // �ұ�ֱ����˫����

ע�⣺ֱ��д��˫���ţ������ַ�������
 */
public class Demo01String {
    public static void main(String[] args) {
        // ʹ�ÿղι���
        String str1 = new String();  // С�������գ�˵���ַ���ʲô���ݶ�û�С�
        System.out.println("��1���ַ���:" + str1);

        // �����ַ����鴴���ַ���
        char[] charArray = {'A','B','C'};
        String str2 = new String(charArray);
        System.out.println("��2���ַ���:" + str2);

        // �����ֽ����鴴���ַ���
        //�ַ����ĵײ��õľ���byte�ֽ�����
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println("��3���ַ���:" + str3);

        //ֱ�Ӵ���
        String str4 = "hello";
        System.out.println("��4���ַ�����" + str4);
    }

}
