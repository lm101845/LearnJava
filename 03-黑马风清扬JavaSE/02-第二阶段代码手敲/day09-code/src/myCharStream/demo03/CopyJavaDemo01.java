package myCharStream.demo03;

/**
 * @author ����
 * @date 2021��07��05�� 5:53
 */


import java.io.*;

/**
 * ����
 * ��ģ��Ŀ¼�µ�ConversionStreamDemo.java ���Ƶ�ģ��Ŀ¼�µ� Copy.java
 * <p>
 * ˼·��
 * 1:��������Դ�����ַ�����������
 * 2:����Ŀ�ĵش����ַ����������
 * 3:��д���ݣ������ļ�
 * 4:�ͷ���Դ
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //��������Դ�����ַ�����������
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\ConversionStreamDemo.java"));

        //����Ŀ�ĵش����ַ����������
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\copy.java"));

        //��д���ݣ������ļ�
        //һ�ζ�дһ���ַ���������
//        int ch;
//        while ((ch=isr.read())!= -1){
//            osw.write(ch);
//        }

        //һ�ζ�дһ���ַ���������
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1){
            osw.write(chs,0,len);
        }

        //�ͷ���Դ
        osw.close();
        isr.close();
    }
}
