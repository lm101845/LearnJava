package jieKou;
/**
 * @���� ����
 * @���� 2018��11��5������9:16:34
 * 
 * ���ڽӿ�������ڳ��󷽷������Խӿڶ�����ֱ��ʹ�ùؼ���new����ʵ�������ӿڵ�ʹ��ԭ�����£� 
��1���ӿڱ���Ҫ�����࣬����ʱһ���������ʹ��implements�ؼ���ʵ�ֶ���ӿڣ� 
��2���ӿڵ����ࣨ������ǳ����ࣩ����ô����Ҫ��д�ӿ��е�ȫ�����󷽷��� 
��3���ӿڵĶ����������������������ת�ͽ���ʵ������

 */
interface A{//����һ���ӿ�A

    public static final String MSG = "hello";//ȫ�ֳ���

    public abstract void print();//���󷽷�
}

interface B{//����һ���ӿ�B

    public abstract void get();
}

class X implements A,B{//X��ʵ����A��B�����ӿ�

    @Override
    public void print() {
        System.out.println("�ӿ�A�ĳ��󷽷�print()");
    }

    @Override
    public void get() {
        System.out.println("�ӿ�B�ĳ��󷽷�get()");
    }

}


public class TestDemo {

    public static void main(String[] args){

        X x = new X();//ʵ�����������
        A a = x;//����ת��
        B b = x;//����ת��

        a.print();
        b.get();
    }

}

