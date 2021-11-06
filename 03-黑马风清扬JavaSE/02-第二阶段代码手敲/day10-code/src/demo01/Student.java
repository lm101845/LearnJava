package demo01;

/**
 * @author 李明
 * @date 2021年07月06日 20:06
 */
public class Student {
    //姓名
    private String name;
    //语文成绩
    private int chinese;
    //数学成绩
    private int math;
    //英语成绩
    private int english;

    public Student() {
        super();
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getchinese() {
        return chinese;
    }

    public void setchinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum(){
        return this.chinese + this.math + this.english;
    }
}
