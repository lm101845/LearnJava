package mySet.demo01;

/**
 * @author ����
 * @date 2021��06��24�� 14:07
 */

import java.util.HashSet;
import java.util.Set;

/**
    Set�����ص�
        �������ظ�Ԫ�صļ���
        û�д������ķ��������Բ���ʹ����ͨforѭ������

    HashSet���Լ��ϵĵ���˳�����κα�֤
 */
public class SetDemo {
    public static void main(String[] args) {
        //�������϶���
        //Set��һ���ӿڣ�����ֱ��ʵ����
        //��������Ҫ�ҵ�����ʵ����
        Set<String> set = new HashSet<>();

        //���Ԫ��
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");
        //Set�����ǲ������ظ�Ԫ�صļ���

        //����
        for(String s:set){
            System.out.println(s);
        }

    }
}
