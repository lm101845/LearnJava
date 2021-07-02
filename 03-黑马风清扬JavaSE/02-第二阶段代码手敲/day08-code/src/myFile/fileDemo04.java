package myFile;

/**
 * @author 李明
 * @date 2021年07月02日 20:53
 */

import java.io.File;
import java.io.IOException;

/**
    File类删除功能：
        public boolean delete()：删除由此抽象路径名表示的文件或目录
 */
public class fileDemo04 {
    public static void main(String[] args) throws IOException {
        //需求1：在当前模块目录下创建java.txt文件
        //File f1 = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code\\java.txt");
        //File f1 = new File("java2.txt");
        File f1 = new File("myFile\\java.txt");  //但是这样写我这里会报错
        System.out.println(f1.createNewFile());
        System.out.println("=========================");

        //需求2：删除当前模块目录下的java.txt文件
        //我要删除这个文件我得有这个文件对象指向这个路径
        System.out.println(f1.delete());
        System.out.println("=========================");

        //需求3：在当前模块目录下创建itcast目录
        File f2 = new File("myFile\\itcast");
        System.out.println(f2.mkdir());

        //需求4：删除当前模块目录下的itcast目录
        System.out.println(f2.delete());

        //需求5：在当前模块下创建一个目录itcast,然后在该目录下创建一个文件java.txt
        File f3 = new File("myFile\\itcast");
        //System.out.println(f3.mkdir());  //先创建的目录
        File f4 = new File("myFile\\itcast\\java.txt");
        //System.out.println(f4.createNewFile());  //再在该目录下创建文件

        //需求6：删除当前模块下的目录itcast
        //如果你删除的目录下面有内容，那么该目录是不能随便删除的，要先把里面的内容给删除掉
        System.out.println(f4.delete());
        System.out.println(f3.delete());
    }
}
