package demo06;

/**
 * @Author 李明
 * @Date 2022/3/17 23:00
 **/
public class LambdaDemo {
    public static void main(String[] args) {
//        useInter(()->{
//            System.out.println("好好学习，天天向上");
//        });

        //使用Lambda必须要有接口，并且接口中有且仅有一个抽象方法
        useInter(()->System.out.println("好好学习，天天向上"));

        //使用Lambda的时候，必须有上下文环境，才能推导出Lambda对应的接口
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("匿名内部类");
//            }
//        }).start();

//        Runnable r = ()-> System.out.println("Lambda表达式");
//        //根据局部变量的类型来推导Lambda表达式
//        new Thread(r).start();

        new Thread(()->System.out.println("Lambda表达式")).start();
        //这样写也是没有问题的
    }

    private static void useInter(Inter i){
        i.show();
    }
}
