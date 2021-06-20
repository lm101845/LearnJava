package day11.demo03;

/**
 * @author 李明
 * @date 2021年06月14日 22:28
 */
public class Demo02InnerClass {
    public static void main(String[] args) {
        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}
