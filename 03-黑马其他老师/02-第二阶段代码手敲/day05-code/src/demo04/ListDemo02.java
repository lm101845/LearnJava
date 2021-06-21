package demo04;

/**
 * @author 李明
 * @date 2021年06月21日 15:19
 */

import java.util.ArrayList;
import java.util.List;

/**
    List集合特有方法：
        void add(int index,E element)：在此集合中的指定位置插入指定的元素
        E remove(int index)：删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        E get(int index)：返回指定索引处的元素
 */
public class ListDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //注意：我们根据索引去操作的时候，一定要保证索引是存在的！！！否则会报索引越界异常


        //void add(int index,E element)：在此集合中的指定位置插入指定的元素
        list.add(1,"javaee");
        //原来1位置的world会自动让贤，往后移动一位
        //list.add(11,"javaee");   //报错，索引越界异常


        //E remove(int index)：删除指定索引处的元素，返回被删除的元素
        System.out.println(list.remove(1));
        //System.out.println(list.remove(11));  //报错，索引越界异常

        //E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(1,"lm10189"));
        //System.out.println(list.set(11,"lm1018"));  //报错，索引越界异常

        //E get(int index)：返回指定索引处的元素
        System.out.println(list.get(0));
        //System.out.println(list.get(11));   //报错，索引越界异常

        //输出集合对象
        System.out.println(list);

        //遍历集合：方法1
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //用for循环改进遍历：方法2
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
