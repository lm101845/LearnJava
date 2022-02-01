package myThread.demo12;

/**
 * @Author 李明
 * @Date 2022/2/1  17:07
 **/
public class Customer implements Runnable{
    private Box b;
    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run(){
        while(true){
            b.get();
            //消费者通过死循环来一刻不停的获取奶箱中的牛奶
        }
    }
}
