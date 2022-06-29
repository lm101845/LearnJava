package team.test;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Author liming
 * @Date 2022/6/29 16:07
 **/
public class number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入平均数：");
        double len = scanner.nextDouble();
        double MIN = len - 10;
        double MAX = len + 10;
//        System.out.println("平均数为：" + len);
        double[] arr  = new double[5];
        DecimalFormat df= new DecimalFormat( "0.00");
        for (int i = 0; i < 5; i++) {
            if(i == 4){
                arr[i] = len * 5 - arr[0] - arr[1]- arr[2] - arr[3];
            }else{
                arr[i] = (double)(Math.random() * (MAX - MIN + 1) + MIN);
            }
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(df.format(arr[i]) + "\t");
        }
        System.out.println();
    }
}
