package day10.demo06;

/**
 * @author 李明
 * @date 2021年06月13日 22:00
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //子类特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
