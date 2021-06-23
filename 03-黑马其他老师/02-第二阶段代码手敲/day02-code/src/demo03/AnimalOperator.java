package demo03;

/**
    动物操作类

    动态的好处是：我们在使用方法的时候，使用父类型(而不是子类型)作为参数
        例如：
        public void useAnimal(Animal a) {
        a.eat();
    }
    将来在使用的时候，使用的是具体的子类型参与操作！！！
    例如：
        Pig p = new Pig();
        ao.useAnimal(p);
 */
public class AnimalOperator {
    public void useAnimal(Cat c) { //相当于Cat c = new Cat();
        c.eat();
    }

    //添加的这个是新方法，参数不一样？？？
    //我每次进来都要因为参数不一样添加一个新方法，太麻烦了？有没有简单的方式呢？
    public void useAnimal(Dog d) { //相当于Dog d = new Dog();
        d.eat();
    }


    //假如我要添加很多的动物，如果像上面这样写的话我们每次都要先添加一个类(你添加哪个动物就要添加哪个类)
    //然后再修改这个类的eat方法
    //最后还要再这个测试类里面创建这个添加新动物的对象，再调用方法
    //太慢烦了！！！



    //优化方法如下：
    //我不管你是猫，还是狗，你们都继承了动物
    //也就是说，你们都可以看成是动物
    public void useAnimal(Animal a) {
        //Animal a = new Cat();
        //Animal a = new Dog();

        a.eat();
        //a.lookDoor();
        //报错！！
        //多态的形式不能访问具体的子类所特有的功能
        //这就是多态形式访问的弊端
    }


}
