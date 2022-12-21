package com.atguigu.java;

/**
 * @Author liming
 * @Date 2022/6/14 22:51
 **/
public class ValueTransferTest {
    public static void main(String[] args) {
        String s1 = "hello";
        ValueTransferTest test = new ValueTransferTest();
        test.change(s1);
        System.out.println(s1);
        //hello，不是hi~~！！！！！！！
        //hello存在字符串常量池里面，它是不可变的，s指向的也是常量池的地址，当把s里面的内容改了后，常量池不会改
        //会新建一个hi~~的字符串常量池，s重新指向这个常量池的地址
    }
    public void change(String s){
        s = "hi~~";
    }
}
