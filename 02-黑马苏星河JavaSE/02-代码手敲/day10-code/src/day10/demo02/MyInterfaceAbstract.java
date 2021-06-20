package day10.demo02;

/**
 * @author 李明
 * @date 2021年06月11日 14:07
 */
public abstract class MyInterfaceAbstract implements MyInterfaceA,MyInterfaceB{

    @Override
    public void methodA() {

    }

//    @Override
//    public void methodB() {
//
//    }
    //如果你不想管methodB这个抽象方法，那你这个类就得是abstract抽象方法

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {

    }
}
