package day11.demo07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����
 * @date 2021��06��15�� 15:47
 */

/**
java.util.List����ArrayList��ʵ�ֵĽӿڡ�
 */
public class DemoInterface {
    public static void main(String[] args) {
        //����ǽӿ����ƣ��ұ���ʵ�������ƣ�����Ƕ�̬д��
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("�����Ȱ�");
        list.add("��������");
        list.add("�������");
        list.add("ɳ������");
        return list;
        //��λͬѧ��ָ����list
        //����Ҵ�һ��ˮ
        //�Ұ�����ձ��Ӹ���
        //����ѱ��ӻ�������ʱ��(return)
        //������Ӿ���ˮ��
    }
}