package myGeneric.demo06;

/**
 * @author ����
 * @date 2021��06��25�� 22:38
 */


import java.util.Set;

/**
 * Arrays����������һ����̬������
 * public static <T> List<T> asList(T... a)��������ָ������֧�ֵĹ̶���С���б�
 * <p>
 * List�ӿ�����һ����̬������
 * public static <E> List<E> of(E... elements)�����ذ�����������Ԫ�صĲ��ɱ��б�
 * <p>
 * Set�ӿ�����һ����̬������
 * public static <E> Set<E> of(E... elements) ������һ��������������Ԫ�صĲ��ɱ伯��
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        //public static <T> List<T> asList(T... a)��������ָ������֧�ֵĹ̶���С���б�
//        List<String> list = Arrays.asList("hello", "world", "java");
//
////        list.add("javaee"); //UnsupportedOperationException
////        list.remove("world"); //UnsupportedOperationException
//        list.set(1,"javaee");
//
//        System.out.println(list);

        //public static <E> List<E> of(E... elements)�����ذ�����������Ԫ�صĲ��ɱ��б�
//        List<String> list = List.of("hello", "world", "java", "world");
//
////        list.add("javaee");//UnsupportedOperationException
////        list.remove("java");//UnsupportedOperationException
////        list.set(1,"javaee");//UnsupportedOperationException
//
//        System.out.println(list);

        //public static <E> Set<E> of(E... elements) ������һ��������������Ԫ�صĲ��ɱ伯��
//        Set<String> set = Set.of("hello", "world", "java","world"); //IllegalArgumentException
        Set<String> set = Set.of("hello", "world", "java");

//        set.add("javaee");//UnsupportedOperationException
//        set.remove("world");//UnsupportedOperationException

        System.out.println(set);
    }
}
