package myByteStream.demo01;

/**
 * @author 李明
 * @date 2021年07月03日 18:00
 */

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
    字节缓冲流：
        BufferOutputStream
        BufferedInputStream

    构造方法：
        字节缓冲输出流：BufferedOutputStream(OutputStream out)
        字节缓冲输入流：BufferedInputStream(InputStream in)

 java输入流与输出流的判断点就是内存，东西读入内存就是输入流，东西从内存中读出来就是输出流；其次加入内存，磁盘，网络，终端（屏幕/键盘）
 */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流：BufferedOutputStream(OutputStream out) ——用来写数据
//        FileOutputStream fos = new FileOutputStream("myByteStream\\bos.txt");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //上面2步可以将它合并为一步
        //写数据
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\bos.txt"));
//            bos.write("hello\r\n".getBytes());
//            bos.write("world\r\n".getBytes());
//            //释放资源
//        bos.close();

        //字节缓冲输入流：BufferedInputStream(InputStream in)
        //读数据
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\bos.txt"));
        //一次读取一个字节数据
//        int by;
//        while((by = bis.read()) != -1){
//            System.out.println((char)by);
//        }

        //一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while((len = bis.read())!= -1){
            System.out.println(new String(bys,0,len));
        }

        //释放资源
        bis.close();
    }
}
