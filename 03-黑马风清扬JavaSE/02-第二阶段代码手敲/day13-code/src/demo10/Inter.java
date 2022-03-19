package demo10;

/**
 * @Author 李明
 * @Date 2022/3/19 16:51
 **/
public interface Inter {
    default void show1(){
        System.out.println("show1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();
        method();
        //注意：私有静态方法作用更大，不仅在默认方法，还是在静态方法，都可以调用
        System.out.println("show1结束执行");
    }
    default void show2(){
        System.out.println("show2开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
//        show();
        method();
        System.out.println("show2结束执行");
    }

    //私有方法：可以把相同的代码实现给提取出来
    private void show(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
    static void method1(){
        System.out.println("method1开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        //show();
        //报错:静态方法是不能调用非静态方法的
        //所以我们只能再写一个私有的静态方法，把相同的内容给提取出来
        method();
        System.out.println("method1结束执行");

    }
    static void method2(){
        System.out.println("method2开始执行");
//        System.out.println("初级工程师");
//        System.out.println("中级工程师");
//        System.out.println("高级工程师");
        method();
        System.out.println("method2结束执行");
    }

    private static void method(){
        System.out.println("初级工程师");
        System.out.println("中级工程师");
        System.out.println("高级工程师");
    }
}
