package com.exer;

/**
 * @Author liming
 * @Date 2022/6/14 16:41
 **/
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);
        //需要在method方法被调用之后，仅打印出a=100,b=200,请写出method方法的代码
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static void method(int a,int b){
        //这道题有点阴险
        a = a * 10;
        b = b * 20;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.exit(0);
    }
}
