package myByteStream.demo01;

/**
 * @author 李明
 * @date 2021年07月04日 16:50
 */

import java.io.*;

/**
 * 需求：
 * 把E:\\itcast\\字节流复制图片.avi 复制到模块目录下的 字节流复制图片.avi
 * <p>
 * 思路：
 * 1:根据数据源创建字节输入流对象
 * 2:根据目的地创建字节输出流对象
 * 3:读写数据，复制图片(一次读取一个字节数组，一次写入一个字节数组)
 * 4:释放资源
 * <p>
 * 四种方式实现复制视频，并记录每种方式复制视频的时间
 * 1:基本字节流一次读写一个字节             共耗时：64565毫秒
 * 2:基本字节流一次读写一个字节数组          共耗时：107毫秒
 * 3:字节缓冲流一次读写一个字节             共耗时：405毫秒
 * 4:字节缓冲流一次读写一个字节数组          共耗时：60毫秒
 */
public class CopyAviDemo {
    public static void main(String[] args) throws IOException{
        //记录开始时间
        long startTime = System.currentTimeMillis();
        //复制视频(4种方式来实现)
//        method1();
//        method2();
//        method3();
        method4();

        //记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime) + "毫秒");
    }

        //基本字节流一次读写一个字节
//    public static void method1() throws IOException {
//        //D:\02-looking for job\00-Project\43-LearnJavaSE\LearnJavaSE\03-黑马风清扬JavaSE\02-第二阶段代码手敲\day09-code\content
//        //demo.mp4是数据源
//        //demo02.mp4是目的地
//        FileInputStream fis = new FileInputStream("//D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\demo.mp4");
//        FileOutputStream fos = new FileOutputStream("//D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\demo02.mp4");
//
//        int by;
//        while((by =fis.read()) != -1){
//            fos.write(by);
//        }
//        fos.close();
//        fis.close();
//    }

    //基本字节流一次读写一个字节数组
//    public static void method2() throws IOException {
//        //D:\02-looking for job\00-Project\43-LearnJavaSE\LearnJavaSE\03-黑马风清扬JavaSE\02-第二阶段代码手敲\day09-code\content
//        //demo.mp4是数据源
//        //demo02.mp4是目的地
//        FileInputStream fis = new FileInputStream("//D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\demo.mp4");
//        FileOutputStream fos = new FileOutputStream("//D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\demo02.mp4");
//
//        byte[] bys = new byte[1024];
//        int len;
//        while((len =fis.read(bys)) != -1){
//            fos.write(bys,0,len);
//        }
//        fos.close();
//        fis.close();
//    }

    //字节缓冲流一次读写一个字节
//    public static void method3() throws IOException{
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\demo.mp4"));
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\demo3.mp4"));
//
//        int by;
//        while ((by = bis.read()) != -1){
//            bos.write(by);
//        }
//        bos.close();
//        bis.close();
//
//    }

    //字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\demo.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\demo3.mp4"));

       byte[] bys = new byte[1024];
       int len;
        while ((len = bis.read(bys)) != -1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();

    }
}
