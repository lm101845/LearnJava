package com.atuguigu.exer;

/**
 * 一道面试题
 */
public class StringTest {

    String str = new String("good");
    char[] ch = { 't', 'e', 's', 't' };

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringTest ex = new StringTest();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str);//good  字符串在Java中是不可变的。 不过我还是不懂
        System.out.println(ex.ch);//best
    }
}

