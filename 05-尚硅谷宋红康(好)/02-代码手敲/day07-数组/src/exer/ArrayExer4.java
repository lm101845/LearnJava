package exer;

/**
 * @Author liming
 * @Date 2022/5/31 12:39
 **/

import java.util.Scanner;

/**
 * 面试题：回形数格式方阵的实现
 * 从键盘输入一个整数（1~20）
 * 则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如： 输入数字2，则程序输出： 1 2
 * 4 3
 * 输入数字3，则程序输出：
 * 1 2 3
 * 8 9 4
 * 7 6 5
 * 输入数字4， 则程序输出：
 * 1   2   3   4
 * 12  13  14  5
 * 11  16  15  6
 * 10  9   8   7
 * 方法1：
 * 唉，自己不会啊
 */
public class ArrayExer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1-20的整数：");
        int len = scanner.nextInt();
        int[][] arr = new int[len][len];
        int s = len * len;  //一共有多少个数
        /*
         * k = 1:向右 k = 2:向下 k = 3:向左 k = 4:向上
         */
        int k = 1;
        int i = 0, j = 0;
        for (int m = 1; m <= s; m++) {
            if (k == 1) {
                if (j < len && arr[i][j] == 0) {
                    arr[i][j++] = m;
                } else {
                    k = 2;
                    i++;
                    j--;
                    m--;
                }
            } else if (k == 2) {
                if (i < len && arr[i][j] == 0) {
                    arr[i++][j] = m;
                } else {
                    k = 3;
                    i--;
                    j--;
                    m--;
                }
            } else if (k == 3) {
                if (j >= 0 && arr[i][j] == 0) {
                    arr[i][j--] = m;
                } else {
                    k = 4;
                    i--;
                    j++;
                    m--;
                }
            } else if (k == 4) {
                if (i >= 0 && arr[i][j] == 0) {
                    arr[i--][j] = m;
                } else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }
        // 遍历
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + "\t");
            }
            System.out.println();
        }

    }
}
