package day11.demo05;

/**
 * @author ����
 * @date 2021��06��15�� 10:30
 */

/**
����ӿڵ�ʵ���ࣨ�����Ǹ�������ֻࣩ��Ҫʹ��Ψһ��һ�Σ�
��ô��������¾Ϳ���ʡ�Ե�����Ķ��壬����Ϊʹ�á������ڲ��ࡿ��

�����ڲ���Ķ����ʽ��
�ӿ����� ������ = new �ӿ�����() {
    // ������д���г��󷽷�
};

�Ը�ʽ��new �ӿ�����() {...}�����н�����
1. new����������Ķ���
2. �ӿ����ƾ��������ڲ�����Ҫʵ���ĸ��ӿ�
3. {...}����������ڲ��������

���⻹Ҫע�⼸�����⣺
1. �����ڲ��࣬�ڡ��������󡿵�ʱ��ֻ��ʹ��Ψһһ�Ρ�
���ϣ����δ������󣬶����������һ���Ļ�����ô����Ҫʹ�õ��������ʵ�����ˡ�
2. ���������ڡ����÷�������ʱ��ֻ�ܵ���Ψһһ�Ρ�
���ϣ��ͬһ�����󣬵��ö�η�������ô���������������֡�
3. �����ڲ�����ʡ���ˡ�ʵ����/�������ơ�����������������ʡ���ˡ��������ơ�
ǿ���������ڲ��������������һ���£�����
 */
public class DemoMain {
    public static void main(String[] args) {
        //MyInterfaceImpl impl = new MyInterfaceImpl();
        //impl.method1();
        //ʵ���า����д�˷���

        //����ѧ���˶�̬�������ӣ���߿����ǽӿڣ��ұ߿�����ʵ����
        //MyInterface obj = new MyInterfaceImpl();
        //obj.method();
        //ʵ���า����д�˷���

        //MyInterface some = new MyInterface();
        //����д�������ӿڲ���ֱ��new

        //��㷽ʽ��ʹ�������ڲ���(����Ҫ����дMyInterfaceImpl�ˣ�����)
        MyInterface objA = new MyInterface(){
            //�ӿ�����ĳ��󷽷��϶���Ҫ������д�ģ���
            @Override
            public void method1() {
                System.out.println("�����ڲ���ʵ���˷���111-A");
            }

            @Override
            public void method2() {
                System.out.println("�����ڲ���ʵ���˷���222-A");
            }
        };
        //ĩβ�ķֺŲ�Ҫ��
        objA.method1();
        objA.method2();

        System.out.println("=================");
            //ʹ���������ڲ��࣬����ʡ���˶������ƣ�Ҳ����������
            /*MyInterface objB = */new MyInterface(){
            //�ӿ�����ĳ��󷽷��϶���Ҫ������д�ģ���
            @Override
            public void method1() {
                System.out.println("�����ڲ���ʵ���˷���111-B");
            }

            @Override
            public void method2() {
                System.out.println("�����ڲ���ʵ���˷���222-B");
            }
        }.method1();
        //ĩβ�ķֺŲ�Ҫ��
        //objB.method1();
        //objB.method2();

        //��Ϊ���������޷����õڶ��η�����������Ҫ�ٴ���һ�������ڲ���ĵڶ��ζ���
        /*MyInterface objB = */new MyInterface(){
            //�ӿ�����ĳ��󷽷��϶���Ҫ������д�ģ���
            @Override
            public void method1() {
                System.out.println("�����ڲ���ʵ���˷���111-B");
            }

            @Override
            public void method2() {
                System.out.println("�����ڲ���ʵ���˷���222-B");
            }
        }.method2();
    }
}
