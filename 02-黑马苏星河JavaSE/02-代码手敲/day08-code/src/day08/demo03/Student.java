package day08.demo03;

/**
 * @author ����
 * @date 2021��06��04�� 20:15
 */
public class Student {
    private String name;    //����
    private int age;       //����
    private int id;         //ѧ��

    static String room;   //���ڽ���

    private static int idCounter = 0;    //ѧ�ż�������ÿ��new��һ���¶����ʱ�򣬼�����++

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
