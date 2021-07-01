package MyMap.demo01;

/**
 * @author 李明
 * @date 2021年06月28日 14:32
 */

import java.util.HashMap;
import java.util.Map;

/**
    Map集合概述
        Interface Map<K,V>	K：键的类型；V：值的类型
        将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
        举例：学生的学号和姓名
              itheima001	林青霞
              itheima002	张曼玉
              itheima003	王祖贤

    创建Map集合的对象
        多态的方式
        具体的实现类HashMap
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map = new HashMap<>();

        //V put(K key, V value) 将指定的值与该映射中的指定键相关联
        map.put("01","林青霞");
        map.put("02","张曼玉");
        map.put("03","王祖贤");

        map.put("03","柳岩 ");
        //当这个键重复的时候，我们就会把以前的值给替代掉
        //当这个键第一次出现，它就是添加元素，当这个键第二次出现，它就是修改元素了——后面这个值把前面这个值给替代掉了

        //输出集合对象
        System.out.println(map);
    }

}
