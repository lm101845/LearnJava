package myCharStream.demo03;

/**
 * @author ����
 * @date 2021��07��05�� 6:06
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
    ����
        ��ģ��Ŀ¼�µ�ConversionStreamDemo.java ���Ƶ�ģ��Ŀ¼�µ� Copy.java

    ����Դ��Ŀ�ĵصķ���
        ����Դ��myCharStream\\ConversionStreamDemo.java --- ������ --- Reader --- InputStreamReader --- FileReader
        Ŀ�ĵأ� myCharStream\\ Copy.java --- д���� --- Writer --- OutputStreamWriter --- FileWriter

    ˼·��
        1:��������Դ�����ַ�����������
        2:����Ŀ�ĵش����ַ����������
        3:��д���ݣ������ļ�

        4:�ͷ���Դ
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //��������Դ�����ַ�����������
        FileReader fr = new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\ConversionStreamDemo.java");
        //����Ŀ�ĵش����ַ����������
        FileWriter fw = new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\copy.java");


        //��д���ݣ������ļ�
//        int ch;
//        while ((ch = fr.read()) != -1){
//            fw.write(ch);
//        }

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }
        //�ͷ���Դ
        fw.close();
        fr.close();
    }
}
