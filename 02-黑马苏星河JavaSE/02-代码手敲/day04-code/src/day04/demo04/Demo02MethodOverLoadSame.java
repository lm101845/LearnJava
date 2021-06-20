package day04.demo04;
/**
 *题目要求：
 * 比较2个数据是否相等
 * 参数类型分别为两个byte类型，2个short类型，2个int类型，2个long类型
 * 并在main方法中进行测试
 */

public class Demo02MethodOverLoadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)20,(short)20));
        System.out.println(isSame(11,12));
        System.out.println(isSame(10L,10L));
    }

    public static boolean isSame(byte a,byte b){
        System.out.println("2个byte参数的方法执行了！");
        boolean same;
        if(a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        System.out.println("2个short参数的方法执行了！");
        boolean same = a == b? true:false;
        return same;
    }

    public static boolean isSame(int a ,int b){
        System.out.println("2个int参数的方法执行了！");

        return a == b;
    }

    public static boolean isSame(long a,long b){
        System.out.println("2个long参数的方法执行了！");

        if(a == b){
            return true;
        }else{
            return false;
        }
    }
}
