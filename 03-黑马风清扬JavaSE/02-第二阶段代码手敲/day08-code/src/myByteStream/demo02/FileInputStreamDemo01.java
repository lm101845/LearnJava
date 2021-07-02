package myByteStream.demo02;

/**
 * @author ����
 * @date 2021��07��03�� 1:02
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
    ����
        ���ļ�fos.txt�е����ݶ�ȡ�����ڿ���̨���

    FileInputStream�����ļ�ϵͳ�е��ļ���ȡ�����ֽ�
        FileInputStream(String name)��ͨ������ʵ���ļ�������������һ��FileInputStream,���ļ����ļ�ϵͳ�е�·����name����

    ʹ���ֽ������������ݵĲ��裺
        1:�����ֽ�����������
        2:�����ֽ�����������Ķ����ݷ���
        3:�ͷ���Դ
 */
public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //�����ֽ�����������
        //FileInputStream(String name)
        FileInputStream fis = new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\fos.txt");

        //�����ֽ�����������Ķ����ݷ���
        //int read()���Ӹ���������ȡһ���ֽڵ�����
//        //��һ�ζ�ȡ����
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);
//
//        //�ڶ��ζ�ȡ����
//        by = fis.read();
//        System.out.println(by);
//        System.out.println((char)by);

//        //�ٶ��ȡ2��
//        by = fis.read();
//        System.out.println(by);
//
//        by = fis.read();
//        System.out.println(by);
//        //����ļ���û�������ˣ����ǲ���һ�ζ�ȡһ�����ݵķ�ʽ�����ķ���ֵ����-1

        //����ÿ��ֻ�ܶ�һ�Σ���ôд̫�鷳��������ѭ�������иĽ�
        //д��1.0
//        int by = fis.read();
//        while(by != -1){
//            System.out .print((char)by);
//            by = fis.read();
//        }

        //�Ż�����ĳ���2.0
        int by;
          /**
            fis.read()��������
            by=fis.read()���Ѷ�ȡ�������ݸ�ֵ��by
            by != -1���ж϶�ȡ���������Ƿ���-1
         */
        while((by = fis.read() )!= -1){
            System.out.print((char)by);
        }
        //�ͷ���Դ
        fis.close();
    }
}
