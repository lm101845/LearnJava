package MyMap.demo02;

/**
 * @author 李明
 * @date 2021年06月22日 14:43
 */

/**
    测试类
    【成员变量】的编译和运行都要看左边

 成员变量：编译看左边，运行还看左边。——成员变量不适用此规则！！！
 成员方法：编译看左边，运行看右边。
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        //虽然说我们最终内存中的对象是"猫"
        //但是外界看到的其实是动物这个引用！！！

        //所以我们在通过多态的形式访问成员变量的时候，它的编译要看左边！！！
        //age，Animal类里面有，所以才可以访问到
        //weight，Aniaml类里面没有，所以编译会报错
        System.out.println(a);
        System.out.println(a.age);  //40
        //我们通过多态的形式访问成员变量，其实访问的是父类中的(age为40)
        //System.out.println(a.weight);

        a.eat();  //猫吃鱼(成员方法运行看的是右边！！！！！)
        //a.playGame();
        //使用多态的形式访问成员方法，编译也要看左边！！！！如果左边没有，那也会报错
    }
}
