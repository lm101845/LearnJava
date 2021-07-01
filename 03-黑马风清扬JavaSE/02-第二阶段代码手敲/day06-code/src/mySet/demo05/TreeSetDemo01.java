package mySet.demo05;

/**
 * @author ����
 * @date 2021��06��25�� 14:09
 */

import java.util.TreeSet;

/**
    TreeSet�����ص�
        1:Ԫ�����������˳����ָ�洢��ȡ����˳�򣬶��ǰ���һ���Ĺ���������򣬾�������ʽȡ���ڹ��췽��
            TreeSet()��������Ԫ�ص���Ȼ�����������
            TreeSet(Comparator comparator) ������ָ���ıȽ�����������
        2:û�д������ķ��������Բ���ʹ����ͨforѭ������
        3:������Set���ϣ����Բ������ظ�Ԫ�صļ���
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        //�������϶���
        //ע�⣺���л��������õ�ʱ��Ҫ�û������͵İ�װ���ͣ���Ϊ��������Ҫ����������
        TreeSet<Integer> ts = new TreeSet<>();

        //���Ԫ��
        ts.add(10);  //ֱ��д10�ǿ��Եģ���ΪJDK5�Ժ�����Զ�װ��
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        ts.add(30);

        //��������
        for(Integer i:ts){
            System.out.println(i);
        }
    }
}
