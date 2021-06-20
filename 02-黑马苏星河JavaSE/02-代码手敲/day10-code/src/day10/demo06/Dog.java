package day10.demo06;

/**
 * @author 李明
 * @date 2021年06月13日 22:18
 */
public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃SHIT");
    }

    public void watchHouse(){
        System.out.println("狗看家");
    }
}
