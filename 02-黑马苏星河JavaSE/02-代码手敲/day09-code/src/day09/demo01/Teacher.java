package day09.demo01;

/**
 * @author ����
 * @date 2021��06��08�� 23:49
 */

// ������һ��Ա�������ࣺ��ʦ
public class Teacher extends Employee{
    //���գ��ڴ���������ʲô����Ҳ��д��������ʵ�������ж�����
    //��Ϊ���̳��˸���ķ���
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //������һ���������
        System.out.println(teacher);
        //day09.MyMap.demo01.Teacher@75412c2f

        teacher.method();
        //����ʵ��.���෽��
        //���෽��ִ����
        //Teacher������Ȼʲô��ûд�����ǻ�̳����Ը����method����


//        Assistant assistant = new Assistant();
//        //������һ���������̵Ķ���
//        assistant.method();
    }
}
