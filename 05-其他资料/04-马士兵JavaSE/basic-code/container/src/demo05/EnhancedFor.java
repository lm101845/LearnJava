package demo05;

/**
 * @Author 李明
 * @Date 2022/1/17  22:12
 **/
import java.util.*;
public class EnhancedFor {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            //增强的for循环
            System.out.println(i);
        }
        Collection c = new ArrayList();

        c.add(new String("aaa"));
        c.add(new String("bbb"));
        c.add(new String("ccc"));
        for(Object o:c){
            System.out.println(o);
        }
    }
}
