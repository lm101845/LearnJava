package myByteStream.demo01;

/**
 * @author ����
 * @date 2021��07��02�� 23:38
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream���ļ���������ڽ�����д��File
 * FileOutputStream(String name)�������ļ��������ָ��������д���ļ�
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //�����ֽ����������
        //FileOutputStream(String name)�������ļ��������ָ��������д���ļ�
        FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\fos.txt");
        /**
         �����������飺
         A:����ϵͳ���ܴ������ļ�
         B:�������ֽ����������
         C:���ֽ����������ָ�򴴽��õ��ļ�
         ���������󡪡�д�ļ�����ʩ����Դ
         */

        //void write(int b)����ָ�����ֽ�д����ļ������
        fos.write(97);  //a
        fos.write(57);  //9
        fos.write(55);  //7

        //�����97��������97�������ַ�9��7

        //���Ҫ�ͷ���Դ
        //void close()���رմ��ļ���������ͷ��������������κ�ϵͳ��Դ��
        fos.close();
    }
}
