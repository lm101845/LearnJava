package day09.demo02;

/**
 * @author 李明
 * @date 2021年06月08日 23:56
 */
public class Zi extends Fu{
    int numZi = 27;
    int num = 200;

    public void methodZi(){
        //因为本类当中有num，所以用的是本类当中的num
        //你本类当中没有num才会往上找呢
        System.out.println(num);
    }
}
