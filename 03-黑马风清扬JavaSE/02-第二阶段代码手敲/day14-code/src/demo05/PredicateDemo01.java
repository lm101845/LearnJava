package demo05;

import java.util.function.Predicate;

/**
 * @Author liming
 * @Date 2022/3/26 16:07
 **/

/*
    Predicate<T>：常用的四个方法
        boolean test(T t)：对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回一个布尔值
        default Predicate<T> negate()：返回一个逻辑的否定，对应逻辑非
        Predicate<T>接口通常用于判断参数是否满足指定的条件
 */
public class PredicateDemo01 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello",(String s)->{
            return s.length() > 8;
        });
        System.out.println(b1);

        boolean b2 = checkString("helloworld",s->s.length() > 8);
        System.out.println(b2);

    }

    //判断给定的字符串是否满足要求
    private static boolean checkString(String s, Predicate<String> pre){
//        return pre.test(s);
//        return !pre.test(s);
        //具体的判断逻辑由Lambda表达式来实现
        return pre.negate().test(s);
        //在test之前调用negate方法，是对结果进行了逻辑非的操作
    }
}
