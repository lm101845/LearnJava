package day08.demo02;

/**
 * @author 李明
 * @date 2021年06月04日 15:41
 */

/**
==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj)：参数可以是任何对象，只有参数是一个字符串并且内容相同的才会给true；否则返回false。
注意事项：
1. 任何对象都能用Object进行接收。
2. equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
推荐："abc".equals(str)    不推荐：str.equals("abc")

public boolean equalsIgnoreCase(String str)：忽略大小写，进行内容比较。
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));  //true
        System.out.println(str2.equals(str3));  //true
        //str2和str3如果是==进行比较的话，是false，因为地址值不同，但是equals只比较内容，所以是true
        System.out.println(str3.equals("hello"));  //true
        System.out.println("hello".equals(str1));;  //true
        String str4 = "Hello";
        System.out.println(str1.equals(str4));   //false 一个大写一个小写

        System.out.println(str1.equalsIgnoreCase(str4)); //true  忽略大小写比较内容
        //注意：这里的大小写只表示英文的大小写，不包括中文的大小写。。。。
        //这个老师实在是太细了，果真是小白教学啊

        //String str5 = "abc";
        String str5 = null;
        System.out.println("abc".equals(str5));  //推荐，如果str5为null，照样不会报错
        //System.out.println(str5.equals("abc"));  //不推荐,如果str5为null，会报错。.NullPointerException，空指针异常
    }
}
