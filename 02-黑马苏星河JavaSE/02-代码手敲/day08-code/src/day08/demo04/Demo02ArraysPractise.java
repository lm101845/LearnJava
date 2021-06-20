package day08.demo04;

/**
 * @author 李明
 * @date 2021年06月04日 21:58
 */

import java.util.Arrays;

/**
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "asv76agfqwdfvasdfvjh";

        // 如何进行升序排列：sort
        // 必须是一个数组，才能用Arrays.sort方法
        // String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);   //对字符数组进行升序排列


        for (int i = chars.length-1; i >= 0; i--) {
            //需要倒序遍历(从后往前)
            //倒序快捷键：chars.forr
            System.out.println(chars[i]);
        }
    }
}
