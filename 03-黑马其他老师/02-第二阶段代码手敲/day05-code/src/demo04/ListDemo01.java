package demo04;

/**
 * @author ����
 * @date 2021��06��21�� 15:13
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
    List�����ص�
        ���򣺴洢��ȡ����Ԫ��˳��һ��
        ���ظ����洢��Ԫ�ؿ����ظ�
 */
public class ListDemo01 {
    public static void main(String[] args) {
        //�������϶���
        List<String> list = new ArrayList<>();
        //���Ԫ��
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");  //list���ظ�
        //������϶���
        System.out.println(list);


        //�������ķ�ʽ����
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
