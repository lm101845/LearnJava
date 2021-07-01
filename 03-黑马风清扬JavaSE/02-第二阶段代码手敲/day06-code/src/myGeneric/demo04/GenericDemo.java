package myGeneric.demo04;

/**
 * @author 李明
 * @date 2021年06月25日 22:12
 */

/**

测试类
* */
public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new Genericlmpl<>();
        g1.show("林青霞");

        Generic<Integer> g2 = new Genericlmpl<>();
        g2.show(30);
    }
}
