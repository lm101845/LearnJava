package day10.demo06;

/**
 * @author 李明
 * @date 2021年06月13日 22:26
 */

/**
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instanceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类型的实例。
 */
public class Demo02Instanceof {
    public static void main(String[] args) {
        //Animal animal = new Cat();   //本来是一只猫
        Animal animal = new Dog();   //本来是一只狗
        //你想调用只能调用共有方法，即父类中有的方法
        animal.eat();  //猫吃鱼

        //如果希望调用子类特有方法，需要向下转型
        System.out.println(animal instanceof Cat);  //true
        //判断一下父类引用animal是不是Dog
        if(animal instanceof Dog){
            //向下转型一定要进行instanceof判断，否则有可能会发生类转换异常
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(new Dog());
    }

    public static void giveMeAPet(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
