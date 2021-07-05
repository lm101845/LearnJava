package myCharStream.demo04;

/**
 * @author 李明
 * @date 2021年07月05日 9:52
 */

import java.io.*;

/**
    需求：
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的 Copy.java

    思路：
        1:根据数据源创建字符缓冲输入流对象
        2:根据目的地创建字符缓冲输出流对象
        3:读写数据，复制文件
        4:释放资源
 */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\ConversionStreamDemo.java"));
        //根据目的地创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day09-code\\content\\copy.java"));

        //读写数据，复制文件
        //一次读写一个字符数据
//        int ch;
//        while ((ch = br.read()) != -1){
//            bw.write(ch);
//        }

        //一次读写一个字符数组数据
        char[] chs = new char[2048];
        int len;
        while ((len = br.read(chs)) != -1){
            bw.write(chs,0,len);
        }
        //释放资源
        bw.close();
        br.close();
    }
}
