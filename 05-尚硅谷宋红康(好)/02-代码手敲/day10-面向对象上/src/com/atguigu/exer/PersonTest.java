package com.atguigu.exer;

/**
 * @Author liming
 * @Date 2022/6/15 12:45
 **/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        //p1.age   //编译不通过
        //'age' has private access in 'com.atguigu.exer.Person'——此时不能直接调用age了

        p1.setAge(12);  //写了setAge以后，它就把默认的18岁改成12岁了
        System.out.println("年龄为：" + p1.getAge());

        //绝对不要这样写！！——这个方法把get,set合二为一了
        //你先给别人起个名字，还问别人叫什么名字
        //	public int doAge(int a){
        //		age = a;
        //		return age;
        //	}

        Person p2 = new Person("Tom", 21);
        System.out.println("name = " + p2.getName() + ",age = " + p2.getAge());
    }
}
