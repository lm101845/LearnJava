package StaticKeyword;

/**
 * @author ����
 * @date 2021��06��21�� 9:07
 */


/**
 * ��̬����Ҳ���෽�������;�̬�������ƣ�����һ���࣬�����������Ķ���
 *���ӣ�https://juejin.cn/post/6844904180365131783
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
