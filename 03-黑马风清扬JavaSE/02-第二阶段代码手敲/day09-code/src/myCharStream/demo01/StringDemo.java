package myCharStream.demo01;

/**
 * @author ����
 * @date 2021��07��05�� 4:11
 */

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
    ���룺
        byte[] getBytes()��ʹ��ƽ̨��Ĭ���ַ������� String����Ϊһϵ���ֽڣ�������洢���µ��ֽ�������
        byte[] getBytes(String charsetName)��ʹ��ָ�����ַ������� String����Ϊһϵ���ֽڣ�������洢���µ��ֽ�������

    ���룺
        String(byte[] bytes)��ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������µ� String
        String(byte[] bytes, String charsetName)��ͨ��ָ�����ַ�������ָ�����ֽ������������µ� String
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //����һ���ַ���
        String s = "�й�";

        //byte[] getBytes()��ʹ��ƽ̨��Ĭ���ַ������� String����Ϊһϵ���ֽڣ�������洢���µ��ֽ�������
        byte[] bys = s.getBytes();
        System.out.println(Arrays.toString(bys));  //[-42, -48, -71, -6]


        //byte[] getBytes(String charsetName)��ʹ��ָ�����ַ������� String����Ϊһϵ���ֽڣ�������洢���µ��ֽ�������
        byte[] bys2 = s.getBytes("GBK");  //[-42, -48, -71, -6]
        //byte[] bys2 = s.getBytes("UTF-8");         //[-28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(bys2));

        //String(byte[] bytes)��ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ�����ֽ������������µ� String��������û������
        //String(byte[] bytes, String charsetName)��ͨ��ָ�����ַ�������ָ�����ֽ������������µ� String
        //String ss = new String(bys);
        //String ss = new String(bys);
        //String ss = new String(bys,"UTF-8");  //?��?
        String ss = new String(bys,"GBK");
        System.out.println(ss);    //�й�
    }
}
