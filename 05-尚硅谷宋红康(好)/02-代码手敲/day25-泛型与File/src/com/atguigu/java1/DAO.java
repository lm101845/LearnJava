package com.atguigu.java1;

import java.util.List;

/**
 * @Author liming
 * @Date 2022/8/6 20:37
 * DAO:data(base)access object  数据访问对象
 */

//表的共性操作的DAO
public class DAO<T> {
    //添加一条记录
    public void add(T t){

    }
    //删除一条记录
    public boolean remove(T t){
        return false;
    }
    //修改一条记录
    public void update(T t){

    }
    //查询一条记录
    public T getIndex(int index){
        return null;
    }
    //查询多条记录
    public List<T> getForList(int index){
        return null;
    }
    //泛型方法(前面一定会有标识的)
    //举例：获取表中一共有多少条记录？获取最大的员工入职时间？
    public <E> E getValue(){
        return null;
    }
}
