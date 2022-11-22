package day10.demo05;

/**
 * @author 李明
 * @date 2021年06月11日 17:28
 */

/**
访问成员变量的两种方式：

1. 直接通过对象名称访问成员变量：看等号左边是谁(Fu)，优先用谁，没有则向上找。
2. 间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找。

 注意：成员变量是不能进行覆盖重写的！！！！只有方法才能覆盖重写！！！
 */
public class Demo01MultiField {
    public static void main(String[] args) {
        //使用多态的写法：父类引用指向子类对象
        Fu obj = new Zi();
        System.out.println(obj.num);  //10  父的num,不找子的

        //System.out.println(obj.age);
        //错误写法，Fu会向上找，一直找到Object，不会向下查找Zi！！！
        System.out.println("================");

        obj.showNum();
        //我访问的是成员方法，间接的里面用到了成员变量
        //如果子类没有覆盖重写，就是父，10
        //如果子类覆盖重写了，就是子，20
    }
}
