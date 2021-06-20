package day08.demo03;

/**
 * @author 李明
 * @date 2021年06月04日 21:26
 */


/**
 * 静态代码块的格式是：
 *
 * public class 类名称{
 *     static {
 *         //静态代码块
 *     }
 * }
 *
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次。
 * 注意：静态内容总是优先于非静态，所以静态代码块比构造方法先执行
 *
 *
 静态代码块的典型用途：
 用来一次性地对静态成员变量进行赋值。
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        //静态代码块执行了！
        //构造方法执行了！

        Person two = new Person();
        //构造方法执行了！
        //这个时候静态代码块不再执行！只会执行一次！！！
    }
}
