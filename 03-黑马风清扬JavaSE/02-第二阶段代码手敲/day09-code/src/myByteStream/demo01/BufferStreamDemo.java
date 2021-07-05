package myByteStream.demo01;

/**
 * @author ����
 * @date 2021��07��03�� 18:00
 */

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
    �ֽڻ�������
        BufferOutputStream
        BufferedInputStream

    ���췽����
        �ֽڻ����������BufferedOutputStream(OutputStream out)
        �ֽڻ�����������BufferedInputStream(InputStream in)

 java����������������жϵ�����ڴ棬���������ڴ�������������������ڴ��ж������������������μ����ڴ棬���̣����磬�նˣ���Ļ/���̣�
 */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        //�ֽڻ����������BufferedOutputStream(OutputStream out) ��������д����
//        FileOutputStream fos = new FileOutputStream("myByteStream\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //����2�����Խ����ϲ�Ϊһ��
        //д����
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\bos.txt"));
//            bos.write("hello\r\n".getBytes());
//            bos.write("world\r\n".getBytes());
//            //�ͷ���Դ
//        bos.close();

        //�ֽڻ�����������BufferedInputStream(InputStream in)
        //������
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\bos.txt"));
        //һ�ζ�ȡһ���ֽ�����
//        int by;
//        while((by = bis.read()) != -1){
//            System.out.println((char)by);
//        }

        //һ�ζ�ȡһ���ֽ���������
        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read())!= -1){
            System.out.println(new String(bys,0,len));
        }

        //�ͷ���Դ
        bis.close();
    }
}
