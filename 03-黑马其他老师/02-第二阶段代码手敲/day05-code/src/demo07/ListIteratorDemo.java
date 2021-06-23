package demo07;

/**
 * @author ����
 * @date 2021��06��22�� 21:34
 */

/**
 ListIterator���б������
 ͨ��List���ϵ�listIterator()�����õ�������˵����List�������еĵ�����
 �����������Ա����һ��������б���б�ĵ��������ڵ����ڼ��޸��б�����ȡ�б��е������ĵ�ǰλ��

 ListIterator�еĳ��÷���
 E next()�����ص����е���һ��Ԫ��
 boolean hasNext()������������и���Ԫ�أ��򷵻� true
 E previous()�������б��е���һ��Ԫ��
 boolean hasPrevious()��������б���������෴��������б�ʱ���и���Ԫ�أ��򷵻� true
 void add(E e)����ָ����Ԫ�ز����б�
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        //�������϶���
        List<String> list = new ArrayList<String>();

        //���Ԫ��
        list.add("hello");
        list.add("world");
        list.add("java");

        //ͨ��List���ϵ�listIterator()�����õ�
//        ListIterator<String> lit = list.listIterator();
//        while (lit.hasNext()) {
//            String s = lit.next();
//            System.out.println(s);
//        }
//        System.out.println("==========================");
//
//        //�������
//        while(lit.hasPrevious()){
//            String s = lit.previous();
//            System.out.println(s);
//        }

        //��ȡ�б������
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
