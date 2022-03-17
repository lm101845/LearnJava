package demo03;

/**
 * @Author 李明
 * @Date 2022/2/5 16:52
 **/

/**
 * 操作步骤
 * 定义一个接口 (Flyable)，里面定义一个抽象方法：void fly(String s);
 * 定义一个测试类 (FlyableDemo)，在测试类中提供两个方法
 * 一个方法是： useFlyable(Flyable f)
 * 一个方法是主方法，在主方法中调用 useFlyable方法
 * */
public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法中调用 useFlyable方法
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s);
                System.out.println("飞机自驾游");
            }
        });
        System.out.println("===================");

        //Lambda表达式改写
        useFlyable((String s)->{
            System.out.println(s);
            System.out.println("火箭自驾游");
        });
    }
    private static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }
}
