package basicKnowledge;

/**
 * @author 李明
 * @date 2021年11月06日 15:17
 */

//你要写任何一个Java程序，必须要先写一个class出来，它是一个纯的面向对象的语言，没有C++里面全局变量的概念
//注意：凡是在大括号里面声明的变量，出了这个大括号就没人认识它了
public class HelloWorld {
    static int j = 20;  //在类体里面，方法体外面声明的变量叫【成员变量】——这个不叫全局变量，不要混了！！！
    public static void main(String[] abc) {   //方法的参数【abc】叫局部变量
        System.out.println(123);
        int i = 10;   //这个叫【局部变量】
        System.out.println(i);
        System.out.println(j);   //这个无法打印？？？——要给j前面加上static才能正常打印
    }
}


