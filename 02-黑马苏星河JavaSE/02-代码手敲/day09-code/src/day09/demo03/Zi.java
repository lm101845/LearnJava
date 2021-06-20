package day09.demo03;

/**
 * @author 李明
 * @date 2021年06月09日 0:13
 */
public class Zi extends Fu{
    int num = 20;

    public void method(){
        int num = 30;
        //在函数内部定义的变量叫做局部变量
        //通篇都算上，有3个num
        //一个是父类当中的成员变量，一个是子类当中的成员变量，还有一个是子类方法的局部变量

        System.out.println(num);   //30,局部变量
        System.out.println(this.num);   //20，本类的成员变量
        System.out.println(super.num);  //10,父类的成员变量
    }
}
