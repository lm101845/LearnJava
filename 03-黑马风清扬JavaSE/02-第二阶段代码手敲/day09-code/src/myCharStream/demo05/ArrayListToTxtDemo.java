package myCharStream.demo05;

/**
 * @author ����
 * @date 2021��07��05�� 17:52
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
    ����
        ��ArrayList�����е��ַ�������д�뵽�ı��ļ���Ҫ��ÿһ���ַ���Ԫ����Ϊ�ļ��е�һ������

    ˼·��
        1:����ArrayList����
        2:�������д洢�ַ���Ԫ��
        3:�����ַ��������������
        4:�������ϣ��õ�ÿһ���ַ�������
        5:�����ַ��������������ķ���д����
        6:�ͷ���Դ
 */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        //����ArrayList����
        ArrayList<String> array = new ArrayList<>();

        //�������д洢�ַ���Ԫ��
        array.add("hello");
        array.add("world");
        array.add("java1");

        //�����ַ��������������
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\a.txt"));

        //�������ϣ��õ�ÿһ���ַ�������
        for(String s:array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        //�ͷ���Դ
        bw.close();
    }
}
