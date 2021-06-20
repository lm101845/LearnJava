package day07.demo01;

//1.导包
//注意：导包一定要在package语句之后写，public class语句之前写！！！
import java.util.Scanner;    //1.导包
//我们现在还没有用上它，所以它现在是灰色的

/**
 * @author 李明
 * @date 2021年06月03日 15:41
 */

/**
Scanner类的功能：可以实现键盘输入数据，到程序当中。

引用类型的一般使用步骤：

1. 导包
import 包路径.类名称;
如果需要使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句。

2. 创建
类名称 对象名 = new 类名称();

3. 使用
对象名.成员方法名()

获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
 */
public class Demo01Scanner {
    public static void main(String[] args) {
        //String str = "123";
        //我这个String类出现了以后，前面没有写import，是因为这个类在lang包下，默认是不需要导包的
        //2.创建
        //Scanner sc = new Scanner();
        Scanner sc = new Scanner(System.in);
        //Scaner的构造方法有多种重载形式，但是没有哪个小括号是留空的，所以要在小括号里面写参数！！！
        //目前参数写法万年不变：System.in，代表从键盘进行输入

        //3.获取键盘输入的int数字
        int num = sc.nextInt();
        //这个方法是有返回值的，我们把返回值放到变量当中
        System.out.println("输入的int数字是：" + num);

        //4.获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);

    }
}
