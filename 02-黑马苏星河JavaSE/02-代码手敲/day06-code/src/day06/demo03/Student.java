package day06.demo03;
/**
 * set从外面往里放(里指的是Student这个类)
 * get从里面往外拿
 * 注意：对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。
 */

public class Student {
    private String name;   //姓名
    private int age;       //年龄
    private boolean male;  //是不是男的

    //每个成员变量都编写一对getter,setter
    public void setName(String str){
        name = str;
    }

    public String getName(){
        return name;
    }


    public void setAge(int num){
        age = num;
    }

    public int getAge(){
        return age;
    }


    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        //注意：基本类型的布尔值不是getMale,而是isMale
        return male;
    }
}
