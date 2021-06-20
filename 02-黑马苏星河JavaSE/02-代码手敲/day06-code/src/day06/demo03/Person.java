package day06.demo03;
/**
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。
解决方案：用private关键字将需要保护的【成员变量】进行修饰。

一旦使用了private进行修饰，那么本类当中仍然可以随意访问。
但是！超出了本类范围之外就不能再直接访问了。(言外之意可以间接访问)

间接访问private成员变量，就是定义一对儿Getter/Setter方法

必须叫setXxx或者是getXxx命名规则。
对于Getter来说，不能有参数，但是可以有返回值，返回值类型和成员变量对应；
对于Setter来说，不能有返回值，，但是可以有参数，参数类型和成员变量对应。
 */
public class Person {
    String name;  //姓名
    private int age;      //年龄

    public void show(){
        System.out.println("我叫" + name + "，年龄" + age);
        //在这里还是可以使用age的，因为是同一个类下。
    }

    //这样写不是直接访问age,而是倒了一手访问

    //这个成员方法专门用于向成员变量age设置数据
    //往里放，有参数，没有返回值
    public void setAge(int num){
        //函数名必须是set开头！！！
        if(num < 100 && num >=0){
            //如果是合理情况
            age = num;
        }else{
            System.out.println("数据不合理");
        }
    }

    //这个成员方法专门用于获取age的数据
    //往外拿，读取age，没有参数，有返回值
    public int getAge(){
        return age;
    }
}
