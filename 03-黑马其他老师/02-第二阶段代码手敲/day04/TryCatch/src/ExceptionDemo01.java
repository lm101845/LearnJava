/**
 * @author 李明
 * @date 2021年06月19日 17:43
 */

/**
    try {
        可能出现异常的代码;
    } catch(异常类名 变量名) {
        异常的处理代码;
    }
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method(){
     try{
         int[] arr = {1,2,3};
         System.out.println(arr[2]);
         System.out.println(arr[3]);  //相当于new ArrayIndexOutOfBoundsException
     }catch (ArrayIndexOutOfBoundsException e){
         System.out.println("你访问的数组的索引不存在");
         //e是一个对象，可以调用方法
         e.printStackTrace();
     }
    }
}
