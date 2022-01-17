package demo04;

/**
 * @Author 李明
 * @Date 2022/1/17  21:56
 **/
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new Name("f1","11"));
        c.add(new Name("f2","12"));
        c.add(new Name("f3","13"));

        Iterator i = c.iterator();
        while(i.hasNext()){
            //next的返回值为Object类型，需要转换为相应类型
            Name n = (Name)i.next();
            System.out.println(n.getFirstName() + " ");
            System.out.println(n.getLastName() + " ");
            //注意：HashSet没有顺序，所以拿出来的顺序可能不一样
        }

        //Iterator对象的remove方法是在迭代过程中删除元素的唯一的安全的方法
        for(Iterator j = c.iterator();j.hasNext();){
            //for循环中没有第三个语句，被省略了
            Name name = (Name)j.next();
            if(name.getFirstName().length()<3){
                j.remove();
                //如果换成c.remove(name),会产生例外
                //你不能调用容器自身的方法
            }
        }
        System.out.println(c);
    }
}
