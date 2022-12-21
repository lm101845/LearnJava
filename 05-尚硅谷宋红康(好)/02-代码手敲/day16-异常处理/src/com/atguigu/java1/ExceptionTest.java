package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/27 8:30
 **/

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * 一、异常体系结构
 *
 * java.lang.Throwable
 * 		|-----java.lang.Error:一般不编写针对性的代码进行处理。(比如堆栈溢出，后缀是Error的我们一般都不处理了)
 * 		|-----java.lang.Exception:可以进行异常的处理
 * 			|------编译时异常(checked——受检时异常)——程序写完后发现打叉了
 * 					|-----IOException
 * 						|-----FileNotFoundException
 * 					|-----ClassNotFoundException
 * 			|------运行时异常(unchecked,RuntimeException)
 * 					|-----NullPointerException——空指针异常
 * 					|-----ArrayIndexOutOfBoundsException——数组下标溢出
 * 					|-----ClassCastException——类型转换异常(本身人家不是这个类型的，你非要转换为这个类型)
 * 					|-----NumberFormatException
 * 					|-----InputMismatchException——输入不匹配异常：比如使用Scanner时，需要整型，你写个abc
 * 					|-----ArithmeticException——算术异常
 *
 *
 *
 * 面试题：常见的异常都有哪些？举例说明
 */
public class ExceptionTest {
    //******************以下是编译时异常***************************
    @Test
    public void test7(){
//        File file = new File("hello.txt");
//        FileInputStream fis = new FileInputStream(file);
//        int data = fis.read();
//        while(data != -1){
//            System.out.println((char)data);
//            data = fis.read();
//        }
//        fis.close();
        //流资源需要手动关闭
    }



    //******************以下是运行时异常***************************
    //ArithmeticException
    @Test
    public void test6(){
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    //InputMismatchException
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        System.out.println(score);
    }

    // NumberFormatException
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    //ClassCastException
    @Test
    public void test3(){
        //这个不算类型转换异常，你编译都不会通过的，不是运行时异常
        //String str = new Date();
        Object obj = new Date();  //本身人家是一个date,你向上转型成为了object
        String str = (String)obj; //你把object强制转成了string
    }

    //ArrayIndexOutOfBoundsException
    @Test
    public void test2(){
        //数组角标越界
//        int[] arr = new int[10];
//        System.out.println(arr[10]);
        //字符串角标越界——String底层也是一个char型数组
        String str = "abc";
        System.out.println(str.charAt(3));
    }


    //NullPointerException
    @Test
    public void test1(){
//        int[] arr = null;
//        System.out.println(arr[3]);

        String str = "abc";
        str = null;
        System.out.println(str.charAt(0));
    }
}
