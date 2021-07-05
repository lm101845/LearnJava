package myCharStream.demo02;

/**
 * @author ����
 * @date 2021��07��05�� 4:25
 */

import java.io.*;

/**
    InputStreamReader���Ǵ��ֽ������ַ���������
        ����ȡ�ֽڣ���ʹ��ָ���ı��뽫�����Ϊ�ַ�
        ��ʹ�õ��ַ�������������ָ����Ҳ���Ա���ȷָ�������߿��Խ���ƽ̨��Ĭ���ַ���

    OutputStreamWriter���Ǵ��ַ������ֽ���������
        �Ǵ��ַ������ֽ�����������ʹ��ָ���ı��뽫д����ַ�����Ϊ�ֽ�
        ��ʹ�õ��ַ�������������ָ����Ҳ���Ա���ȷָ�������߿��Խ���ƽ̨��Ĭ���ַ���
 */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        //        OutputStreamWriter(OutputStream out) ����һ��ʹ��Ĭ���ַ������OutputStreamWriter��
        //        OutputStreamWriter(OutputStream out, String charsetName) ����һ��ʹ�������ַ�����OutputStreamWriter��

//        FileOutputStream fos = new FileOutputStream("day09-code\\osw.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);

        //��д���£�
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\osw.txt"));
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\osw.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\osw.txt"),"GBK");
        osw.write("�й�");
        osw.close();


        //        InputStreamReader(InputStream in) ����һ��ʹ��Ĭ���ַ�����InputStreamReader��
        //        InputStreamReader(InputStream in, String charsetName) ����һ��ʹ�������ַ�����InputStreamReader��
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\osw.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\osw.txt"),"GBK");
        //һ�ζ�ȡһ���ַ�����
        int ch;
        while ((ch = isr.read()) !=-1){
            System.out.print((char)ch);
        }
        isr.close();
    }
}
