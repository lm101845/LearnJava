package day08.demo02;

/**
 * @author 李明
 * @date 2021年06月04日 15:58
 */

/**
String当中与获取相关的常用方法有：

public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        // 获取字符串的长度
        int length = "skjdflkjsdlafjlsdjlaksdkf".length();
        System.out.println(length);

        //拼接字符串
        //字符串中最重要的概念：字符串的内容不可改变！！！！！！！！！！！！
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);  //helloworld,新的字符串!!!!
        System.out.println("===================");

        // 获取指定索引位置的单个字符
        char ch = "hello".charAt(1);
        System.out.println("在一号索引位置的字符是：" + ch);
        System.out.println("===================");

        // 查找参数字符串在本来字符串当中出现的第一次索引位置
        // 如果根本没有，返回-1值
        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("llo");
        System.out.println("第一次的索引值是：" + index);  //2

        System.out.println("HelloWorld".indexOf("abc"));  //-1

    }
}
