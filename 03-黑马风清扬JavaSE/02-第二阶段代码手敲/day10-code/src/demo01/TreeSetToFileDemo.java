package demo01;

/**
 * @author 李明
 * @date 2021年07月06日 20:06
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 需求：
 * 键盘录入 5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
 * 格式：姓名 ,语文成绩,数学成绩,英语成绩 举例：林青霞,98,99,100
 * <p>
 * 思路：
 * 1. 定义学生类
 * 2. 创建TreeSet集合，通过比较器排序进行排序
 * 3. 键盘录入学生数据
 * 4. 创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
 * 5. 把学生对象添加到TreeSet集合
 * 6. 创建字符缓冲输出流对象
 * 7. 遍历集合，得到每一个学生对象
 * 8. 把学生对象的数据拼接成指定格式的字符串
 * 9. 调用字符缓冲输出流对象的方法写数据
 * 10. 释放资源
 */

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        //创建TreeSet集合，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //成绩总分从高到低
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s1.getchinese() - s2.getchinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });

        //键盘录入学生数据
        for(int i = 0 ; i < 5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + (i+1) + "个学生信息");
            System.out.println("姓名:");
            String name = sc.nextLine();
            System.out.println("语文成绩:");
            String chinese = sc.nextLine();
            System.out.println("数学成绩:");
            String math = sc.nextLine();
            System.out.println("英语成绩:");
            String english = sc.nextLine();

            //创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            Student s = new Student();
            s.setName(name);
            s.setName(chinese);
            s.setName(math);
            s.setName(english);

            //把学生对象添加到TreeSet集合
            ts.add(s);
        }

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\02-looking for job\\00-Project\\43-LearnJavaSE\\LearnJavaSE\\03-黑马风清扬JavaSE\\02-第二阶段代码手敲\\day10-code\\src\\content\\ts.txt"));

        //遍历集合，得到每一个学生对象
        //格式：姓名 ,语文成绩,数学成绩,英语成绩 举例：林青霞,98,99,100
        for(Student s:ts){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getchinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());


            //调用字符缓冲输出流对象的方法写数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}
