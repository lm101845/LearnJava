package day07.demo03;

import java.util.Random;

/**
 * @author 李明
 * @date 2021年06月03日 17:26
 */
public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);  //范围实际上是[0-9],取不到10
            System.out.println(num);
        }
    }
}
