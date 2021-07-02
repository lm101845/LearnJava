package myByteStream.demo01;

/**
 * @author 李明
 * @date 2021年07月03日 0:45
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 字节流写数据加入异常处理
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args){
//        try {
//            FileOutputStream fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\fos.txt");
//            fos.write("hello".getBytes());
//            fos.close();
//            //所有跟IO操作相关的内容，我们都要去释放资源——要保证资源一定被释放到
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //假如finally来实现释放资源
        FileOutputStream fos = null;
        try {
            //fos = new FileOutputStream("E:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\fos.txt");
            fos = new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\itcast\\fos.txt");
            fos.write("hello".getBytes());
            //所有跟IO操作相关的内容，我们都要去释放资源——要保证资源一定被释放到
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
