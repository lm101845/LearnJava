package myByteStream.demo02;

/**
 * @author 李明
 * @date 2021年07月03日 1:51
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
    需求：
        把E:\\itcast\\mn.jpg复制到模块目录下的mn.jpg

    思路：
        1:根据数据源创建字节输入流对象
        2:根据目的地创建字节输出流对象
        3:读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        4:释放资源
 */
public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\窗里窗外.txt");

        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\窗里窗外副本.txt");

        //读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
        int by;
        while((by = fis.read())!= -1){
            fos.write(by);
        }

        //释放资源
        fos.close();
        fis.close();
    }
}
