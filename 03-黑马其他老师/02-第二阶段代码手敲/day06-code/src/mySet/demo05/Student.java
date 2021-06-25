package mySet.demo05;

public class Student implements Comparable<Student> {
    //必须要让学生类实现Comparable<Student>接口，不然会报错
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

    @Override
    public int compareTo(Student s) {
//        return 0;
//        return 1;
//        return -1;
        //按照年龄从小到大排序(根据要求写规则)
       int num = this.age - s.age;  //年龄升序排列了
        //我们想要升序，this就放到前面！！！
       //这个this指的就是s2,这个s指的就是s1
        //int num = s.age - this.age;  //年龄降序排列了

        //年龄相同时，按照姓名的字母顺序排序——除了主要条件，还有次要条件
       int num2 = num==0?this.name.compareTo(s.name):num;
        //当年龄相同时我们比较姓名
        return num2;
//        return num;
    }
}
