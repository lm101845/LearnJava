package day09.demo02;

/**
 * @author 李明
 * @date 2021年06月08日 23:57
 */

/**
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

直接通过子类对象访问成员变量：
    等号左边是谁，就优先用谁，没有则向上找。
间接通过成员方法访问成员变量：
    该方法属于谁，就优先用谁，没有则向上找。
 */
public class Demo01ExtendsFiled {
    public static void main(String[] args) {
        Fu fu = new Fu();
        //创建父类对象
        System.out.println(fu.numFu);  //59
        //创建父类对象时，只能使用父类的东西，没有任何子类的内容
        //每一个父类都是一个段正淳，不知道自己在哪里还有孩子，只有儿子才知道父亲是谁

        System.out.println("=======================");

        //所以我们更关系创建子类对象
        Zi zi = new Zi();
        System.out.println(zi.numFu);  //59
        System.out.println(zi.numZi);  //27
        System.out.println("=======================");

        System.out.println(zi.num);
        //这个num父类和子类都有，重名了
        //等号左边是谁，就优先用谁，没有则向上找。
        //优先用子类的num变量值
        //200

        System.out.println("=======================");
        //System.out.println(zi.abc);  //父类和子类都没有这个变量，就编译报错

        zi.methodZi();
        //这个方法是子类的，优先用子类的
        //如果没有就向上找  //200

        System.out.println("=======================");
        zi.methodFu();
        //这个方法是谁的？？？
        //首先我调用这个方法是一定能调用的，因为它继承下来了
        //但是这个方法是在哪里继承下来的呢？是在父类当中定义的！！！
        //只不过你拿过去也能继承使用
        //它输出的应该是父类的100！
    }
}
