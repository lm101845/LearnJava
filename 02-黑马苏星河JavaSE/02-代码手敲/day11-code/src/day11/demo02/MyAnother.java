package day11.demo02;

/**
 * @author 李明
 * @date 2021年06月14日 7:42
 */
public class MyAnother {
    public void anotherMethod(){
        //MyClass类中的num是成员变量，没有static我们要访问就只能new了
        System.out.println(new MyClass().num);
    }
}
