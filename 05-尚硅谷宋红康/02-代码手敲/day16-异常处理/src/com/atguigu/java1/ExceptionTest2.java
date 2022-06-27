package com.atguigu.java1;

/**
 * @Author liming
 * @Date 2022/6/27 13:00
 **/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理的方式二：throws + 异常类型
 *
 * 1. "throws + 异常类型"写在方法的【声明处】。指明此方法执行时，可能会抛出的异常类型。
 *     一旦当方法体【执行】时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常
 *     类型时，就会被抛出。【异常代码后续的代码，就不再执行！】
 *
 * 2. 体会：try-catch-finally:真正的将异常给处理掉了。
 *        throws的方式只是将异常抛给了方法的调用者。  并没有真正将异常处理掉。
 *
 * 3. 开发中如何选择使用try-catch-finally 还是使用throws？

 *   3.2 执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws
 *       的方式进行处理。而执行的方法a可以考虑使用try-catch-finally方式进行处理。
 *
 */
public class ExceptionTest2 {

    public static void main(String[] args) {
        //main方法是最大的接盘侠(但它其实也能抛，抛给虚拟机，但是这个太不负责了，不合适)
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        method3();
        //method3里面处理了method2里面的异常，所以你直接调用是没有问题的
    }

    public static void method3(){
        try {
            method2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void method2() throws IOException {
        method1();
        //method1方法可能有问题，但是它自己没有解决，抛出去了
        //你调用它，你就是接盘侠，你要么处理一下，要么也抛出去，让另一个接盘侠处理
        //因为IOException是FileNotFoundException的父类，所以你抛一个父类也行，能罩的住

    }
    public static void method1() throws FileNotFoundException,IOException {
        //如果FileNotFoundException,IOException，你的处理方式不一样，你就可以写2个
        //如果处理方式一样，你抛那个大的就行了
        File file = new File("hello1.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1){
            System.out.print((char)data);
            data = fis.read();
        }

        fis.close();

        System.out.println("hahaha!");  //如果method1出现异常了，则hahaha就打印不出来了
    }
}
