package day04.demo03;
/**
 *使用方法的时候，注意事项：
 * 1.方法不能嵌套：方法应该定义在类中，但是方法当中不能再定义方法
 * 2.方法定义的前后顺序无所谓
 * 3.方法定义之后不会执行，如果希望执行，一定要调用：单独调用、打印调用、赋值调用
 * 4.如果方法有返回值，那么必须写上"return 返回值"，不能没有。
 * 5.return后面的返回值数据，必须和方法的返回值类型，对应起来。
 * 6.对于一个void没有返回值的方法，就不能写return后面的返回值，只能写return自己
 * 7.对于方法当中最后一行的return可以省略不写
 * 8.一个方法当中可以有多个return语句，但是必须保证同时只有一个会执行到,2个return不能连写
 */

public class Demo04MethodNotice {
    public static void main(String[] args) {

    }

    public static int method1(){
        return 10;
        //return 10.0;
        //10.0是double类型，不是int类型，会报错
    }

    public static void method2(){
        return ;
        //这样写是可以的，也表示没有返回值,只是结束方法的执行而已。


        //return 10;
        //错误的写法，方法没有返回值，return后面就不能写返回值!!!!!
    }

    public static void method3(){
        System.out.println("AAA");
        System.out.println("BBB");
        //return;
        //最后一行的return可以省略不写，但是如果你有返回值，则必须要有return
    }

    public static int getMax(int a,int b){
        //写法1
//        int max;
//        if(a>b){
//            max = a;
//        }else{
//            max = b;
//        }
//        return max;

        //写法2：
        if(a>b){
            return a;
            //return b;
        }else{
            return b;
        }
    }

}
