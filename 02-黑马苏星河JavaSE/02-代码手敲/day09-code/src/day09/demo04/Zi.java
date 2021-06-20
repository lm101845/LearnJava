package day09.demo04;

/**
 * @author 李明
 * @date 2021年06月09日 0:59
 */
public class Zi extends Fu {
    public void methodZi(){
        System.out.println("子类方法执行了");
    }

    public void method(){
        System.out.println("子类重名方法执行了");
    }
}
