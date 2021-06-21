package StaticKeyword;

/**
 * @author 李明
 * @date 2021年06月21日 9:07
 */


/**
 * 静态方法也叫类方法，它和静态变量类似，属于一个类，而不是这个类的对象。
 *链接：https://juejin.cn/post/6844904180365131783
*/


public class Writer {
    private String name;
    private int age;
    public static int countOfWriters;

    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
        countOfWriters++;
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
