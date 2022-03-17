package demo02;

/**
 * @Author 李明
 * @Date 2022/2/5 13:02
 **/

/**
 * 操作步骤
 * 定义一个接口 (Eatable)，里面定义一个抽象方法：void eat();
 * 定义一个测试类 (EatableDemo)，在测试类中提供两个方法
 * 一个方法是： useEatable(Eatable e)
 * 一个方法是主方法，在主方法中调用 useEatable方法
 * */
public class EatableDemo {
    public static void main(String[] args) {
        //在主方法中调用 useEatable方法
        Eatable e = new EatableImpl();
        //通过多态的形式创建接口的对象
        userEatable(e);

        //匿名内部类写法
        userEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("一天一苹果，医生远离我2");
            }
        });

        //Lambda表达式写法
        userEatable(()->{
            System.out.println("一天一苹果，医生远离我3");
        });
    }

    private static void userEatable(Eatable e){
        e.eat();
        //该方法的参数如果是接口，那么它调用的其实是该接口的实现类对象
    }
}
