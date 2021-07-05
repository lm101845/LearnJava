package myCharStream.demo02;

/**
 * @author ����
 * @date 2021��07��05�� 5:43
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
    ���췽����
        InputStreamReader(InputStream in)������һ��ʹ��Ĭ���ַ�����InputStreamReader

    �����ݵ�2�ַ�ʽ��
        int read()��һ�ζ�һ���ַ�����
        int read(char[] cbuf)��һ�ζ�һ���ַ���������
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        //InputStreamReader(InputStream in)������һ��ʹ��Ĭ���ַ�����InputStreamReader
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\osw.txt"));

//        //int read()��һ�ζ�һ���ַ�����
//        int ch;
//        while ((ch=isr.read()) != -1){
//            System.out.print((char)ch);
//        }

        //int read(char[] cbuf)��һ�ζ�һ���ַ���������
        char[] chs = new char[1024];
        int len;
        while((len=isr.read(chs) )!= -1){
            System.out.print(new String(chs,1,len));
        }
        //�ͷ���Դ
        isr.close();
    }
}
