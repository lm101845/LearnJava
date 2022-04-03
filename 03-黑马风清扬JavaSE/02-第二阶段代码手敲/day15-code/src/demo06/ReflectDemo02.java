package demo06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author liming
 * @Date 2022/4/3 14:29
 **/
/*
    练习2：通过配置文件运行类中的方法
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Student s = new Student();
//        s.study();
//
//        Teacher t = new Teacher();
//        t.teach();

        /*
            class.txt
            className=xxx
            methodName=xxx
         */

        //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("day15-code\\class.txt");
        prop.load(fr);
        fr.close();
        /*
            className=demo06.Student
            methodName=study
         */
        //键是固定的，值是可以变化的
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //通过反射来使用
        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
