package myThread.demo02;

/**
 * @Author ����
 * @Date 2022/2/1  11:58
 **/

/**
 *  Thread���л�ȡ�������߳����Ƶķ���
 *      void setName(String name)       �����̵߳����Ƹ���Ϊ���ڲ���name
 *      String getName()                ���ش��̵߳�����
 * */
public class MyThreadDemo {
    public static void main(String[] args) {
//        ������޲ι��췽�������Һ�����̵߳�����ֵ
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//        my1.setName("����");
//        my2.setName("�ɻ�");

//        ����Ǵ��ι��췽��������ʵ����ʱ��ֱ�Ӹ��߳�����һ������
//        �����˸���Ĵ��ι��췽��
//        Thread(String name)
//        ע�⣺���ι��췽����Thread�еģ�����Ҫ��ʹ�����ַ�ʽ���߳������֣�����Ҫ�����������ṩ������εĹ��췽��
//        ��ͨ��super�����ʸ���Ĵ��ι��췽��
//        MyThread my1 = new MyThread("����");
//        MyThread my2 = new MyThread("�ɻ�");
//        my1.start();
//        my2.start();

//        static Thread currentThread()
//        ���ضԵ�ǰ����ִ�е��̶߳�������á�
        System.out.println(Thread.currentThread().getName());  //main
        //main��������һ�����ֽ���main���߳���ִ�е�
    }
}

/**
 *     public Thread() {
 *         this(null, null, "Thread-" + nextThreadNum(), 0);
 *     }
 * */