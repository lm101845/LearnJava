package demo02;

/**
 * @Author liming
 * @Date 2022/3/26 10:10
 **/

/*
    定义一个类(RunnableDemo)，在类中提供两个方法
        一个方法是：startThread(Runnable r)   方法参数Runnable是一个函数式接口
        一个方法是主方法，在主方法中调用startThread方法
 */

public class RunnableDemo {
    public static void main(String[] args) {
        //在主方法中调用startThread方法

        //匿名内部类的方式
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程启动了");
            }
        });

        //使用Lambda表达式来改进
        startThread(()-> System.out.println(Thread.currentThread().getName() + "线程又启动了"));
    }


    //private是访问权限限定，static表示不要实例化就可以使用
    /**
     * 静态方法可以直接通过类名调用，任何的实例也都可以调用，因此静态方法中不能用this和super关键字，
     * 不能直接访问所属类的实例变量和实例方法(就是不带static的成员变量和成员方法)，
     * 只能访问所属类的静态成员变量和成员方法。因为实例成员与特定的对象关联！
     * 因为static方法独立于任何实例，因此static方法必须被实现，而不能是抽象的abstract。 */
    private static void startThread(Runnable r){
//        Thread t = new Thread(r);
//        t.start();

        //优化只写一行
        new Thread(r).start();   //启动了一个线程
    }
}
