package day07.demo02;

/**
 * @author ����
 * @date 2021��06��03�� 16:29
 */

import java.util.Scanner;

/**
 * �κ��������Ͷ�������Ϊ�����Ĳ����ͷ���ֵ������Ҳ������
 */

public class Demo02Anoymous {
    public static void main(String[] args) {
        //��ͨʹ�÷�ʽ
        //Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();

        //��������ķ�ʽ
        //int num = new Scanner(System.in).nextInt();
        //System.out.println("������ǣ�" + num);

        //ʹ��һ��д���������
        //Scanner sc = new Scanner(System.in);
        //methodParam(sc);

        //ʹ���������������д���
        methodParam(new Scanner(System.in));


        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("�������:" + num);
    }

    //������������Ϊ�����Ĳ���
    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("������ǣ�" + num);
    }

    //������������Ϊ����ֵ
    public static Scanner methodReturn(){
        //д��1��
        //Scanner sc = new Scanner(System.in);
        //return sc;
        return new Scanner(System.in);
    }
}
