package MyMap.demo03;

/**
 * @author 李明
 * @date 2021年06月22日 15:51
 */
public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookDoor(){
        System.out.println("狗看家");
    }
}
