package myGeneric.demo03;

/**
 * @author 李明
 * @date 2021年06月25日 17:40
 */

//public class Generic {
    //这种写法过于麻烦了
//    public void show(String s) {
//        System.out.println(s);
//    }
//
//    public void show(Integer i) {
//        System.out.println(i);
//    }
//
//    public void show(Boolean b) {
//        System.out.println(b);
//    }
//}

    //使用泛型类进行改进
//public class Generic<T>{
//    public void show(T t){
//        System.out.println(t);
//    }
//}

//泛型方法改进
public class Generic {
    public <T> void show(T t){
        System.out.println(t);
    }
}
