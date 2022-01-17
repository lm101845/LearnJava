package demo06;

import java.util.*;

/**
 * @Author 李明
 * @Date 2022/1/17  22:27
 **/
public class Set2 {
    public static void main(String[] args) {
        //视频中是Set s1 = new HashSet(),但是我写了报错，就这样写了
        Collection s1 = new HashSet();
        Collection s2 = new HashSet();
        s1.add("a");
        s1.add("b");
        s1.add("c");

        s2.add("d");
        s2.add("a");
        s2.add("b");
        //Set和List容器都具有Constructor(Collection c)
        //构造方法用以初始化容器类
        Collection sn = new HashSet(s1);
        sn.retainAll(s2);   //求s1,s2的交集
        Collection su = new HashSet(s1);
        su.addAll(s2);      //求s1,s2的并集
        System.out.println(sn);
        System.out.println(su);
    }
}
