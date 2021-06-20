package day07.demo03;

/**
 * @author ����
 * @date 2021��06��03�� 17:53
 */

import java.util.Random;
import java.util.Scanner;

/**
 * ��Ŀ��
 * �ô���ģ������ֵ�С��Ϸ(Ҫ��1-100֮�������)��
 * <p>
 * ˼·��
 * 1. ������Ҫ����һ��������֣�����һ���������ٱ仯����Random��nextInt����
 * 2. ��Ҫ�������룬�����õ���Scanner
 * 3. ��ȡ������������֣���Scanner���е�nextInt����
 * 4. �Ѿ��õ����������֣��жϣ�if��һ�£�
 * ���̫���ˣ���ʾ̫�󣬲������ԣ�
 * ���̫С�ˣ���ʾ̫С���������ԣ�
 * ��������ˣ���Ϸ������
 * 5. ���Ծ�������һ�Σ�ѭ��������ȷ������while(true)��
 */
public class Demo04RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;  //[1,100]
        //���randomNumֻ���������һ�Σ�֮����µ�ʱ�����ٱ��ˣ���������������һ��
        //��2�в����ظ�ִ��

        Scanner sc = new Scanner(System.in);

        //����Щ��д��while����
        while (true) {
            System.out.println("��������²�����֣�");
            int guessNum = sc.nextInt();   //��������²������

            if (guessNum > randomNum) {
                System.out.println("̫���ˣ�������");
            } else if (guessNum < randomNum) {
                System.out.println("̫С�ˣ�������");
            } else {
                System.out.println("��ϲ�㣬������");
                break;
                //������У��������ԣ���Ϸ����
            }
        }

        System.out.println("��Ϸ����");
        System.out.println(randomNum);
    }
}
