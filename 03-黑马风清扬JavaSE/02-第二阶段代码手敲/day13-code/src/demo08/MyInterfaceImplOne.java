package demo08;

/**
 * @Author 李明
 * @Date 2022/3/19 13:00
 **/
public class MyInterfaceImplOne implements MyInterface{
    //这个类要实现接口,就要重写接口中所有的抽象方法
    @Override
    public void show1() {
        System.out.println("one show1");
    }

    @Override
    public void show2() {
        System.out.println("one show2");
    }
    //默认方法不是抽象方法,所以不强制被重写，但是也是可以重写的
    //重写的时候去掉default关键字
    @Override
    public void show3(){
        System.out.println("one show3");
    }
}
