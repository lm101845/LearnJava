package day11.demo03;

/**
 * @author ����
 * @date 2021��06��14�� 22:28
 */
public class Demo02InnerClass {
    public static void main(String[] args) {
        // �ⲿ������.�ڲ������� ������ = new �ⲿ������().new �ڲ�������();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }
}
