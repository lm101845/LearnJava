package demo01;

/**
 * @author 李明
 * @date 2021年06月21日 12:27
 */

import java.util.ArrayList;
import java.util.Collection;

/**
    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class CollectionDemo01 {
    public static void main(String[] args){
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //输出集合对象
        System.out.println(c);
    }

}
