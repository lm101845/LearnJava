package mySet.demo02;

import java.util.Objects;

/**
 * @author 李明
 * @date 2021年06月24日 14:29
 */
public class Student {
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

    //在学生类中重写哈希构造方法
//    @Override
//    public int hashCode() {
//        return 0;
//    }
}
