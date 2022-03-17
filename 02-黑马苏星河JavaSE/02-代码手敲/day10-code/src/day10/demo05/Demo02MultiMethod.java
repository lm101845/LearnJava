package day10.demo05;

/**
 * @author 李明
 * @date 2021年06月11日 18:05
 */

/**
在多态的代码当中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找。

口诀：编译看左边，运行看右边。——(先编译，再运行)
 (只要它不出红线，就叫编译通过)

对比一下：
成员变量：编译看左边，运行还看左边。——成员变量不适用此规则！！！
成员方法：编译看左边，运行看右边。
 */
public class Demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();  //多态
        obj.method();      //这个方法父子都有，new的是子，优先用子
        obj.methodFu();    //这个方法子类没有，父类有，向上找到父类进行使用

        //编译看左，左边是Fu，Fu当中没有methodZi方法，所以编译报错
        //obj.methodZi();   //错误写法
    }
}
