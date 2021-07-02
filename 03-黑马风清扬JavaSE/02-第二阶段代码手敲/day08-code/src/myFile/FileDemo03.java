package myFile;

/**
 * @author 李明
 * @date 2021年07月02日 20:37
 */

import java.io.File;

/**
    File类的判断和获取功能：
        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        public boolean isFile()：测试此抽象路径名表示的File是否为文件
        public boolean exists()：测试此抽象路径名表示的File是否存在

        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        public String getPath()：将此抽象路径名转换为路径名字符串
        public String getName()：返回由此抽象路径名表示的文件或目录的名称

        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
 */
public class FileDemo03 {
    public static void main(String[] args) {
        //创建一个File对象
        File f = new File("myFile\\java.txt");
//        public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
//        public boolean isFile()：测试此抽象路径名表示的File是否为文件
//        public boolean exists()：测试此抽象路径名表示的File是否存在
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());
        System.out.println("====================");
//        public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
//        public String getPath()：将此抽象路径名转换为路径名字符串
//        public String getName()：返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("====================");

//        public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
//        public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File f2 = new File("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day08-code");
        String[] strArray = f2.list();
        for(String str:strArray){
            System.out.println(str);
        }
        System.out.println("====================");

        File[] fileArray = f2.listFiles();
        for(File file:fileArray){
            //System.out.println(file);
            //System.out.println(file.getName());
            if(file.isFile()){
                //只遍历出文件的名称
                System.out.println(file.getName());
            }
        }
    }
}
