package day08.demo03;

/**
 * @author 李明
 * @date 2021年06月04日 20:15
 */

/**
如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
 */
public class Demo01StaticFiled {
    public static void main(String[] args) {
        Student one = new Student("郭靖",19);
        one.room = "101教室";
        System.out.println("姓名：" + one.getName() + ",年龄：" + one.getAge() + ",教室：" + one.room + "，学号：" + one.getId());
        //我只对one里面的room进行了赋值，但是最终发现two.room也是101教室！！！

        Student two = new Student("黄蓉",16);
        System.out.println("姓名：" + two.getName() + ",年龄：" + two.getAge()+ ",教室：" + two.room +  "，学号：" + two.getId());
    }
}
