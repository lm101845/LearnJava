package mySet.demo08;

/**
 * @author ����
 * @date 2021��06��25�� 15:26
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
    ����
        ��дһ�����򣬻�ȡ10��1-20֮����������Ҫ������������ظ������ڿ���̨���

    ˼·��
        1:����Set���϶���
        2:�������������
        3:�жϼ��ϵĳ����ǲ���С��10
            �ǣ�����һ�����������ӵ�����
            �ص�3����
        4:��������
 */
public class SetDemo {
    public static void main(String[] args) {
        //����Set����
        //Set<Integer> set = new HashSet<>();
        //��HashSet�������������������

        Set<Integer> set = new TreeSet<>();
        //ʹ��TreeSet�����������������

        //�������������
        Random r = new Random();

        //�жϼ��ϵĳ����Ƿ�С��10
        while(set.size() < 10){
            //����һ�����������ӵ�����
            int number = r.nextInt(20) + 1;
            set.add(number);
        }

        //��������
        for(Integer i:set){
            System.out.println(i);
        }
    }
}
