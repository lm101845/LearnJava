package com.atguigu.java1;

/**
 * @author shkstart
 * @create 2020 上午 11:39
 */
public class StringTest {

    public static void main(String[] args) {
        //String str = new String();
        String str = new java.lang.String();    //说明我们new的string不是我们自定义的string
        System.out.println("hello,atguigu.com");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader());   //sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
