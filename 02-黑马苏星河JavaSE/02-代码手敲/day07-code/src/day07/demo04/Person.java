package day07.demo04;

/**
 * @author 李明
 * @date 2021年06月03日 20:27
 */
public class Person {

    private String name;
    private int age;

    //输入alt + insert即可自动创建get,set
    public Person() {
    }

    public Person(String name, int age) {
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
