package myGeneric.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author 李明
 * @date 2021年06月25日 17:03
 */

/**
    需求：Collection集合存储字符串并遍历

 Java泛型设计原则：只要在编译时期没有出现警告，那么运行时期就不会出现ClassCastException异常.

 泛型：把类型明确的工作推迟到创建对象或调用方法的时候才去明确的特殊的类型

 早期Java是使用Object来代表任意类型的，但是向下转型有强转的问题，这样程序就不太安全
 https://www.zhihu.com/question/272185241
 */
public class GenericDemo {
    public static void main(String[] args) {
        //创建集合对象

        //写法1：不使用泛型
        //Collection c = new ArrayList();

        //写法2：使用泛型
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
        //c.add(100);
        //这个100会自动封装为Integer类型
        //但是这里会报错，转换出问题了
        //java.base/java.lang.Integer cannot be cast to java.base/java.lang.String

        //如果使用泛型的话，它立刻就报错了
        //这样，可以把运行期才出现的问题，提升到编译期你就必须要进行处理了
        //这就是泛型的第一个好处，就是把问题给提前暴露了

        //迭代器遍历集合
        //Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            //Object obj = it.next();
            //System.out.println(obj);

            //String s = (String)it.next();
            //我都说了我迭代器里面是String类型，你就不需要再强制类型转换了
            String s = it.next();
            System.out.println(s);
        }
    }
}
