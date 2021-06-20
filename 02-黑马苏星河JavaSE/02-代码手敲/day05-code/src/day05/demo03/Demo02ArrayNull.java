package day05.demo03;

/**
 * @author 李明
 * @date 2021年06月02日 3:51
 */

/**
所有的引用类型变量(比如数组)，都可以赋值为一个null值。但是代表其中什么都没有。

数组必须进行new初始化才能使用其中的元素。
如果只是赋值了一个null，没有进行new创建，
那么将会发生：
空指针异常 NullPointerException

原因：忘了new
解决：补上new
 */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        System.out.println(array[0]);
        //数组一定要先创建才能使用，你现在光是定义，没有new，所以编译前会报错
        //而如何赋值为null,则不会报错，但是因为数组为空，所以编译后会报错
        //array = new int[3];
    }

}
