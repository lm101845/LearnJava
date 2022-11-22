package day07.demo04;

/**
 * @author ����
 * @date 2021��06��04�� 2:54
 */
import java.util.ArrayList;

/**
ArrayList���еĳ��÷����У�

public boolean add(E e)���򼯺ϵ������Ԫ�أ����������ͺͷ���һ�¡�����ֵ��������Ƿ�ɹ���
��ע������ArrayList������˵��add��Ӷ���һ���ǳɹ��ģ����Է���ֵ���ÿɲ��á�
���Ƕ����������ϣ����ѧϰ����˵��add��Ӷ�����һ���ɹ���

public E get(int index)���Ӽ��ϵ��л�ȡԪ�أ�������������ţ�����ֵ���Ƕ�Ӧλ�õ�Ԫ�ء�

public E remove(int index)���Ӽ��ϵ���ɾ��Ԫ�أ�������������ţ�����ֵ���Ǳ�ɾ������Ԫ�ء�

public int size()����ȡ���ϵĳߴ糤�ȣ�����ֵ�Ǽ����а�����Ԫ�ظ�����
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);  //[]���մ����ã�����ʲôҲû��

        //�򼯺������Ԫ�أ�add
        boolean success = list.add("����");
        System.out.println(list);  //[����]
        System.out.println("��ӵĶ����Ƿ�ɹ���" + success);

        list.add("��ԲԲ");
        list.add("����͢");
        list.add("��С�");
        list.add("������");

        System.out.println(list);

        //�Ӽ����л�ȡԪ�أ�get������ֵ��0��ʼ
        String name = list.get(2);
        System.out.println("�ڶ�������λ�ã�" + name);  //����͢

        // �Ӽ�����ɾ��Ԫ�أ�remove������ֵ��0��ʼ��
        String whoremoved = list.remove(3);
        System.out.println("��ɾ�������ǣ�" + whoremoved);    //��ɾ�������ǣ���С�
        System.out.println(list);  //[����, ��ԲԲ, ����͢, ������]

        // ��ȡ���ϵĳ��ȳߴ磬Ҳ��������Ԫ�صĸ���
        int size = list.size();
        System.out.println("���ϵĳ����ǣ�" + size);   //���ϵĳ����ǣ�4
    }
}
