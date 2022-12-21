package com.exer;

/**
 * @Author liming
 * @Date 2022/6/14 16:51
 **/
public class Test1 {
    public static void main(String[] args) {
        //微软面试题:让数组的每个位置上的值去除以首位置的元素，得到的结果，作为该位置上的新值，遍历新的数组
        int[] arr = new int[]{12,3,3,34,56,77,432};
        //错误写法
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] / arr[0];
//            System.out.println(arr[i]);
//        }

        //正确写法1::
//        int temp = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] / temp;
//            System.out.println(arr[i]);
//        }

        //正确写法2：倒着写——比写法1好
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] / arr[0];
            System.out.println(arr[i]);
        }
    }
}
