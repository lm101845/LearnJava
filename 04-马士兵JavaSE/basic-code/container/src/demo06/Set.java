package demo06;

import java.util.*;

/**
 * @Author 李明
 * @Date 2022/1/17  22:20
 **/
public class Set {
    public static void main(String[] args) {
        Collection s = new HashSet();
        //视频中是Set s1 = new HashSet(),但是我写了报错，就这样写了
        s.add("hello");
        s.add("world");
        s.add(new Name("f1","f2"));
        s.add(new Integer(100));
        s.add(new Name("f1","f2"));
        //相同元素不会加入(字符串已经重写了equals方法了)
        s.add("hello");
        s.add("hello");
        //相同元素不会加入(Name类也重写了equals方法了)
        System.out.println(s);
    }
}
