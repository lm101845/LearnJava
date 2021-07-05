package myCharStream.demo01;

/**
 * @author 李明
 * @date 2021年07月05日 3:04
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
    需求：字节流读文本文件数据

    一个汉字存储：
        如果是GBK编码，占用2个字节
        如果是UTF-8编码，占用3个字节
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\a.txt");
//        int by;
//        while ((by = fis.read()) != -1){
//            System.out.print((char)by);
//        }
//        fis.close();

        //String s = "abc";  //[97, 98, 99]
        String s = "中国";   //[-28, -72, -83, -27, -101, -67]
        //byte[] bys = s.getBytes(StandardCharsets.UTF_8);    //[-28, -72, -83, -27, -101, -67]
        byte[] bys = s.getBytes("GBK");            //[-42, -48, -71, -6]
        //无论你采用什么编码来存储，汉字在存储的时候一定是负数，这样在拼接的时候它就知道它就是汉字
        System.out.println(Arrays.toString(bys));
    }
}
