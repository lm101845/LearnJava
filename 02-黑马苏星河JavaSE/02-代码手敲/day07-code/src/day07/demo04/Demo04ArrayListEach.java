package day07.demo04;

import java.util.ArrayList;

/**
 * @author ����
 * @date 2021��06��04�� 3:11
 */
public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("�����Ȱ�");
        list.add("��������");
        list.add("�������");

        //��������(list.fori�س�)
        //��������������������
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
