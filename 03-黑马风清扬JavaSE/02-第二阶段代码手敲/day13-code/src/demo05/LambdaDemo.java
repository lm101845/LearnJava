package demo05;

/**
 * @Author 李明
 * @Date 2022/3/17 22:20
 **/

/**
 * Lambda表达式的省略模式
 * */
public class LambdaDemo {
    public static void main(String[] args) {
//        useAddable((int x,int y)->{
//            return x + y;
//        });

        //参数的类型可以省略
//        useAddable((x,y)->{
//            return x + y;
//        });

        //但是有多个参数的情况下，不能只省略一个，要省略就一起省略

//        useFlyable((String s)->{
//            System.out.println(s);
//        });

        //参数的类型可以省略
//        useFlyable((s)->{
//            System.out.println(s);
//        });

        //如果参数有且仅有一个，那么小括号也是可以省略的
//        useFlyable(s->{
//            System.out.println(s);
//        });

        //如果代码块的语句只有一条，那么可以省略大括号和分号
        useFlyable(s-> System.out.println(s));

        //如果有return,return也要省略掉(只针对代码块的语句只有一条的情况下)
        useAddable((x,y)-> x + y);
    }
    //这2个方法分别使用这2个接口作为形参
    private static void useFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }

    private static void useAddable(Addable a){
        int sum = a.add(10,20);
        System.out.println(sum);
    }
}
