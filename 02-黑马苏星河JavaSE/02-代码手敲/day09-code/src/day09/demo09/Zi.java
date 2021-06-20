package day09.demo09;

/**
 * @author 李明
 * @date 2021年06月09日 7:43
 */

/**
 * super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：
 * <p>
 * 1. 在本类的成员方法中，访问本类的成员变量。
 * 2. 在本类的成员方法中，访问本类的另一个成员方法。
 * 3. 在本类的构造方法中，访问本类的另一个构造方法。
 * 在第三种用法当中要注意：
 * A. this(...)调用也必须是构造方法的第一个语句，唯一一个。
 * B. super和this两种构造调用，不能同时使用。
 */
public class Zi extends Fu {
    //成员变量num为20
    int num = 20;

    public Zi(){
        //this();
        //错误写法，自己调用自己

        this(123);
        //无参构造方法调1个参数构造方法
        //正确写法：本类的无参构造，调用本类的有参构造
        //这个是构造方法的重载调用

        //this(2,4);
        //报错，只能有一个this
    }

    public Zi(int n){
        //一个参数调2个参数构造方法
        this(1,2);
        System.out.println(n);
    }

    public Zi(int n,int m){
        //2个参数构造方法又反过来调用无参构造方法
        //你这是在戏耍变异器，它会报错
        //this();
        System.out.println(m + n);
    }
    public void showName() {
        int num = 10;
        //局部变量num为10
        System.out.println(num);  //局部变量
        System.out.println(this.num);  //本类中的成员变量
        System.out.println(super.num);  //父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        methodA();
        this.methodA();
        //和上面的methodA();写法是等价的，只不过写上this是起到一个强调的字面作用
        System.out.println("BBB");
    }
}
