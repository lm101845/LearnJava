package myByteStream.demo01;

/**
 * @author 李明
 * @date 2021年07月03日 0:31
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
    字节流写数据的两个小问题:
        1:字节流写数据如何实现换行呢？
            window:\r\n
            linux:\n
            mac:\r

        2:字节流写数据如何实现追加写入呢？
            public FileOutputStream(String name,boolean append)
                创建文件输出流以指定的名称写入文件。
                如果第二个参数为true ，则字节将写入文件的末尾而不是开头
 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        //FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\fos.txt");
        FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\fos.txt",true);

        //写数据
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
            //我们想要换行，就在我们写完数据之后，加入换行符号即可
        }
        //释放资源
        fos.close();
    }
}
