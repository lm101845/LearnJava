/**
 * @author 李明
 * @date 2021年06月19日 16:54
 */

/**
    JVM的默认处理方案
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
//        System.out.println(arr[1]);
        System.out.println(arr[3]);
    }
}
/**
开始
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
 at ExceptionDemo02.method(ExceptionDemo02.java:19)
 at ExceptionDemo02.main(ExceptionDemo02.java:12)
 */
