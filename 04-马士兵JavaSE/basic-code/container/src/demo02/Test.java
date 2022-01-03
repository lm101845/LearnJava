package demo02;
import demo01.Name;

import java.util.*;
/**
 * @Author 李明
 * @Date 2022/1/3:17:43
 **/
public class Test {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        //Collection是接口，ArrayList是实现了Collection接口的其中一个子类
        //这个相当于是父类引用指向了子类对象

        //问：为什么不写ArrayList c = new ArrayList()呢？
        //我往下用c得时候，可以用ArrayList的东西吗？——你通过父类引用去访问子类对象，你是不能访问子类对象所特有的东西的
        //所以将来我想要改的时候，我可以把ArrayList改成LinkedList,其他地方一概不用变，提供了最大的灵活性

        //可以放入不同类型的对象
        c.add("hello");
        c.add(new Name("f1","11"));
        c.add(new Integer(100));
        //你往里面添加的时候，只能添加对象，不能添加基础的数据类型，比如不能直接添加100，因为基本类型是存在栈上的
        //你把栈里面的内容加到这里不太现实，因为栈里面的内容随时可能清空，你在这里是保存不住的
        //所以这里保存的都要是Object类型
        System.out.println(c.size());
        System.out.println(c);
        //当我们打印c的时候，相当于打印了c.toString方法
    }
}
