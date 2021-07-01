package demo08;

/**
 * @author ����
 * @date 2021��06��22�� 21:54
 */

import java.util.ArrayList;
import java.util.List;

/**
    ��ǿfor���������Collection���ϵı���
        ʵ��Iterable�ӿڵ�������������Ϊ��ǿ�� for����Ŀ��
        ����JDK5֮����ֵģ����ڲ�ԭ����һ��Iterator���� ��

    ��ʽ��
        for(Ԫ���������� ������ : �������Collection����) {
            //�ڴ˴�ʹ�ñ������ɣ��ñ�������Ԫ��
        }
 */
public class ForDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
            System.out.println(i);
        }

        System.out.println("===============");

        String[] strArray = {"hello","world","java"};
        for(String s:strArray){
            System.out.println(s);
        }

        System.out.println("===============");

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        for(String s:list){
            System.out.println(s);
        }

        //�ڲ�ԭ����һ��Iterator������
        //�����׳��˲����޸��쳣��˵�������ڲ�����һ��������
        //ConcurrentModificationException
//        for(String s:list){
//            if(s.equals("apple")){
//                list.add("red");
//            }
//        }
    }
}
