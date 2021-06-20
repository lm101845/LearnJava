package day10.demo04;

/**
 * @author 李明
 * @date 2021年06月11日 16:59
 */

/**
代码当中体现多态性，其实就是一句话：父类引用指向子类对象。——左父右子

格式：
父类名称 对象名 = new 子类名称();
 (一只猫被当作动物来看待，这是没有什么问题的)
或者：
接口名称 对象名 = new 实现类名称();
 */
public class Demo01Polymorphism {
    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用指向了右侧子类的对象
        Fu obj = new Zi();
        obj.method();
        //method是一个成员方法，成员方法看右边new的是谁，就运行谁。

        obj.methodFu();
        //子类没有methodFu这个方法，就往上找
    }
}
