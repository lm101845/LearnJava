package com.atguigu.java2;

/**
 * @Author liming
 * @Date 2022/6/21 19:56
 **/
public class MainDemo {
    public static void main(String[] args) {
        for(int i = 0;i < args.length;i++){
            System.out.println("*****" + args[i]);
            int num = Integer.parseInt(args[i]);
            System.out.println("#####" + num);
        }
    }
}
