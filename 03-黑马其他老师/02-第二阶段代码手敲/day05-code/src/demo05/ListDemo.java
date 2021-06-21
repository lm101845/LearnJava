package demo05;

/**
 * @author 李明
 * @date 2021年06月21日 15:38
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
    需求：
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建List集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式，for循环方式)
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("林青霞", 31);
        Student s2 = new Student("张曼玉", 34);
        Student s3 = new Student("王祖贤", 32);

        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合之迭代器方式
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }

        //for循环方式
        for(int i=0; i<list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
