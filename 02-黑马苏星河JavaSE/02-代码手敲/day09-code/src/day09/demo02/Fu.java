package day09.demo02;

/**
 * @author 李明
 * @date 2021年06月08日 23:55
 */
public class Fu {
    int numFu = 59;
    int num = 100;
    //为了方面前面不写修饰符了，这样就可以直接访问了

    public void methodFu(){
        //使用的是本类当中的，不会向下找子类的
        System.out.println(num);
    }
}
