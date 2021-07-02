package myByteStream.demo02;

/**
 * @author 李明
 * @date 2021年07月03日 2:01
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
    需求：把文件fos.txt中的内容读取出来在控制台输出

    使用字节输入流读数据的步骤：
        1:创建字节输入流对象
        2:调用字节输入流对象的读数据方法
        3:释放资源
 */
public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\fos.txt");

        //调用字节输入流对象的读数据方法
        //调用字节输入流对象的读数据方法
        //int read(byte[] b)：从该输入流读取最多 b.length个字节的数据到一个字节数组
        /*
        byte[] bys = new byte[5];
         */

//        byte[] bys = new byte[5];

//        //第一次读取数据
//        int len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));
//
//        //第二次读取数据
//        len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));
//
//         /*
//            hello\r\n
//            world\r\n
//
//            第一次：hello
//            第二次：\r\nwor
//            第三次：ld\r\nr
//
//         */
//
//        //第三次读取数据
//        len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));
//
//        //再多读取两次
//        len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));
//
//        len = fis.read(bys);
//        System.out.println(len);
//        //String(byte[] bytes)
//        System.out.println(new String(bys));

        byte[] bys = new byte[1024]; //1024及其整数倍
        int len;
        while ((len=fis.read(bys))!=-1) {
            System.out.print(new String(bys,0,len));
        }
        //释放资源
        fis.close();
    }
}
