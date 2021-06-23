package TryCatch;

/**
 * @author 李明
 * @date 2021年06月23日 13:57
 */

/**
 *
 * 链接https://cloud.tencent.com/developer/article/1088141
 *
 * try
 * {
 *
 * 　　//需要被检测的异常代码
 *
 * }catch(Exception e)
 * {
 *     //异常处理,即处理异常代码
 * }finally
 * {
 *
 * 　　//一定会被执行的代码
 *
 * }
 * */


public class Demo01 {
    public static void main(String[] args) {
        try{
            int i = 1 / 0;
        }catch (Exception e){
            System.out.println(e.toString());
            //java.lang.ArithmeticException: / by zero
        }finally {
            System.out.println("一定会被执行的代码在finally里面");
        }
    }
}
