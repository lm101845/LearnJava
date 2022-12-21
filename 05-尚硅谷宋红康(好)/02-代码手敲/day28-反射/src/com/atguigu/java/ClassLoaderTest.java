package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/8/14 20:58
 **/

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 了解类的加载器
 * */
public class ClassLoaderTest {
    @Test
    public void test1(){
        //对于自定义类，使用系统类加载器进行加载
        ClassLoader cl = ClassLoaderTest.class.getClassLoader();
        System.out.println(cl);
        //sun.misc.Launcher$AppClassLoader@18b4aac2   这个是系统类加载器


        //调用系统类加载器的getParent()：获取扩展类加载器
        ClassLoader cl1 = cl.getParent();
        System.out.println(cl1);  //sun.misc.Launcher$ExtClassLoader@1f32e575    它的上一层是扩展类加载器

        //调用扩展类加载器的getParent()：无法获取引导类加载器
        //引导类加载器主要负责加载java的核心类库，无法加载自定义类的。
        ClassLoader cl2 = cl1.getParent();
        System.out.println(cl2);   //null   引导类加载器，不是没有，其实是我们获取不到

        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);   //null,引导类加载器，我们拿不到

    }

    /**
     Properties：用来读取配置文件。
     */
    @Test
    public void test2() throws IOException {
        Properties pros = new Properties();
        //此时的文件默认在当前的module下。
        //读取配置文件的方式一：
//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        FileInputStream fis = new FileInputStream("src\\jdbc1.properties");
//        pros.load(fis);

        //读取配置文件的方式二：使用ClassLoader
        //配置文件默认识别为：当前module的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user = " + user + ",password = " + password);
    }
}
