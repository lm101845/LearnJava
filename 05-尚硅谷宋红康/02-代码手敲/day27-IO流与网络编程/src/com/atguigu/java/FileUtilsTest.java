package com.atguigu.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @Author liming
 * @Date 2022/8/13 20:01
 **/
public class FileUtilsTest {
    public static void main(String[] args) {
        File srcFile = new File("day27-IO流与网络编程\\爱情与友情.jpg");
        File destFile = new File("day27-IO流与网络编程\\爱情与友情2.jpg");
  
        try {
            FileUtils.copyFile(srcFile,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
