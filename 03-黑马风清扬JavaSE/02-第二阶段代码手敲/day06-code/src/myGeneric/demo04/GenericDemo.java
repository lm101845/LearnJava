package myGeneric.demo04;

/**
 * @author ����
 * @date 2021��06��25�� 22:12
 */

/**

������
* */
public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new Genericlmpl<>();
        g1.show("����ϼ");

        Generic<Integer> g2 = new Genericlmpl<>();
        g2.show(30);
    }
}
