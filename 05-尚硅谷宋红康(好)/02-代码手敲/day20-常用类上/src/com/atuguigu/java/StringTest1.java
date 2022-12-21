package com.atuguigu.java;

/**
 * @Author liming
 * @Date 2022/7/10 14:12
 **/

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 涉及到String类与其他结构之间的转换
 *
 * String 与 byte[]之间的转换
 * 编码：String --> byte[]:调用String的getBytes()
 * 解码：byte[] --> String:调用String的构造器
 *
 * 编码：字符串 -->字节  (看得懂 --->看不懂的二进制数据)
 * 解码：编码的逆过程，字节 --> 字符串 （看不懂的二进制数据 ---> 看得懂）
 *
 * 说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致，否则会出现乱码。
 *
 */
public class StringTest1 {
    /**
    String 与 byte[](字节数组)之间的转换——后面讲IO流的时候会涉及到
    编码：String --> byte[]:调用String的getBytes()
    解码：byte[] --> String:调用String的构造器

    编码：字符串 -->字节  (看得懂 --->看不懂的二进制数据)
    解码：编码的逆过程，字节 --> 字符串 （看不懂的二进制数据 ---> 看得懂）

    说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致，否则会出现乱码。
 */
    @Test
    public void test3() throws UnsupportedEncodingException {
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();//使用默认的字符集，进行编码。
        System.out.println(bytes + "-------");
        System.out.println(Arrays.toString(bytes));  //转换为字节——字节就是纯数字(ascii,utf-8)了

        byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码。
        System.out.println(Arrays.toString(gbks));

        System.out.println("******************");

        String str2 = new String(bytes);//使用默认的字符集，进行解码。
        System.out.println(str2 + "--------str2");

        String str3 = new String(gbks);
        System.out.println(str3);//出现乱码。原因：编码集和解码集不一致！


        String str4 = new String(gbks, "gbk");
        System.out.println(str4);//没有出现乱码。原因：编码集和解码集一致！
    }


    /**
    String 与 char[](字符数组)之间的转换

    String --> char[]:调用String的toCharArray()
    char[] --> String:调用String的构造器
 */
    @Test
    public void test2(){
        String str1 = "abc123";  //题目： a21cb3——考虑把它先变成一个char型数组，在数组里反转，再变回字符串

        char[] charArray = str1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);
    }

    /**
    复习：
    String 与基本数据类型、包装类之间的转换。
    String --> 基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)
    基本数据类型、包装类 --> String:调用String重载的valueOf(xxx)

 */
    @Test
    public void test1(){
        String str1 = "123";
//        int num = (int)str1;  //错误的,不能干直接硬转，只有子父类关系才能强转，所以这里我们需要调用包装类
        int num = Integer.parseInt(str1);
        System.out.println(num);
        String str2 = String.valueOf(num);//"123"
        System.out.println(str2);
        String str3 = num + "";    //在堆里，只要有变量参与了，都是在堆里
        System.out.println(str1 == str3);
    }
}
