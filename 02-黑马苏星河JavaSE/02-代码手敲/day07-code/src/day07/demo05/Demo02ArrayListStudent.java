package day07.demo05;

/**
 * @author ����
 * @date 2021��06��04�� 3:58
 */

import java.util.ArrayList;

/**
��Ŀ��
�Զ���4��ѧ��������ӵ����ϣ���������

˼·��
1. �Զ���Studentѧ���࣬�ĸ����֡��������г�Ա��������private,Ҫ���޲ι��캯����Ҫ��ȫ�ι��캯����Ҫдget,set
2. ����һ�����ϣ������洢ѧ�����󡣷��ͣ�<Student>
3. �����࣬����4��ѧ������
4. ��4��ѧ��������ӵ������У�add
5. �������ϣ�for��size��get
 */
public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();

        Student one = new Student("���߹�",20);
        Student two = new Student("ŷ����",21);
        Student three = new Student("��ҩʦ",22);
        Student four = new Student("������",23);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        
        //��������
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("������" + stu.getName() + ",���䣺" + stu.getAge());
        }
    }
}
