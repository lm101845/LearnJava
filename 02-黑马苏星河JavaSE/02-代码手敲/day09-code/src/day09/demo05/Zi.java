package day09.demo05;

/**
 * @author 李明
 * @date 2021年06月09日 1:14
 */
public class Zi extends Fu{
    @Override
    //@Override可以起到一个安全检测的作用，如果写上没有报错，那么就说明这个是有效的正确方法的覆盖重写
    //名字写错了，参数写错了，它都会报错
    public void method(){
        System.out.println("子类方法");
    }

    @Override
    public String method1(){
        //说明method1这个类返回一个String类，比父类方法的返回值Object类小是可以的
        return "你好";
        //所有的引用类型都可以用一个null来代表没东西
    }

}
