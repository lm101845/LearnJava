package demo01;

/**
 * @Author liming
 * @Date 2022/3/26 10:02
 **/
/*
    函数式接口：有且仅有一个抽象方法的接口
 */
public class MyInterfaceDemo {
    public static void main(String[] args) {
        //函数式接口可以用于方法的参数传递，也可以用于局部变量
        //用于局部变量的时候，就可以把方法传给它了
        MyInterface my = ()-> System.out.println("函数式接口");
        my.show();
    }
}
