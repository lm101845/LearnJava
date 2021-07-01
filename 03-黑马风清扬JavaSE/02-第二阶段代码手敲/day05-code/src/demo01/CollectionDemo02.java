package MyMap.demo01;

/**
 * @author 李明
 * @date 2021年06月21日 12:31
 */

import java.util.ArrayList;
import java.util.Collection;

/**
    Collection集合常用方法:
        boolean add(E e):添加元素
        boolean remove(Object o):从集合中移除指定的元素
        void clear():清空集合中的元素
        boolean contains(Object o):判断集合中是否存在指定的元素
        boolean isEmpty():判断集合是否为空
        int size():集合的长度，也就是集合中元素的个数

    Alt+7   打开一个窗口，能够看到类的所有信息
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection<String> c = new ArrayList<>();

        //boolean add(E e):添加元素
//        System.out.println(c.add("hello"));  //true
//        System.out.println(c.add("world"));  //true
//        System.out.println(c.add("world"));  //true
        //这个集合是可以存储重复元素的
        //调用add方法永远返回的都是true
        c.add("hello");
        c.add("world");
        c.add("java");

        //boolean remove(Object o):从集合中移除指定的元素
        System.out.println(c.remove("world"));  //true
        System.out.println(c.remove("javaee")); //false

        //void clear():清空集合中的元素
        //c.clear();

        //boolean contains(Object o):判断集合中是否存在指定的元素
        System.out.println(c.contains("hello"));   //true
        System.out.println(c.contains("world"));   //false

        // boolean isEmpty():判断集合是否为空
        System.out.println(c.isEmpty());   //false

        //int size():集合的长度，也就是集合中元素的个数
        System.out.println(c.size());
        //输出集合对象
        System.out.println(c);
    }
}
