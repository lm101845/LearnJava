package demo04;

import java.util.function.Consumer;

/**
 * @Author liming
 * @Date 2022/3/26 11:53
 **/

/*
    Consumer<T>：包含两个方法
        void accept(T t)：对给定的参数执行此操作
        default Consumer<T> andThen(Consumer after)：返回一个组合的 Consumer，依次执行此操作，然后执行 after操作
        Consumer<T>接口也被称为消费型接口，它消费的数据的数据类型由泛型指定
 */
public class ConsumerDemo {
    public static void main(String[] args) {
//        operatorString("林青霞",(String s)->{
//            System.out.println(s);
//        });
        operatorString("林青霞", s->System.out.println(s));
        //使用方法引用来改进一下
        //operatorString("林青霞", System.out::println);

        operatorString("林青霞",s->System.out.println(new StringBuilder(s).reverse().toString()));

        System.out.println("======================");

        operatorString("林青霞",s-> System.out.println(s),s-> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    //定义一个方法，用不同的方式消费同一个字符串数据2次
    private static void operatorString(String name,Consumer<String>con1,Consumer<String>con2){
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);
    }

    //定义一个方法，消费一个字符串数据
    private static void operatorString(String name, Consumer<String> con){
        con.accept(name);
        //具体操作字符串的动作是由Lambda表达式来实现的
    }
}
