package day06.demo04;
/**
 * 注意：只要你不是在同一个包下，是可以起相同的名字的类的。
* 当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，【优先使用局部变量】。
* 如果需要访问【本类当中的成员变量】，需要使用格式：
* this.成员变量名

* “通过谁调用的方法，谁就是this。”
 */
public class Person {
    String name;   //我自己的名字

    //参数who是对方的名字
    //里面的成员变量name是自己的名字
    public void sayHello(String who){
        System.out.println(who + ",你好，我是" + name);
    }
}
