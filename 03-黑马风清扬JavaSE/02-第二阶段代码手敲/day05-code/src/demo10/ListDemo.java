package demo10;

/**
 * @author ����
 * @date 2021��06��23�� 16:30
 */

import java.util.ArrayList;
import java.util.LinkedList;

/**
    List���ϳ������ࣺArrayList��LinkedList
        ArrayList���ײ����ݽṹ�����飬��ѯ�죬��ɾ��
        LinkedList���ײ����ݽṹ��������ѯ������ɾ��

    ��ϰ��
        �ֱ�ʹ��ArrayList��LinkedList��ɴ洢�ַ���������
 */
public class ListDemo {
    public static void main(String[] args) {
        //�������϶���
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        //����
        for(String s:array){
            System.out.println(s);
            //ʣ��2�ֱ�����ʽ��Ҳ���


    }
        System.out.println("===================");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        //����
        for(String s1:linkedList){
            System.out.println(s1);
            //ʣ��2�ֱ�����ʽ��Ҳ���
        }
}}
