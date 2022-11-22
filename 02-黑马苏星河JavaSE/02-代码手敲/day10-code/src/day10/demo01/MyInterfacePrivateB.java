package day10.demo01;

/**
 * @author 李明
 * @date 2021年06月11日 7:28
 */

/**
 * 接口当中静态方法也可能产生重复代码的问题
 *
*/
public interface MyInterfacePrivateB {
    public static void methodStatic1(){
        System.out.println("默认方法1");
        //methodStaticCommon();
    }

    public static void methodStatic2(){
        System.out.println("默认方法2");
        //methodStaticCommon();
    }

    //private static void methodStaticCommon(){
    //    System.out.println("AAA");
    //    System.out.println("BBB");
    //    System.out.println("CCC");
    //}
}
