package myByteStream.demo02;

/**
 * @author ����
 * @date 2021��07��03�� 2:27
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
    ����
        ��E:\\itcast\\mn.jpg���Ƶ�ģ��Ŀ¼�µ�mn.jpg

    ˼·��
        1:��������Դ�����ֽ�����������
        2:����Ŀ�ĵش����ֽ����������
        3:��д���ݣ�����ͼƬ(һ�ζ�ȡһ���ֽ����飬һ��д��һ���ֽ�����)
        4:�ͷ���Դ
 */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        //��������Դ�����ֽ�����������
        FileInputStream fis = new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\logo.png");
        //����Ŀ�ĵش����ֽ����������
        FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\cat.png");

        //��д���ݣ�����ͼƬ(һ�ζ�ȡһ���ֽ����飬һ��д��һ���ֽ�����)
        byte[] bys = new byte[1024];
        int len;
        while((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
    }
}
