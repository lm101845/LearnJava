/**
 * @author ����
 * @date 2021��06��19�� 16:54
 */

/**
    JVM��Ĭ�ϴ�����
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        method();
        System.out.println("����");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
//        System.out.println(arr[1]);
        System.out.println(arr[3]);
    }
}
/**
��ʼ
 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
 at ExceptionDemo02.method(ExceptionDemo02.java:19)
 at ExceptionDemo02.main(ExceptionDemo02.java:12)
 */
