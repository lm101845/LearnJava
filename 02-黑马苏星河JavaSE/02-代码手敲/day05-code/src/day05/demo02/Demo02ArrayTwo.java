package day05.demo02;

/**
 * @author ����
 * @date 2021��06��02�� 3:18
 */
public class Demo02ArrayTwo {
    public static void main(String[] args) {
        int[] arrayA = new int[3];      //��̬��ʼ��
        //�Ⱥ���߾���һ������
        //�����ȿ����ǻ����������ͣ�Ҳ�����������������ͣ���
        //����int[] array����ջ�ڴ��е�
        System.out.println(arrayA);      //[I@1c53fd30
        System.out.println(arrayA[0]);   //0
        System.out.println(arrayA[1]);   //0
        System.out.println(arrayA[2]);   //0
        System.out.println("==========");

        //�ı����鵱��Ԫ�ص�����
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);       //[I@1c53fd30
        System.out.println(arrayA[0]);   //0
        System.out.println(arrayA[1]);   //10
        System.out.println(arrayA[2]);   //20

        System.out.println("==========");

        int[] arrayB = new int[3];      //��̬��ʼ��
        //�Ⱥ���߾���һ������
        //�����ȿ����ǻ����������ͣ�Ҳ�����������������ͣ���
        //����int[] array����ջ�ڴ��е�
        System.out.println(arrayB);      //
        System.out.println(arrayB[0]);   //0
        System.out.println(arrayB[1]);   //0
        System.out.println(arrayB[2]);   //0
        System.out.println("==========");

        //�ı����鵱��Ԫ�ص�����
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB);       //[I@1c53fd30
        System.out.println(arrayB[0]);   //0
        System.out.println(arrayB[1]);   //10
        System.out.println(arrayB[2]);   //20
    }
}
