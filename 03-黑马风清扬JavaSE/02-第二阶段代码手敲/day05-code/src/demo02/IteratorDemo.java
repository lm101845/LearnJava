package MyMap.demo02;

/**
 * @author ����
 * @date 2021��06��21�� 12:51
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
    Iterator�������������ϵ�ר�ñ�����ʽ
        Iterator<E> iterator()�����ش˼�����Ԫ�صĵ�������ͨ�����ϵ�iterator()�����õ�
        ��������ͨ�����ϵ�iterator()�����õ��ģ���������˵���������ڼ��϶����ڵ�

    Iterator�еĳ��÷���
        E next()�����ص����е���һ��Ԫ��
        boolean hasNext()������������и���Ԫ�أ��򷵻� true
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //�������϶���
        Collection<String> c = new ArrayList<String>();

        //���Ԫ��
        c.add("hello");
        c.add("world");
        c.add("java");

        //Iterator<E> iterator()�����ش˼�����Ԫ�صĵ�������ͨ�����ϵ�iterator()�����õ�
        Iterator<String> it = c.iterator();
        //������ͺͼ����еķ�����һ�µ�
        //Iterator��һ���ӿ�

        /**
         * Iterator<E> iterator() {
         *         return new Itr();
         *     }
         *
         * private class Itr implements Iterator<E>{
         *     ...
         * }
        */

        // E next()�����ص����е���һ��Ԫ��
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        //System.out.println(it.next());
        // ���һ������NoSuchElementException
        //�� Enumeration �� nextElement �����׳�������ö����û�и����Ԫ�ء�

        //boolean hasNext()������������и���Ԫ�أ��򷵻� true

        //д��1
//        if(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        if(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        if(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        if(it.hasNext()){
//            System.out.println(it.next());
//        }
        //�����Ͳ��ᱨ����

        //д��2����ѭ�����иĽ�
        while(it.hasNext()){
            //System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
    }
}
