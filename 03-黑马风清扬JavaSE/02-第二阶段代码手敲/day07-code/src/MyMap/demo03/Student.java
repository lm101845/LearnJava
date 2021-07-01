package MyMap.demo03;

/**
 * @author 李明
 * @date 2021年06月28日 15:37
 */
public class Student {
    //注意：学生对象是值！！！
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
}
