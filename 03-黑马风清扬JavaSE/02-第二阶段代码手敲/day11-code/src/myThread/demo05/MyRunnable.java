package myThread.demo05;

/**
 * @Author 李明
 * @Date 2022/2/1  14:40
 **/
public class MyRunnable implements Runnable{
    //这样写的好处是它将来可以有自己实现的父类了
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            // System.out.println(getName() + ":" + i);
            //你这个类实现了Runnable接口，和Thread类没有关系，所以调用getName方法会报错
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //这样写可以
        }
    }
}
