package myGeneric.demo02;

/**
 * @author 李明
 * @date 2021年06月25日 17:29
 */
public class Generic<T> {
    private T t;

    public T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }
}
