package day05.demo02;

/**
 * @author 李明
 * @date 2021年06月02日 3:18
 */
public class Demo02ArrayTwo {
    public static void main(String[] args) {
        int[] arrayA = new int[3];      //动态初始化
        //等号左边就是一个变量
        //变量既可以是基本数据类型，也可以是引用数据类型！！
        //所以int[] array是在栈内存中的
        System.out.println(arrayA);      //[I@1c53fd30
        System.out.println(arrayA[0]);   //0
        System.out.println(arrayA[1]);   //0
        System.out.println(arrayA[2]);   //0
        System.out.println("==========");

        //改变数组当中元素的内容
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);       //[I@1c53fd30
        System.out.println(arrayA[0]);   //0
        System.out.println(arrayA[1]);   //10
        System.out.println(arrayA[2]);   //20

        System.out.println("==========");

        int[] arrayB = new int[3];      //动态初始化
        //等号左边就是一个变量
        //变量既可以是基本数据类型，也可以是引用数据类型！！
        //所以int[] array是在栈内存中的
        System.out.println(arrayB);      //
        System.out.println(arrayB[0]);   //0
        System.out.println(arrayB[1]);   //0
        System.out.println(arrayB[2]);   //0
        System.out.println("==========");

        //改变数组当中元素的内容
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);       //[I@1c53fd30
        System.out.println(arrayB[0]);   //0
        System.out.println(arrayB[1]);   //10
        System.out.println(arrayB[2]);   //20
    }
}
