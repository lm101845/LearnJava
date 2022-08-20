package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liming
 * @Date 2022/8/6 19:28
 **/
public class SubOrder extends Order<Integer>{
    public static <E> List<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list= new ArrayList<>();
        for(E e : arr){
            list.add(e);
        }
        return list;
    }
}
