package myByteStream.demo02;

/**
 * @author ����
 * @date 2021��07��03�� 2:01
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
    ���󣺰��ļ�fos.txt�е����ݶ�ȡ�����ڿ���̨���

    ʹ���ֽ������������ݵĲ��裺
        1:�����ֽ�����������
        2:�����ֽ�����������Ķ����ݷ���
        3:�ͷ���Դ
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //�����ֽ�����������
        FileInputStream fis = new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\fos.txt");

        //�����ֽ�����������Ķ����ݷ���
        //�����ֽ�����������Ķ����ݷ���
        //int read(byte[] b)���Ӹ���������ȡ��� b.length���ֽڵ����ݵ�һ���ֽ�����
        /*
        byte[] bys = new byte[5];
         */

//        byte[] bys = new byte[5];

//        //��һ�ζ�ȡ����
//        int len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));
//
//        //�ڶ��ζ�ȡ����
//        len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));
//
//         /*
//            hello\r\n
//            world\r\n
//
//            ��һ�Σ�hello
//            �ڶ��Σ�\r\nwor
//            �����Σ�ld\r\nr
//
//         */
//
//        //�����ζ�ȡ����
//        len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));
//
//        //�ٶ��ȡ����
//        len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));
//
//        len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));

        byte[] bys = new byte[1024]; //1024����������
        int len;
        while ((len=fis.read(bys))!=-1) {
            System.out.print(new String(bys,0,len));
        }
        //�ͷ���Դ
        fis.close();
    }
}
