package day09.demo01;

/**
 * @author 李明
 * @date 2021年06月08日 23:49
 */

// 定义了一个员工的子类：讲师
public class Teacher extends Employee{
    //留空，在大括号里面什么东西也不写，但是其实里面是有东西的
    //因为它继承了父类的方法
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //创建了一个子类对象
        System.out.println(teacher);
        //day09.MyMap.demo01.Teacher@75412c2f

        teacher.method();
        //子类实例.父类方法
        //父类方法执行了
        //Teacher类中虽然什么都没写，但是会继承来自父类的method方法


//        Assistant assistant = new Assistant();
//        //创建另一个子类助教的对象
//        assistant.method();
    }
}
