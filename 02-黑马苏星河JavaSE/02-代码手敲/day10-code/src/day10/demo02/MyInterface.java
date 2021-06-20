package day10.demo02;

/**
 * @author 李明
 * @date 2021年06月11日 14:15
 */
public interface MyInterface {
    public default void method(){
        System.out.println("接口的默认方法");
    }
}
