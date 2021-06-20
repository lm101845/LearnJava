package day09.demo13;

/**
 * @author 李明
 * @date 2021年06月09日 9:51
 */

//子类也是一个抽象类
public abstract class Dog extends Animal{
    @Override
    //我只写一个抽象方法的具体实现，不给sleep写具体实现了
    public void eat(){
        System.out.println("狗吃骨头");
    };
}
