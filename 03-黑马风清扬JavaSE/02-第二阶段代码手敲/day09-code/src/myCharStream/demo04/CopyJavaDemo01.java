package myCharStream.demo04;

/**
 * @author ����
 * @date 2021��07��05�� 9:52
 */

import java.io.*;

/**
    ����
        ��ģ��Ŀ¼�µ�ConversionStreamDemo.java ���Ƶ�ģ��Ŀ¼�µ� Copy.java

    ˼·��
        1:��������Դ�����ַ���������������
        2:����Ŀ�ĵش����ַ��������������
        3:��д���ݣ������ļ�
        4:�ͷ���Դ
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //��������Դ�����ַ���������������
        BufferedReader br = new BufferedReader(new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\ConversionStreamDemo.java"));
        //����Ŀ�ĵش����ַ��������������
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\copy.java"));

        //��д���ݣ������ļ�
        //һ�ζ�дһ���ַ�����
//        int ch;
//        while ((ch = br.read()) != -1){
//            bw.write(ch);
//        }

        //һ�ζ�дһ���ַ���������
        char[] chs = new char[2048];
        int len;
        while ((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
        }
        //�ͷ���Դ
        bw.close();
        br.close();
    }
}
