package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/8/7 19:39
 **/

import org.junit.Test;

import java.io.*;

/**
 * 测试FileInputStream和FileOutputStream的使用
 *
 * 结论：
 * 1. 对于文本文件(.txt,.java,.c,.cpp)，使用字符流处理(Reader,Writer)
 * 2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt,...)，使用字节流处理(InputStream,OutputStream)
 * 3. 文本文件，如果你只是想复制一下(并不在内存层面去读)，那用字节流也行
 */
public class FileInputOutputStreamTest {
    //使用字节流FileInputStream处理文本文件，可能出现乱码。
    @Test
    public void testFileInputStream() {
        FileInputStream fis = null;
        try {
            //1. 造文件
            File file = new File("hello.txt");
            //2.造流
            fis = new FileInputStream(file);
            //3.读数据
            //因为我们是字节流，所以我们这里造的是字节的数组
            byte[] buffer = new byte[5];
            int len = 0;  //记录每次读取的字节的个数
            while (true) {
                try {
                    if (!((len = fis.read(buffer)) != -1)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String str = new String(buffer, 0, len);
                System.out.print(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                //4.关闭资源
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     实现对图片的复制操作
    */
    @Test
    public void testFileInputOutputStream(){
        FileInputStream fis = null;     //读
        FileOutputStream fos = null;  //写
        try {
            File srcFile = new File("爱情与友情.jpg");
            File destFile = new File("爱情与友情2.jpg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[5];
            int len = 0;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //指定路径下文件的复制
    public void copyFile(String srcPath,String destPath){
        FileInputStream fis = null;     //读
        FileOutputStream fos = null;  //写
        try {
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testCopyFile(){
        long start = System.currentTimeMillis();
        String srcPath = "G:\\美剧\\黑客军团\\[黑客军团][第一季]\\[黑客军团][第一季]第01集-看完.mp4";
        String destPath = "D:\\美剧.mp4";


//        String srcPath = "hello.txt";
//        String destPath = "hello8.txt";
        //我们只是对文本文件进行复制的话，用字节其实也行，但是不要在内存层面去读，读的话会有问题
        copyFile(srcPath,destPath);
        long end = System.currentTimeMillis();
        System.out.println("复制操作花费的时间为：" + (end - start));   //复制操作花费的时间为：2529ms
    }
}
