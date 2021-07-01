/**
 * @author 李明
 * @date 2021年06月19日 16:45
 */


/**
    异常
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int[] arr = {1, 2, 3};
        //System.out.println(arr[1]);
        //System.out.println(arr[3]); //ArrayIndexOutOfBoundsException  ——数组的索引越界异常
        //System.out.println(arr[2]);
    }
}
