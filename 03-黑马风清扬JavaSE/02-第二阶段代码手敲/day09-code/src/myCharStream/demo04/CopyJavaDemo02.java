package myCharStream.demo04;

/**
 * @author ����
 * @date 2021��07��05�� 10:33
 */

import java.io.*;

/**
    ����
        ��ģ��Ŀ¼�µ�ConversionStreamDemo.java ���Ƶ�ģ��Ŀ¼�µ� Copy.java

    ˼·��
        1:��������Դ�����ַ���������������
        2:����Ŀ�ĵش����ַ��������������
        3:��д���ݣ������ļ�
            ʹ���ַ����������й���ʵ��
        4:�ͷ���Դ
 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //��������Դ�����ַ���������������
        BufferedReader br = new BufferedReader(new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\a.txt"));
        //����Ŀ�ĵش����ַ��������������
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\a.txt"));
        //��д���ݣ������ļ�
        //ʹ���ַ����������й���ʵ��
        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //�ͷ���Դ
        bw.close();
        br.close();
    }
}
