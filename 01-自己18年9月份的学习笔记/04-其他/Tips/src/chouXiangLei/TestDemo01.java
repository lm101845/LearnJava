package chouXiangLei;

/**
 * @���� ����
 * @���� 2018��11��5������8:03:46
 * 
 * ������ֱ��ʵ����������Ķ���
 */
abstract class A2{//����һ��������

    public void fun(){//��ͨ����
        System.out.println("���ڷ�����ķ���");
    }

    public abstract void print();//���󷽷���û�з����壬��abstract�ؼ���������

}

public class TestDemo01 {

    public static void main(String[] args) {
        //A2 a = new A2();     //û�а취ʵ���������
        /*
         * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    	   Cannot instantiate the type A2
    	   
    	   ���Ͽ�֪��A�ǳ���ģ��޷�ֱ�ӽ���ʵ����������Ϊʲô����ֱ��ʵ�����أ���һ����ʵ����֮�󣬾���ζ�����������Ե������е����Ի��߷Ź��ˣ����ڳ���������ڳ��󷽷��������󷽷�û�з����壬û�з�������޷����е��á���Ȼ�޷����з������õĻ�������ôȥ����ʵ���������ء�

     */
    }
}
