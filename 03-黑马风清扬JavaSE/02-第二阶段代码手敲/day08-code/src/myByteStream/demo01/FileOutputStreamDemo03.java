package myByteStream.demo01;

/**
 * @author ����
 * @date 2021��07��03�� 0:31
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
    �ֽ���д���ݵ�����С����:
        1:�ֽ���д�������ʵ�ֻ����أ�
            window:\r\n
            linux:\n
            mac:\r

        2:�ֽ���д�������ʵ��׷��д���أ�
            public FileOutputStream(String name,boolean append)
                �����ļ��������ָ��������д���ļ���
                ����ڶ�������Ϊtrue �����ֽڽ�д���ļ���ĩβ�����ǿ�ͷ
 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //�����ֽ����������
        //FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\fos.txt");
        FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\fos.txt",true);

        //д����
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
            //������Ҫ���У���������д������֮�󣬼��뻻�з��ż���
        }
        //�ͷ���Դ
        fos.close();
    }
}
