package com.atguigu.java;

import org.junit.Test;

/**
 * @Author liming
 * @Date 2022/7/12 23:46
 **/
public class IDEADebug {
    @Test
    public void testStringBuffer(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//

        System.out.println(sb.length());//4

        System.out.println(sb);//"null"

         StringBuffer sb1 = new StringBuffer(str);//抛异常NullPointerException
        System.out.println(sb1);//

    }
}
