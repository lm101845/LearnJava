package demo02;

/**
 * @author 李明
 * @date 2021年06月22日 14:43
 */
public class Cat extends Animal {
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
