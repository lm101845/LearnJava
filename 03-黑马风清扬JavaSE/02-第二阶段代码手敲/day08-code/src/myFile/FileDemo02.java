package myFile;

/**
 * @author 李明
 * @date 2021年07月02日 19:51
 */

import java.io.File;
import java.io.IOException;

/**
    File类创建功能：
        public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
            如果文件不存在，就创建文件，并返回true
            如果文件存在，就不创建文件，并返回false

        public boolean mkdir()：创建由此抽象路径名命名的目录
            如果目录不存在，就创建目录，并返回true
            如果目录存在，就不创建目录，并返回false

        public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
            自己补齐
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //需求1：我要在D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code目录下创建一个文件java.txt
        //首先将路径封装为一个file对象
        File f1 = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\java.txt");
        System.out.println(f1.createNewFile());  //true
        System.out.println("=============");

        //需求2：我要在D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code目录下创建一个目录JavaSE
        File f2 = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\javaSE");
        System.out.println(f2.mkdir());
        System.out.println("=============");

        //需求3：我要在D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code目录下创建一个多级目录JavaWEB\\HTML
        File f3 = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\JavaWeb\\HTML");
        //System.out.println(f3.mkdir());  使用这个方法创建多级目录是不可以的
        System.out.println(f3.mkdirs());
        System.out.println("=============");

        //需求4：我要在D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code目录下创建一个文件javase.txt
         File f4 = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\javase.txt");
        //System.out.println(f4.mkdir());
        //不能根据文件名判断是文件还是目录，我们应该看调用的方法来判断
        System.out.println(f4.createNewFile());
    }
}
