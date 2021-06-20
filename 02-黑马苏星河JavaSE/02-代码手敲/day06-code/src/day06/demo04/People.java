package day06.demo04;
/**
 * 注意：只要你不是在同一个包下，是可以起相同的名字的类的。
 * 当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量(参数就是一个局部变量)。
 * 如果需要访问本类当中的成员变量，需要使用格式：
 * this.成员变量名

 * “通过谁调用的方法，谁就是this。”
 */
public class People {
    String name;   //我自己的名字

    //参数name是对方的名字
    //里面的成员变量name是自己的名字
    public void sayHello(String name){
        //我把里面的参数给改一改，也改成name
        System.out.println(name + ",你好，我是" + name);
        //王思聪,你好，我是王思聪
        System.out.println(name + ",你好，我是" + this.name);
        //王思聪,你好，我是王健林

        //成员变量名前要写this.
        //但是局部变量名前什么都不要写！！！！！！！
        //this关键字可以解决重名，分不开的问题
        System.out.println(this);
        //day06.demo04.People@6e8dacdf
    }
}
