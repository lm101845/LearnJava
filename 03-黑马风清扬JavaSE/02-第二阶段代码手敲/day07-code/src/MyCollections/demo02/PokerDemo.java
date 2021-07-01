package MyCollections.demo02;

/**
 * @author ����
 * @date 2021��07��01�� 14:44
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * ����
 * ͨ������ʵ�ֶ����������е�ϴ�ƣ����ƺͿ���
 * <p>
 * ˼·��
 * 1:����һ���ƺУ�Ҳ���Ƕ���һ�����϶�����ArrayList����ʵ��
 * 2:���ƺ�����װ��
 * 3:ϴ�ƣ�Ҳ���ǰ��ƴ�������Collections��shuffle()����ʵ��
 * 4:���ƣ�Ҳ���Ǳ������ϣ���������ҷ���
 * 5:���ƣ�Ҳ����������ҷֱ�����Լ�����
 */
public class PokerDemo {
    public static void main(String[] args) {
        //����һ���ƺУ�Ҳ���Ƕ���һ�����϶�����ArrayList����ʵ��
        ArrayList<String> array = new ArrayList<>();

        //���ƺ�����װ��
        /*
            ?2,?3,?4...?K,?A
            ?2,...
            ?2,...
            ?2,...
            С��������
         */
        //���廨ɫ����
        String[] colors = {"?", "?", "?", "?"};

        //�����������
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }

        array.add("С��");
        array.add("����");
        //ϴ�ƣ�Ҳ���ǰ��ƴ�������Collections��shuffle()����ʵ��
        Collections.shuffle(array);

        //���ƣ�Ҳ���Ǳ������ϣ���������ҷ���
        //�ȴ����������
        ArrayList<String> lqxArray = new ArrayList<>();
        ArrayList<String> lyArray = new ArrayList<String>();
        ArrayList<String> fqyArray = new ArrayList<String>();
        //fqy���Ƿ����Ҳ�������Ƶ����ʦ

        //�������������ŵ���
        ArrayList<String> dpArray = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                //˵����������ŵ���
                dpArray.add(poker);
            } else if (i % 3 == 0) {
                //ʣ�µ��Ƹ�������ҷ���
                //��3ȡ�༴��
                lqxArray.add(poker);
            } else if (i % 3 == 1) {
                lyArray.add(poker);
            } else if (i % 3 == 2) {
                fqyArray.add(poker);
            }
        }
        //System.out.println(array);
        //���ƣ�Ҳ����������ҷֱ�����Լ�����
        lookPoker("����ϼ", lqxArray);
        lookPoker("����", lyArray);
        lookPoker("������", fqyArray);
        lookPoker("����", dpArray);
    }


    //���Ƶķ���
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name + "�����ǣ�" );
        for(String poker:array){
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
