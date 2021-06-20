package day06.demo03;
/**
局部变量和成员变量

1. 定义的位置不一样【重点】
局部变量：在方法的内部
成员变量：在方法的外部，直接写在类当中

2. 作用范围不一样【重点】
局部变量：只有方法当中才可以使用，出了方法就不能再用
成员变量：整个类全都可以通用。

3. 默认值不一样【重点】
局部变量：没有默认值，如果要想使用，【必须手动进行赋值】
成员变量：如果没有赋值，会有默认值，规则和数组一样

4. 内存的位置不一样（了解）
局部变量：位于栈内存
成员变量：位于堆内存

5. 生命周期不一样（了解）
局部变量：随着方法进栈而诞生，随着方法出栈而消失
成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失
 */
public class Demo01VariableDifference {
    String name;    //成员变量

    public void methodA(){
        int num = 20;    //局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param){
        //这个方法的参数param就是局部变量！！！！！！！！
        System.out.println(param);
        //?不是说局部变量不赋值不能用吗？我这个param也没有赋值啊？怎么可以用呢？？？
        //解释：参数在方法调用的时候，必然会被赋值的！！
        //调用这个方法你肯定要传参数，不传就错了。

        //System.out.println(num);  //错误写法
        System.out.println(name);

        int age;
        //System.out.println(age);
        //没有给局部变量初始化(赋值，不能用)
    }
}
