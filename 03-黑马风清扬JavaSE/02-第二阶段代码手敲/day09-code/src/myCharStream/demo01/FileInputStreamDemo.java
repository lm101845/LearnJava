package myCharStream.demo01;

/**
 * @author ����
 * @date 2021��07��05�� 3:04
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
    �����ֽ������ı��ļ�����

    һ�����ִ洢��
        �����GBK���룬ռ��2���ֽ�
        �����UTF-8���룬ռ��3���ֽ�
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\a.txt");
//        int by;
//        while ((by = fis.read()) != -1){
//            System.out.print((char)by);
//        }
//        fis.close();

        //String s = "abc";  //[97, 98, 99]
        String s = "�й�";   //[-28, -72, -83, -27, -101, -67]
        //byte[] bys = s.getBytes(StandardCharsets.UTF_8);    //[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK");            //[-42, -48, -71, -6]
        //���������ʲô�������洢�������ڴ洢��ʱ��һ���Ǹ�����������ƴ�ӵ�ʱ������֪�������Ǻ���
        System.out.println(Arrays.toString(bys));
    }
}
