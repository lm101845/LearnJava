package day07.demo01;

/**
 * @author ����
 * @date 2021��06��03�� 16:10
 */

import java.util.Scanner;

/**
 * ��Ŀ��
 * ������������int���֣�Ȼ��������е����ֵ��
 * <p>
 * ˼·��
 * 1. ��Ȼ�Ǽ������룬�϶���Ҫ�õ�Scanner
 * 2. Scanner�������裺������������ʹ��nextInt()����
 * 3. ��Ȼ���������֣���ô��������nextInt()�������õ�����int����
 * 4. �޷�ͬʱ�ж���������˭���Ӧ��ת����Ϊ�������裺
 * 4.1 �����ж�ǰ��������˭����õ�ǰ���������ֵ
 * 4.2 ����ǰ�����е����ֵ���ٺ͵��������ֱȽϣ��õ��������ֵ��е����ֵ
 * 5. ��ӡ���ս��
 */
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("�������һ�����֣�");
        int a = sc.nextInt();

        System.out.println("������ڶ������֣�");
        int b = sc.nextInt();

        System.out.println("��������������֣�");
        int c = sc.nextInt();

        //���ȵõ�ǰ�������ֵ��е����ֵ
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;

        System.out.println("���ֵ�ǣ�" + max);
    }
}
