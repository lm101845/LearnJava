package day09.demo07;

/**
 * @author 李明
 * @date 2021年06月09日 7:10
 */
public class Fu {
//    public Fu(){
//        System.out.println("父类构造方法");
//    }

    public Fu(int num){
        //你在父类写了有参数的构造方法，此时它就不再赠送无参父类构造方法了
        System.out.println("父类有参构造方法" + num);
    }

    public Fu(){
        System.out.println("父类无参构造方法");
    }
}
