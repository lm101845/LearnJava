package myCharStream.demo05;

/**
 * @author ����
 * @date 2021��07��05�� 18:07
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
    ����
        ���ı��ļ��е����ݶ�ȡ�������У����������ϡ�Ҫ���ļ���ÿһ��������һ������Ԫ��

    ˼·��
        1:�����ַ���������������
        2:����ArrayList���϶���
        3:�����ַ���������������ķ���������
        4:�Ѷ�ȡ�����ַ������ݴ洢��������
        5:�ͷ���Դ
        6:��������
 */
public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        //�����ַ���������������
        BufferedReader br = new BufferedReader(new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\a.txt"));

        //����ArrayList���϶���
        ArrayList<String> array = new ArrayList<>();

        //�����ַ���������������ķ���������
        String line;
        while((line = br.readLine()) != null){
            //�Ѷ�ȡ�����ַ������ݴ洢��������
            array.add(line);
        }

        //�ͷ���Դ
        br.close();

        //��������
        for(String s : array) {
            System.out.println(s);
        }
    }
}
