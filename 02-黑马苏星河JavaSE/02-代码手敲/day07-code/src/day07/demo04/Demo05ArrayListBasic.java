package day07.demo04;

import java.util.ArrayList;

/**
 * @author ����
 * @date 2021��06��04�� 3:18
 */

/**
���ϣ���򼯺�ArrayList���д洢�����������ݣ�����ʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ��
 ����ѻ�������100����һ�����϶���������װ��һ������

��������    ��װ�ࣨ�������ͣ���װ�඼λ��java.lang���£��������ǲ���Ҫ����������
byte        Byte
short       Short
int         Integer     �����⡿
long        Long
float       Float
double      Double
char        Character   �����⡿
boolean     Boolean

��JDK 1.5+��ʼ��֧���Զ�װ�䡢�Զ����䡣��������Ҫ�˹���Ԥ�������Զ���ɵġ�

�Զ�װ�䣺�������� --> ��װ����
�Զ����䣺��װ���� --> ��������
 */
public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        //����д��������ֻ�����������ͣ������ǻ������ͣ���
        //ArrayList<int> listB = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        listC.add(300);
        listC.add(400);
        System.out.println(listC);  //[100, 200, 300, 400]

        int num = listC.get(1);
        System.out.println("��2��Ԫ���ǣ�" + num);
    }
}
