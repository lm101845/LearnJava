package myGeneric.demo04;

/**
 * @author 李明
 * @date 2021年06月25日 22:14
 */
public class Genericlmpl<T> implements Generic<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
