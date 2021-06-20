package day11.demo05;

/**
 * @author 李明
 * @date 2021年06月15日 10:30
 */

/**
如果接口的实现类（或者是父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称() {
    // 覆盖重写所有抽象方法
};

对格式“new 接口名称() {...}”进行解析：
1. new代表创建对象的动作
2. 接口名称就是匿名内部类需要实现哪个接口
3. {...}这才是匿名内部类的内容

另外还要注意几点问题：
1. 匿名内部类，在【创建对象】的时候，只能使用唯一一次。
如果希望多次创建对象，而且类的内容一样的话，那么就需要使用单独定义的实现类了。
2. 匿名对象，在【调用方法】的时候，只能调用唯一一次。
如果希望同一个对象，调用多次方法，那么必须给对象起个名字。
3. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
强调：匿名内部类和匿名对象不是一回事！！！
 */
public class DemoMain {
    public static void main(String[] args) {
        //MyInterfaceImpl impl = new MyInterfaceImpl();
        //impl.method1();
        //实现类覆盖重写了方法

        //我们学过了多态，左父右子，左边可以是接口，右边可以是实现类
        //MyInterface obj = new MyInterfaceImpl();
        //obj.method();
        //实现类覆盖重写了方法

        //MyInterface some = new MyInterface();
        //错误写法！！接口不能直接new

        //简便方式，使用匿名内部类(不需要单独写MyInterfaceImpl了！！！)
        MyInterface objA = new MyInterface(){
            //接口里面的抽象方法肯定是要覆盖重写的！！
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-A");
            }
        };
        //末尾的分号不要丢
        objA.method1();
        objA.method2();

        System.out.println("=================");
            //使用了匿名内部类，而且省略了对象名称，也是匿名对象
            /*MyInterface objB = */new MyInterface(){
            //接口里面的抽象方法肯定是要覆盖重写的！！
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-B");
            }
        }.method1();
        //末尾的分号不要丢
        //objB.method1();
        //objB.method2();

        //因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的第二次对象
        /*MyInterface objB = */new MyInterface(){
            //接口里面的抽象方法肯定是要覆盖重写的！！
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-B");
            }
        }.method2();
    }
}
