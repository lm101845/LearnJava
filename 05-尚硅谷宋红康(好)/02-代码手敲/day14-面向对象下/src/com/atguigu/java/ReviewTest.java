package com.atguigu.java;

import org.junit.Test;

/**
 * @Author liming
 * @Date 2022/6/20 19:15
 **/
public class ReviewTest {
    //关于toString()
    @Test
    public void test3(){
        String s = "abc";
        s = null;
        System.out.println(s);//null
        System.out.println("*********");
        System.out.println(s.toString());//出现NullPointerException
        //如果s是null的话，你显示的调和直接打印还是有区别的,因为println函数有一个保护机制
    }

    //区别手动写的和自动生成的equals()
    @Test
    public void test2(){
        Person p = new Person("Tom", 12);
        Man m = new Man("Tom", 12);

        System.out.println(p.equals(m));
    }

    //数组也作为Object类的子类出现，可以调用Object类中声明的方法
    @Test
    public void test1(){
        //我们可以把数组看成是一种特殊的类
        int[] arr = new int[]{1,2,3};
        print(arr);

        System.out.println(arr.getClass().getSuperclass());

    }

    public void print(Object obj){
        System.out.println(obj);
    }
}
