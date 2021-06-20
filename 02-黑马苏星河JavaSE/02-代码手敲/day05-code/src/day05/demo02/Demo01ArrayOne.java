package day05.demo02;

/**
 * @author 李明
 * @date 2021年06月02日 3:18
 */
public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];      //动态初始化
        //等号左边就是一个变量
        //变量既可以是基本数据类型，也可以是引用数据类型！！
        //所以int[] array是在栈内存中的
        System.out.println(array);      //[I@1c53fd30
        System.out.println(array[0]);   //0
        System.out.println(array[1]);   //0
        System.out.println(array[2]);   //0
        System.out.println("==========");

        //改变数组当中元素的内容
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);       //[I@1c53fd30
        System.out.println(array[0]);   //0
        System.out.println(array[1]);   //10
        System.out.println(array[2]);   //20
    }
}
