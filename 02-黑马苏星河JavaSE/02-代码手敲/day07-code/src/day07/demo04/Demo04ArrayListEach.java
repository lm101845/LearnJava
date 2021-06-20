package day07.demo04;

import java.util.ArrayList;

/**
 * @author 李明
 * @date 2021年06月04日 3:11
 */
public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");

        //遍历集合(list.fori回车)
        //在数组中是这样遍历的
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
