package demo16;

/**
 * @Author 李明
 * @Date 2022/3/19 20:26
 **/

/**
    练习
        1:定义一个类(Student)，里面有两个成员变量(name,age)
            并提供无参构造方法和带参构造方法，以及成员变量对应的get和set方法
        2:定义一个接口(StudentBuilder)，里面定义一个抽象方法
            Student build(String name,int age);
        3:定义一个测试类(StudentDemo)，在测试类中提供两个方法
            一个方法是：useStudentBuilder(StudentBuilder s)
            一个方法是主方法，在主方法中调用useStudentBuilder方法
 */
public class StudentDemo {
    public static void main(String[] args) {
//        useStudentBuilder((String name,int age)->{
////            Student s = new Student(name,age);
////            return s;
//            return new Student(name,age);
//        });

        useStudentBuilder((name,age)->new Student(name,age));

        //引用构造器
        //Lambda表达式被构造器替代的时候,它的形式参数全部传递给构造器作为参数
        useStudentBuilder(Student::new);
    }
    private static void useStudentBuilder(StudentBuilder sb){
        Student s = sb.build("林青霞", 30);
        //快捷键 ctrl + alt + v
        System.out.println(s.getName() + "," + s.getAge());
    }
}
