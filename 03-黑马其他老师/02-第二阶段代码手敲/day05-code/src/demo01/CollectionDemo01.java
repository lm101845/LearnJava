package demo01;

/**
 * @author ����
 * @date 2021��06��21�� 12:27
 */

import java.util.ArrayList;
import java.util.Collection;

/**
    ����Collection���ϵĶ���
        ��̬�ķ�ʽ
        ArrayList()
 */
public class CollectionDemo01 {
    public static void main(String[] args){
        //����Collection���ϵĶ���
        Collection<String> c = new ArrayList<>();

        //���Ԫ��
        c.add("hello");
        c.add("world");
        c.add("java");

        //������϶���
        System.out.println(c);
    }

}
