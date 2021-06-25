package myGeneric.demo06;

/**
 * @author 李明
 * @date 2021年06月25日 22:24
 */

/**
 * 测试类
 */
public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

    }

    //使用可变参数这样写
//    public static int sum(int... a) {
//        //System.out.println(a);
//        //这个a其实是个数组
//        //return 0;
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

    //public static int sum(int ...a,int b){
    public static int sum(int b,int ...a){
        //可变参数要放到后面才不会报错
        return 0;
    }

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
}
