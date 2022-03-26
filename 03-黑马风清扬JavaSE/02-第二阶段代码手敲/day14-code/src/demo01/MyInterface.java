package demo01;

/**
 * @Author liming
 * @Date 2022/3/26 10:03
 **/
/*
    函数式接口：有且仅有一个抽象方法的接口
*/

//这个注解一写上，就是函数式接口了(不写别人可能不明确，只有自己知道，所以建议加上这个注解)
@FunctionalInterface
public interface MyInterface {
    void show();
    //在这个接口中提供一个抽象方法，这个接口就是函数式接口
    //void method();
    //报错：Multiple non-overriding abstract methods found in interface demo01.MyInterface
    //写了上面这个注解以后，就只准写一个抽象方法了
}
