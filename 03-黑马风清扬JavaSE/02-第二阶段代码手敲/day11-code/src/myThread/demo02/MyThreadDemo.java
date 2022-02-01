package myThread.demo02;

/**
 * @Author 李明
 * @Date 2022/2/1  11:58
 **/

/**
 *  Thread类中获取和设置线程名称的方法
 *      void setName(String name)       将此线程的名称更改为等于参数name
 *      String getName()                返回此线程的名称
 * */
public class MyThreadDemo {
    public static void main(String[] args) {
//        这个是无参构造方法，并且后面给线程单独赋值
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//        my1.setName("高铁");
//        my2.setName("飞机");

//        这个是带参构造方法，创建实例的时候直接给线程起了一个名字
//        调用了父类的带参构造方法
//        Thread(String name)
//        注意：带参构造方法是Thread中的，我们要想使用这种方式给线程起名字，必须要先在子类中提供这个带参的构造方法
//        并通过super来访问父类的带参构造方法
//        MyThread my1 = new MyThread("高铁");
//        MyThread my2 = new MyThread("飞机");
//        my1.start();
//        my2.start();

//        static Thread currentThread()
//        返回对当前正在执行的线程对象的引用。
        System.out.println(Thread.currentThread().getName());  //main
        //main方法是在一个名字叫做main的线程中执行的
    }
}

/**
 *     public Thread() {
 *         this(null, null, "Thread-" + nextThreadNum(), 0);
 *     }
 * */