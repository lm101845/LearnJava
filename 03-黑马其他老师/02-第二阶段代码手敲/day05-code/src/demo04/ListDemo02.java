package demo04;

/**
 * @author ����
 * @date 2021��06��21�� 15:19
 */

import java.util.ArrayList;
import java.util.List;

/**
    List�������з�����
        void add(int index,E element)���ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
        E remove(int index)��ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
        E set(int index,E element)���޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
        E get(int index)������ָ����������Ԫ��
 */
public class ListDemo02 {
    public static void main(String[] args) {
        //�������϶���
        List<String> list = new ArrayList<>();

        //���Ԫ��
        list.add("hello");
        list.add("world");
        list.add("java");

        //ע�⣺���Ǹ�������ȥ������ʱ��һ��Ҫ��֤�����Ǵ��ڵģ���������ᱨ����Խ���쳣


        //void add(int index,E element)���ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
        list.add(1,"javaee");
        //ԭ��1λ�õ�world���Զ����ͣ������ƶ�һλ
        //list.add(11,"javaee");   //��������Խ���쳣


        //E remove(int index)��ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
        System.out.println(list.remove(1));
        //System.out.println(list.remove(11));  //��������Խ���쳣

        //E set(int index,E element)���޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��
        System.out.println(list.set(1,"lm10189"));
        //System.out.println(list.set(11,"lm1018"));  //��������Խ���쳣

        //E get(int index)������ָ����������Ԫ��
        System.out.println(list.get(0));
        //System.out.println(list.get(11));   //��������Խ���쳣

        //������϶���
        System.out.println(list);

        //�������ϣ�����1
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //��forѭ���Ľ�����������2
        for (int i=0; i<list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
