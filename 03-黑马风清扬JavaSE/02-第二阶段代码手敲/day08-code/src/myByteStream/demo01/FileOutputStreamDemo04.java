package myByteStream.demo01;

/**
 * @author ����
 * @date 2021��07��03�� 0:45
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * �ֽ���д���ݼ����쳣����
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args){
//        try {
//            FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\fos.txt");
//            fos.write("hello".getBytes());
//            fos.close();
//            //���и�IO������ص����ݣ����Ƕ�Ҫȥ�ͷ���Դ����Ҫ��֤��Դһ�����ͷŵ�
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //����finally��ʵ���ͷ���Դ
        FileOutputStream fos = null;
        try {
            //fos = new FileOutputStream("E:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\fos.txt");
            fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day08-code\\itcast\\fos.txt");
            fos.write("hello".getBytes());
            //���и�IO������ص����ݣ����Ƕ�Ҫȥ�ͷ���Դ����Ҫ��֤��Դһ�����ͷŵ�
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
