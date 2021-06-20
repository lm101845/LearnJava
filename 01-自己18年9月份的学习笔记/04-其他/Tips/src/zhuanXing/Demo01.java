package zhuanXing;

/**
 * @姓名 李明
 * @日期 2018年11月7日下午1:24:27
 * 
 * 另一个转型的博客：
 * 向上转型：子类引用的对象转换为父类类型称为向上转型。通俗地说就是是将子类对象转为父类对象。此处父类对象可以是接口。
 * 
 * 这就是向上转型，Animal animal = new Cat();将子类对象Cat转化为父类对象Animal。这个时候animal这个引用调用的方法是
 * 子类方法。
 * 
 * 转型过程中需要注意的问题

向上转型时，子类单独定义的方法会丢失。比如上面Dog类中定义的run方法，当animal引用指向Dog类实例时是访问不到run方法的，
animal.run()会报错。

子类引用不能指向父类对象。Cat c = (Cat)new Animal()这样是不行的。

 */
 class Animal01 {
    public void eat(){
        System.out.println("animal eatting...");
    }
}

 class Cat extends Animal01{

    public void eat(){

        System.out.println("猫吃鱼");
    }
}

 class Dog extends Animal01{

    public void eat(){

        System.out.println("狗吃骨头");
    }

    public void run(){
        System.out.println("狗会跑");
    }
}

public class Demo01 {

    public static void main(String[] args) {

        Animal01 animal = new Cat(); //向上转型
        animal.eat();

        animal = new Dog();
        animal.eat();
        //animal.run();     b虽指向子类对象，但此时丢失fly()方法
        /*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    	The method run() is undefined for the type Animal*/
    }

}

//结果:
//我吃鱼
//我吃骨头
