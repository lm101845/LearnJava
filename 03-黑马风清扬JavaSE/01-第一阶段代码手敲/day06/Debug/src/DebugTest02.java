/**
 * @author ����
 * @date 2021��06��19�� 16:34
 */

import java.util.Scanner;

/**
    �鿴�������õ�ִ������
 */
public class DebugTest02 {
    public static void main(String[] args) {
        //��������
        Scanner sc = new Scanner(System.in);

        //��������
        System.out.println("�������һ��������");
        int a = sc.nextInt();

        System.out.println("������ڶ���������");
        int b = sc.nextInt();

        //���÷���
        int max = getMax(a, b);

        //������
        System.out.println("�ϴ��ֵ�ǣ�" + max);
    }

    //��ȡ�������Ľϴ�ֵ
    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
