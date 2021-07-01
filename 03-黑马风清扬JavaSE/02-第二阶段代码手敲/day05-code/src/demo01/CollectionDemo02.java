package MyMap.demo01;

/**
 * @author ����
 * @date 2021��06��21�� 12:31
 */

import java.util.ArrayList;
import java.util.Collection;

/**
    Collection���ϳ��÷���:
        boolean add(E e):���Ԫ��
        boolean remove(Object o):�Ӽ������Ƴ�ָ����Ԫ��
        void clear():��ռ����е�Ԫ��
        boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ��
        boolean isEmpty():�жϼ����Ƿ�Ϊ��
        int size():���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���

    Alt+7   ��һ�����ڣ��ܹ��������������Ϣ
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        //�������϶���
        Collection<String> c = new ArrayList<>();

        //boolean add(E e):���Ԫ��
//        System.out.println(c.add("hello"));  //true
//        System.out.println(c.add("world"));  //true
//        System.out.println(c.add("world"));  //true
        //��������ǿ��Դ洢�ظ�Ԫ�ص�
        //����add������Զ���صĶ���true
        c.add("hello");
        c.add("world");
        c.add("java");

        //boolean remove(Object o):�Ӽ������Ƴ�ָ����Ԫ��
        System.out.println(c.remove("world"));  //true
        System.out.println(c.remove("javaee")); //false

        //void clear():��ռ����е�Ԫ��
        //c.clear();

        //boolean contains(Object o):�жϼ������Ƿ����ָ����Ԫ��
        System.out.println(c.contains("hello"));   //true
        System.out.println(c.contains("world"));   //false

        // boolean isEmpty():�жϼ����Ƿ�Ϊ��
        System.out.println(c.isEmpty());   //false

        //int size():���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ���
        System.out.println(c.size());
        //������϶���
        System.out.println(c);
    }
}
