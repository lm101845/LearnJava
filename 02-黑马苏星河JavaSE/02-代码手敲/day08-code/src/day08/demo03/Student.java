package day08.demo03;

/**
 * @author 李明
 * @date 2021年06月04日 20:15
 */
public class Student {
    private String name;    //姓名
    private int age;       //年龄
    private int id;         //学号

    static String room;   //所在教室

    private static int idCounter = 0;    //学号计数器，每当new了一个新对象的时候，计数器++

    public Student() {
        this.id = idCounter++;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
