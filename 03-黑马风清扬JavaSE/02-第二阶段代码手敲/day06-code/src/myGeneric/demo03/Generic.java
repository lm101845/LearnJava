package myGeneric.demo03;

/**
 * @author ����
 * @date 2021��06��25�� 17:40
 */

//public class Generic {
    //����д�������鷳��
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

    //ʹ�÷�������иĽ�
//public class Generic<T>{
//    public void show(T t){
//        System.out.println(t);
//    }
//}

//���ͷ����Ľ�
public class Generic {
    public <T> void show(T t){
        System.out.println(t);
    }
}
