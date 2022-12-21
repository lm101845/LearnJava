package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/27 12:34
 **/

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try-catch-finally中finally的使用：
 *
 *
 * 1.finally是可选的
 *
 * 2.finally中声明的是一定会被执行的代码。即使catch中又出现异常了，try中有return语句，catch中有return语句等情况。
 *
 * 3.像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动的回收的，我们需要自己手动的进行资源的
 *   释放。此时的资源释放，就需要声明在finally中。
 *
 *   一般运行时异常，我们不try...catch,因为你不try...catch，它也会报错。
 *   而编译时异常，我们一定要try...catch,不然编译过不去
 */
public class FinallyTest {
    @Test
    public void test2(){
        FileInputStream fis = null;
        try {
            File file = new File("hello1.txt");
            fis = new FileInputStream(file);

            int data = fis.read();
            while(data != -1){
                System.out.print((char)data);
                data = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testMethod(){
        int num = method();
        System.out.println(num);
    }

    public int method(){
        try{
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;  //没异常就return 1
         }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2; //有异常就return 2(并且在return 2之前会打印finally里面的内容)
        }finally {
            System.out.println("我一定会被执行");
            return 3;   //return 3把return 2给抢了
        }
    }

    @Test
    public void test1(){
        try{
            int a = 10;
            int b = 0;
            System.out.println(a / b);

        }catch(ArithmeticException e){
            e.printStackTrace();
//			int[] arr = new int[10];
//			System.out.println(arr[10]);
        }catch(Exception e){
            e.printStackTrace();
        }
//		System.out.println("我好帅啊！！！~~");
//        如果不用finally，你在这里直接写，好像也行，finally作用好像也不明显，但是
//        catch中又出现异常了，try中有return语句，catch中有return语句等情况，则finally也一定会执行，而上面的代码则不会
        finally{
            System.out.println("我好帅啊~~");
        }
    }
}
