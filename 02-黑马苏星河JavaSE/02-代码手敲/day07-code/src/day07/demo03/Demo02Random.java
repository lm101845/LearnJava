package day07.demo03;

import java.util.Random;

/**
 * @author ����
 * @date 2021��06��03�� 17:26
 */
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);  //��Χʵ������[0-9],ȡ����10
            System.out.println(num);
        }
    }
}
