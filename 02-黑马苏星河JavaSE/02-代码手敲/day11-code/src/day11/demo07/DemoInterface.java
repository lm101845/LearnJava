package day11.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 李明
 * @date 2021年06月15日 15:47
 */

/**
java.util.List正是ArrayList所实现的接口。
 */
public class DemoInterface {
    public static void main(String[] args) {
        //左边是接口名称，右边是实现类名称，这就是多态写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        list.add("沙扬娜拉");
        return list;
        //这位同学，指的是list
        //你帮我打一杯水
        //我把这个空杯子给你
        //等你把杯子还回来的时候(return)
        //这个杯子就有水了
    }
}