package day07.demo03;

/**
 * @author ����
 * @date 2021��06��03�� 17:39
 */

import java.util.Random;

/**
��ĿҪ��
����int����n��ֵ������ȡ������֣���Χ��[1,n]������ȡ��1Ҳ����ȡ��n��

˼·��
1. ����һ��int����n�����⸳ֵ
2. Ҫʹ��Random���������裬������������ʹ��
3. ���д10����ô����0~9��Ȼ����Ҫ����1~10�����Է��֣�����+1���ɡ�
4. ��ӡ�������
 */
public class Demo03Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            //r.nextInt(n);   //��Χ��[0,n)
            int result = r.nextInt(n) + 1;  //��Χ��[1,n+1) ����> ��[1,n]
            System.out.println(result);
        }

    }
}
