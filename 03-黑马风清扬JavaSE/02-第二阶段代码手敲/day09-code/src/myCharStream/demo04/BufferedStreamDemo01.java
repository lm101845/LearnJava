package myCharStream.demo04;

/**
 * @author ����
 * @date 2021��07��05�� 9:41
 */

import java.io.*;

/**
    �ַ���������
        BufferedWriter�����ı�д���ַ�������������ַ������ṩ�����ַ���������ַ����ĸ�Чд�룬����ָ����������С�����߿��Խ���Ĭ�ϴ�С��Ĭ��ֵ�㹻�󣬿����ڴ������;
        BufferedReader�����ַ���������ȡ�ı��������ַ������ṩ�ַ���������еĸ�Ч��ȡ������ָ����������С�����߿���ʹ��Ĭ�ϴ�С�� Ĭ��ֵ�㹻�󣬿����ڴ������;

    ���췽����
        BufferedWriter(Writer out)
        BufferedReader(Reader in)
 */
public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //BufferedWriter(Writer out)
        //FileWriter fw = new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\bos.txt");
        //BufferedWriter bw = new BufferedWriter(fw);

        //�ϲ�д��
//        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\bw.txt"));
//
//        bw.write("hello\r\n");
//        bw.write("world\r\n");
//        bw.close();

        //BufferedReader(Reader in)
        BufferedReader br = new BufferedReader(new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\bw.txt"));
        //һ�ζ�һ���ַ�����
//        int ch;
//        while ((ch = br.read()) != -1){
//            System.out.println((char)ch);
//        }

        //һ�ζ�ȡһ���ַ���������
        char[] chs = new char[1024];
        int len;
        while ((len = br.read()) != -1){
            System.out.println(new String(chs,0,len));
        }
    }
}
