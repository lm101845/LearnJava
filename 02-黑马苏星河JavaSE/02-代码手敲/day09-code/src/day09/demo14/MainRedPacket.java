package day09.demo14;

import java.util.ArrayList;

/**
 * @author ����
 * @date 2021��06��10�� 0:58
 */
public class MainRedPacket{
    public static void main(String[] args) {
        Manager manager = new Manager("Ⱥ��",100);
        Member one = new Member("��ԱA",0);
        Member two = new Member("��ԱB",0);
        Member three = new Member("��ԱC",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("============");

        //Ⱥ���ܹ���20��Ǯ���ֳ�3�����
        ArrayList<Integer> redList = manager.send(20,3);

        //������ͨ��Աȥ�պ��
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("============");
    }
}
