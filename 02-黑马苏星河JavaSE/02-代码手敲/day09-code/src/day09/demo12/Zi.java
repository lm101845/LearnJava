package day09.demo12;

/**
 * @author 李明
 * @date 2021年06月09日 9:40
 */
public class Zi extends Fu{
    public Zi(){
        super();
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
