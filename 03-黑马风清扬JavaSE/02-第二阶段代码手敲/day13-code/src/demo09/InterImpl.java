package demo09;

/**
 * @Author 李明
 * @Date 2022/3/19 13:23
 **/
public class InterImpl implements Inter,Flyable{

    @Override
    public void show() {
        System.out.println("show方法执行了");
    }

    @Override
    public void method() {
        Inter.super.method();
    }
}
