package demo03;

import demo02.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author liming
 * @Date 2022/3/28 21:47
 **/

/*
    反射获取构造方法并使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class<?> c = Class.forName("demo02.Student");
        //Constructor<?>[] getConstructors() 返回一个包含 Constructor对象的数组，
        // Constructor对象反映了由该 Class对象表示的类的所有公共构造函数。
        Constructor<?>[] cons = c.getConstructors();
        for(Constructor con:cons){
            System.out.println(con);
        }

        System.out.println("=================");
        //Constructor<?>[] getDeclaredConstructors()
        // 返回反映由该 Class对象表示的类声明的所有构造函数的 Constructor对象的数组。
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        for(Constructor con2:cons2){
            System.out.println(con2);
        }

        System.out.println("==================");

        //Constructor<T> getConstructor(Class<?>... parameterTypes)
        // 返回一个 Constructor对象，该对象反映由该 Class对象表示的类的指定公共构造函数。
        Constructor<?> con = c.getConstructor();
//        Student s = new Student();
//        System.out.println(s);

        //Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
        // 返回一个 Constructor对象，该对象反映由此 Class对象表示的类或接口的指定构造函数。
        //参数：你要获取的构造方法的参数的个数和数据类型对应的字节码文件对象

        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
