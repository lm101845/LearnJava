package day08.demo03;

/**
 * @author ����
 * @date 2021��06��04�� 20:15
 */

/**
���һ����Ա����ʹ����static�ؼ��֣���ô��������������ڶ����Լ��������������ڵ��ࡣ���������ͬһ�����ݡ�
 */
public class Demo01StaticFiled {
    public static void main(String[] args) {
        Student one = new Student("����",19);
        one.room = "101����";
        System.out.println("������" + one.getName() + ",���䣺" + one.getAge() + ",���ң�" + one.room + "��ѧ�ţ�" + one.getId());
        //��ֻ��one�����room�����˸�ֵ���������շ���two.roomҲ��101���ң�����

        Student two = new Student("����",16);
        System.out.println("������" + two.getName() + ",���䣺" + two.getAge()+ ",���ң�" + two.room +  "��ѧ�ţ�" + two.getId());
    }
}
