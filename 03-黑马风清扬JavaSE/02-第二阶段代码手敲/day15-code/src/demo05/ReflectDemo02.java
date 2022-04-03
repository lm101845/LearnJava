package demo05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author liming
 * @Date 2022/4/3 14:13
 **/
/*
     练习：通过反射实现如下操作
        Student s = new Student();
        s.method1();
        s.method2("林青霞");
        String ss = s.method3("林青霞",30);
        System.out.println(ss);
        s.function();
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("demo02.Student");

        //Student s = new Student();
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //s.method1();
        Method m1 = c.getMethod("method1");
        m1.invoke(obj);

        //s.method2("林青霞");
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj,"林青霞");

        //String ss = s.method3("林青霞",30);
        //System.out.println(ss);
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "林青霞", 30);
        System.out.println(o);

        //s.function();
        //invoke是调用的意思
        //Method m4 = c.getMethod("function");
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);
    }
}
