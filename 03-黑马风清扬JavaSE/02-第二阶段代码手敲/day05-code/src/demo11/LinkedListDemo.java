package demo11;

/**
 * @author ����
 * @date 2021��06��23�� 16:40
 */

import java.util.LinkedList;

/**
    LinkedList���ϵ����й��ܣ�
        public void addFirst(E e)���ڸ��б�ͷ����ָ����Ԫ��
        public void addLast(E e)����ָ����Ԫ��׷�ӵ����б��ĩβ

        public E getFirst()�����ش��б��еĵ�һ��Ԫ��
        public E getLast()�����ش��б��е����һ��Ԫ��

        public E removeFirst()���Ӵ��б���ɾ�������ص�һ��Ԫ��
        public E removeLast()���Ӵ��б���ɾ�����������һ��Ԫ��
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //�������϶���
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

//        public void addFirst(E e)���ڸ��б�ͷ����ָ����Ԫ��
//        public void addLast(E e)����ָ����Ԫ��׷�ӵ����б��ĩβ
        linkedList.addFirst("javase");
        linkedList.addLast("javaee");
        System.out.println(linkedList);

//        public E getFirst()�����ش��б��еĵ�һ��Ԫ��
//        public E getLast()�����ش��б��е����һ��Ԫ��
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);
    }
}
