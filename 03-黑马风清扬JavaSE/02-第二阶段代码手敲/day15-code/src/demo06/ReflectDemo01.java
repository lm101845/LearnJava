package demo06;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Author liming
 * @Date 2022/4/3 14:23
 **/

/*
    练习1：我有一个ArrayList<Integer>集合，现在我想在这个集合中添加一个字符串数据，如何实现？
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
//        array.add("hello");
        System.out.println(array);

        Class<? extends ArrayList> c = array.getClass();
        Method m = c.getMethod("add", Object.class);
        //我们的反射是可以越过泛型检查的，获取到原始方法需要的参数类型
        m.invoke(array,"hello");
        m.invoke(array,"world");
        m.invoke(array,"java");
        System.out.println(array);
    }
}
