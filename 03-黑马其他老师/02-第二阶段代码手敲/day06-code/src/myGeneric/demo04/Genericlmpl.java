package myGeneric.demo04;

/**
 * @author ����
 * @date 2021��06��25�� 22:14
 */
public class Genericlmpl<T> implements Generic<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
