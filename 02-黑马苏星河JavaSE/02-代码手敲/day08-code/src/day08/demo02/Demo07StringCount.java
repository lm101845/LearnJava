package day08.demo02;

/**
 * @author ����
 * @date 2021��06��04�� 18:09
 */

import java.util.Scanner;

/**
��Ŀ��
��������һ���ַ���������ͳ�����и����ַ����ֵĴ�����
�����У���д��ĸ��Сд��ĸ�����֡�����

˼·��
1. ��Ȼ�õ��������룬�϶���Scanner
2. ������������ַ�������ô��String str = sc.next();
3. �����ĸ��������ֱ���������ַ����Եĳ��ִ�����
4. ��Ҫ���ַ���һ���֡�һ���ּ�飬String-->char[]����������toCharArray()
5. ����char[]�ַ����飬�Ե�ǰ�ַ�����������жϣ��������ĸ���������++������
6. ��ӡ����ĸ��������ֱ���������ַ����ִ�����
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String input = sc.next();    //��ȡ���������һ���ַ���

        int countUpper = 0;   //��д��ĸ
        int countLower = 0; // Сд��ĸ
        int countNumber = 0; // ����
        int countOther = 0; // �����ַ�

        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];   // ��ǰ�����ַ�
            if('A' <= ch && ch <= 'Z'){
                countUpper++;
            }else if('a' <= ch && ch <= 'z'){
                countLower++;
            }else if('0' <= ch && ch <= '9'){
                countNumber++;
            }else{
                countOther++;
            }
        }

        System.out.println("��д��ĸ�У�" + countUpper);
        System.out.println("Сд��ĸ�У�" + countLower);
        System.out.println("�����У�" + countNumber);
        System.out.println("�����ַ��У�" + countOther);
    }
}
