package com.atguigu.exer;

import org.junit.Test;

import java.io.*;

/**
 * @Author liming
 * @Date 2022/8/7 21:15
 **/
public class PicTest {
    //图片的加密
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //写法1：完整写法
            //FileInputStream fis = new FileInputStream(new File("爱情与友情.jpg"));
            //写法2：简洁写法
            fis = new FileInputStream("爱情与友情.jpg");
            fos = new FileOutputStream("爱情与友情加密.jpg");
            byte[] buffer = new byte[20];
            int len;
            while ((len = fis.read(buffer)) != -1){
                //在写入前对字节数据进行修改，实现加密
                //错误的——这个是对新的变量进行了修改，原buffer数组中的数据没有变
                //            for(byte b : buffer){
                //                b = (byte) (b ^ 5);
                //            }
                //正确的
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    //图片的解密
    @Test
    public void test2() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("爱情与友情加密.jpg");
            fos = new FileOutputStream("爱情与友情4.jpg");

            byte[] buffer = new byte[20];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                //字节数组进行修改
                //错误的
                //            for(byte b : buffer){
                //                b = (byte) (b ^ 5);
                //            }
                //正确的
                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);
                }

                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }
}
