package day04.demo02;
/**
 * 复习一下此前学习的方法基础入门知识。
 * 定义格式：
 * public static void 方法名称(){
 *     方法体
 * }
 *
 * 调用格式：
 * 方法名称();
 *
 * 注意事项：
 * 1.方法定义的先后顺序无所谓。
 * 2.方法定义必须是挨着的，不能在一个方法的内部定义另外一个方法。
 * 3.方法定义之后，自己不会执行的，如果需要执行，一定要进行调用。
 */

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod(){
        //        次数确定，我们使用for循环
        for (int j = 1; j <= 5; j++) {
//            System.out.println("*");
//            ln表示line，即换行的意思，去掉ln它就不换行了
//            使用5.fori即可自动显示for循环
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
//            我们希望它每20个就换个行，所以我们在它内外中间写一个输出语句
//            输出语句里面什么也不写，它就自动换行了
            System.out.println();
        }
    }
}
