package myByteStream.demo01;

/**
 * @author 李明
 * @date 2021年07月02日 23:38
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream：文件输出流用于将数据写入File
 * FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream(String name)：创建文件输出流以指定的名称写入文件
        FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\fos.txt");
        /**
         做了三件事情：
         A:调用系统功能创建了文件
         B:创建了字节输出流对象
         C:让字节输出流对象指向创建好的文件
         即创建对象——写文件——施放资源
         */

        //void write(int b)：将指定的字节写入此文件输出流
        fos.write(97);  //a
        fos.write(57);  //9
        fos.write(55);  //7

        //这里的97不是数字97，而是字符9和7

        //最后都要释放资源
        //void close()：关闭此文件输出流并释放与此流相关联的任何系统资源。
        fos.close();
    }
}
