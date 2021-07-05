package myCharStream.demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author ����
 * @date 2021��07��05�� 4:43
 */
/*
    ���췽����
        OutputStreamWriter(OutputStream out)������һ��ʹ��Ĭ���ַ������OutputStreamWriter

    д���ݵ�5�ַ�ʽ��
        void write(int c)��дһ���ַ�
        void write(char[] cbuf)��д��һ���ַ�����
        void write(char[] cbuf, int off, int len)��д���ַ������һ����
        void write(String str)��дһ���ַ���
        void write(String str, int off, int len)��дһ���ַ�����һ����
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //���ǲ��õ����ַ���д���ݣ����ǲ���ֱ��д���ļ������ģ���һ��ʼ���ڻ���������
        //�ַ���������ֽ�����˵���л����
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-���������JavaSE\\02-�ڶ��׶δ�������\\day09-code\\content\\osw.txt"));

//        //д����������5�ַ�ʽ
//        osw.write(97);
//        //void flush()��ˢ����
//        osw.flush();
//        osw.write(98);
//        osw.flush();
//        osw.write(99);
//        //osw.flush();



        // void write(char[] cbuf)��д��һ���ַ�����
        char[] chs = {'a','b','c','d','e'};
        //osw.write(chs);

        //void write(char[] cbuf, int off, int len)��д���ַ������һ����
        //osw.write(chs,0,chs.length);
        //osw.write(chs,1,3);
        //osw.write(chs,1,3);


        //void write(String str)��дһ���ַ���
        //osw.write("abcdefg");

        //void write(String str, int off, int len)��дһ���ַ�����һ����
        //osw.write("abcde", 0, "abcde".length());
        osw.write("abcde", 1, 3);

        //�ͷ���Դ����close����flushһ��֮��Ż�close
        osw.close();
        //osw.write(100);
        //Exception in thread "main" java.io.IOException: Stream closed
    }
}
