package day07.demo02;

/**
 * @author 李明
 * @date 2021年06月03日 16:29
 */

import java.util.Scanner;

/**
 * 任何数据类型都可以作为方法的参数和返回值，对象也不例外
 */

public class Demo02Anoymous {
    public static void main(String[] args) {
        //普通使用方式
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        //匿名对象的方式
        //int num = new Scanner(System.in).nextInt();
        //System.out.println("输入的是：" + num);

        //使用一般写法传入参数
        //Scanner sc = new Scanner(System.in);
        //methodParam(sc);

        //使用匿名对象来进行传参
        methodParam(new Scanner(System.in));


        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入的是:" + num);
    }

    //让匿名对象作为方法的参数
    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    //让匿名对象作为返回值
    public static Scanner methodReturn(){
        //写法1：
        //Scanner sc = new Scanner(System.in);
        //return sc;
        return new Scanner(System.in);
    }
}
