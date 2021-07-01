package MyCollections.demo01.demo01;

/**
 * @author ����
 * @date 2021��07��01�� 14:21
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
    Collections��ĸ���
        ����Լ��ϲ����Ĺ�����

    Collections��ĳ��÷���
        public static <T extends Comparable<? super T>> void sort(List<T> list)����ָ�����б���������
        public static void reverse(List<?> list)����תָ���б���Ԫ�ص�˳��
        public static void shuffle(List<?> list)��ʹ��Ĭ�ϵ����Դ�������ָ�����б�
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        //�������϶���
        List<Integer> list = new ArrayList<>();

        //���Ԫ��
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        //Collections�Ǹ��࣬�����Ǿ�̬����������ֱ�ӱ������
        //public static <T extends Comparable<? super T>> void sort(List<T> list)����ָ�����б���������
        //Collections.sort(list);   //����Ȼ˳��(����)����

        //public static void reverse(List<?> list)����תָ���б���Ԫ�ص�˳��
        //Collections.reverse(list);


        //public static void shuffle(List<?> list)��ʹ��Ĭ�ϵ����Դ�������ָ�����б�
        Collections.shuffle(list);

        System.out.println(list);
    }
}
