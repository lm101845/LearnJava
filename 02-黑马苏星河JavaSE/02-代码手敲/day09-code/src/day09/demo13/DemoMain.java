package day09.demo13;

/**
 * @author 李明
 * @date 2021年06月09日 10:00
 */
public class DemoMain {
    public static void main(String[] args) {
        //Animal animal = new Animal();   //错误！

        //Dog dog = new Dog()  //错误，这也是抽象类

        Dog2Ha ha = new Dog2Ha();
        //孙子辈的，这个是普通类，可以直接new对象
        ha.eat();
        ha.sleep();

        System.out.println("============");

        DogGolden golden = new DogGolden();
        golden.eat();
        golden.sleep();
    }
}
