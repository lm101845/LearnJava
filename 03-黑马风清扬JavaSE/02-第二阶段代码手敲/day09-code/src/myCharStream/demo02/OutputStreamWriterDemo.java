package myCharStream.demo02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author 李明
 * @date 2021年07月05日 4:43
 */
/*
    构造方法：
        OutputStreamWriter(OutputStream out)：创建一个使用默认字符编码的OutputStreamWriter

    写数据的5种方式：
        void write(int c)：写一个字符
        void write(char[] cbuf)：写入一个字符数组
        void write(char[] cbuf, int off, int len)：写入字符数组的一部分
        void write(String str)：写一个字符串
        void write(String str, int off, int len)：写一个字符串的一部分
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //我们采用的是字符流写数据，它是不能直接写到文件里来的，它一开始是在缓冲区里面
        //字符流相对于字节流来说是有缓冲的
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\osw.txt"));

//        //写数据我们有5种方式
//        osw.write(97);
//        //void flush()：刷新流
//        osw.flush();
//        osw.write(98);
//        osw.flush();
//        osw.write(99);
//        //osw.flush();



        // void write(char[] cbuf)：写入一个字符数组
        char[] chs = {'a','b','c','d','e'};
        //osw.write(chs);

        //void write(char[] cbuf, int off, int len)：写入字符数组的一部分
        //osw.write(chs,0,chs.length);
        //osw.write(chs,1,3);
        //osw.write(chs,1,3);


        //void write(String str)：写一个字符串
        //osw.write("abcdefg");

        //void write(String str, int off, int len)：写一个字符串的一部分
        //osw.write("abcde", 0, "abcde".length());
        osw.write("abcde", 1, 3);

        //释放资源——close会先flush一次之后才会close
        osw.close();
        //osw.write(100);
        //Exception in thread "main" java.io.IOException: Stream closed
    }
}
