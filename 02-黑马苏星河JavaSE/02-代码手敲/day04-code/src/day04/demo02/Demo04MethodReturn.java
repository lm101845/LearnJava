package day04.demo02;
/**
 *题目要求：定义一个方法，用来【求出】2个数字之和(你帮我算，算完之后把结果告诉我)
 *题目变形：定义一个方法，用来【打印】两个数字之和。(你来计算，算完之后你自己负责显示结果，不用告诉我结果，我不关心，你自己打印显示出来就得了)
 *
 *注意事项：
 *对于有返回值的方法，可以使用单独调用、打印调用或者赋值调用
 *对于无返回值的方法，只能使用单独调用，不能使用打印调用或者赋值调用(都没有返回值了，人家自己消化掉了，你这里什么也拿不到的)
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
         //我是main方法，我来调用你
         //我调用你，你来帮我算一下，算完了之后，把结果告诉我的num变量
         int num = getSum(10,20);
        System.out.println("返回值是" + num);
        System.out.println("=============");

        printSum(100,200);
        System.out.println("=============");

        System.out.println(getSum(2,3));   //正确写法
        getSum(3,5);    //正确写法，但是没有使用返回值(即返回值没有用到)
        System.out.println("=============");
        //对于void没有返回值的方法，只能单独，不能打印或者赋值
        //System.out.println(printSum(2,3));  //错误写法，你返回值类型为void,说明你什么结果都没告诉我，那你还让我打印什么呢？？？
        //这个就类似于
        //System.out.println(void);   //这是一种错误的写法

        //int num2 = printSum(10,20);   //也是错误写法
        //这个就类似于
        //int num3 = void;
        //void表示一片虚无，什么都没有，既然什么都没有你还把这个虚无给赋值给num3,那自然会报错
        //void num4 = void;  //也是错误写法

    }

    //我是一个方法，我负责2个数字相加
    //我有返回值int,谁调用我，我就把计算结果告诉谁
    public static int getSum(int a,int b){
        int result = a + b;
        return result;
    }

    //我是一个方法，我负责2个数字相加
    //我没有返回值(所以前面用void)，不会把结果告诉任何人，而是我自己进行打印输出
    public static void printSum(int a,int b){
        int result = a + b;
        System.out.println(result);
    }
}
