package day05.demo04;

/**
 * @author ����
 * @date 2021��06��02�� 4:23
 */

/**
���������Ϊ�����Ĳ�����
�����÷�����ʱ���򷽷���С���Ž��д��Σ����ݽ�ȥ����ʵ������ĵ�ֵַ��
 */
public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        System.out.println(array);   //��ֵַ
        printArray(array);      //���ݽ�ȥ�ľ���array���б���ĵ�ֵַ
        System.out.println("===============aaa");

        printArray(array);
        System.out.println("===============bbb");

        printArray(array);
        System.out.println("===============ccc");
//        for(int i = 0; i < array.length;i++){
//            System.out.println(array[i]);
//        }
//        System.out.println("aaa");
//
//        for(int i = 0; i < array.length;i++){
//            System.out.println(array[i]);
//        }
//        System.out.println("bbb");
//
//        for(int i = 0; i < array.length;i++){
//            System.out.println(array[i]);
//        }
//        System.out.println("ccc");
    }

    /**
    ��Ҫ��
    ����ֵ���ͣ�ֻ�ǽ��д�ӡ���ѣ�����Ҫ���м��㣬Ҳû�н������void
    �������ƣ�printArray
    �����б�����������飬�Ҳ��ܴ�ӡ���е�Ԫ�ء�int[] array
     */
    public static void printArray(int[] array){
        //��������Ҳ����Ϊ��������������
        //�κ��������Ͷ�����Ϊ�����Ĳ���������������
        System.out.println("printArray�����յ��Ĳ����ǣ�" + array);
        //Ҳ�ǵ�ֵַ
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
