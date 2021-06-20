package day07.demo05;

/**
 * @author ����
 * @date 2021��06��04�� 4:07
 */

import java.util.ArrayList;

/**
 * ��Ŀ��
 * ������ָ����ʽ��ӡ���ϵķ���(ArrayList������Ϊ����)��ʹ��{}���𼯺ϣ�ʹ��@�ָ�ÿ��Ԫ�ء�
 * ��ʽ���� {Ԫ��@Ԫ��@Ԫ��}��
 * <p>
 * System.out.println(list);       [10, 20, 30]
 * printArrayList(list);           {10@20@30}
 */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("������");
        list.add("��Զ��");
        list.add("���޼�");
        list.add("�Ŵ�ɽ");
        System.out.println(list);       //[������, ��Զ��, ���޼�, �Ŵ�ɽ]

        //����Ҫ����ֱ�Ӵ�ӡ�������Ҫ��һ���Զ����չʾ�����������Ÿ�Ϊ�����ţ����Ÿ�Ϊ@
        printArrayList(list);
    }

    /**
     * ���巽������Ҫ��
     * ����ֵ���ͣ�ֻ�ǽ��д�ӡ���ѣ�û�����㣬û�н����������void
     * �������ƣ�printArrayList
     * �����б�ArrayList
     */

    public static void printArrayList(ArrayList<String> list) {
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.print(name + "}");
            } else {
                System.out.print(name + "@");

            }
        }
    }
}
