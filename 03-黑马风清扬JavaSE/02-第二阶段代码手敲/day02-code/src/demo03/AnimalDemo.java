package MyMap.demo03;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOperator ao = new AnimalOperator();

        Cat cat = new Cat();
        ao.useAnimal(cat);
        //这个cat就相当于是new Cat();
        //useAnimal方法里面的参数是Cat类型的，所以我们要先创建一个Cat类型的变量

        Dog dog = new Dog();
        ao.useAnimal(dog);
        //狗吃骨头

        Pig p = new Pig();
        ao.useAnimal(p);


        Animal c = new Cat();
        ao.useAnimal(c);

        Animal d = new Dog();
        ao.useAnimal(d);
    }
}
