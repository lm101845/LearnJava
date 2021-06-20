package day08.demo03;

/**
 * @author 李明
 * @date 2021年06月04日 21:04
 */


public class Demo03StaticStudent {
    public static void main(String[] args) {
        // 首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        Student.room = "102教室";

        Student one = new Student("郭靖",20);
        System.out.println("one的姓名：" + one.getName());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);
        //你写one.room其实也行，但是还是建议你用类来直接调用！！！！！！！！！！


        System.out.println("============");

        Student two = new Student("黄蓉", 18);
        System.out.println("two的姓名：" + two.getName());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Student.room);
    }
}
