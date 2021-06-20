package day11.demo05;

/**
 * @author 李明
 * @date 2021年06月15日 10:30
 */

//使用了匿名内部类后这个文件就可以不用了，都可以删除了
//有时候为了接口不得不写上一个实现类，这个很麻烦，我还得单独写一个.java文件在implements实现这个接口
public class MyInterfaceImpl implements MyInterface {
    @Override
    public void method1() {
        System.out.println("实现类覆盖重写了方法111");
    }

    @Override
    public void method2() {
        System.out.println("实现类覆盖重写了方法222");
    }
}
