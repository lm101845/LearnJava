package day07.demo04;

/**
 * @author ����
 * @date 2021��06��03�� 20:27
 */

/**
��Ŀ��
����һ�����飬�����洢3��Person����

������һ��ȱ�㣺һ�����������������ڼ䳤�Ȳ����Է����ı䡣
 */
public class Demo01Array {
    public static void main(String[] args) {
        //���ȴ���һ������Ϊ3�����飬�����������Person���͵Ķ���
        //int[] array = new int[3];
        Person[] array = new Person[3];
        System.out.println(array[0]);  //null

        Person one = new Person("�����Ȱ�",18);
        Person two = new Person("��������",28);
        Person three = new Person("�������",38);
        //one,two,three�����֣������ﱣ���ʱ���ֵַ

        //����������ô����3������ŵ���������?
        array[0] = one;
        array[1] = two;
        array[2] = three;
        //����д�ǽ�one���еĵ�ֵַ��ֵ�������0��Ԫ��λ��
        System.out.println(array[0]);   //��ֵַ
        System.out.println(array[1]);   //��ֵַ
        System.out.println(array[2]);   //��ֵַ
        //day07.MyMap.demo04.Person@13b6d03

        Person person = array[1];
        System.out.println(person.getName());  //��������
        System.out.println(array[1].getName()); //��������
    }

}
