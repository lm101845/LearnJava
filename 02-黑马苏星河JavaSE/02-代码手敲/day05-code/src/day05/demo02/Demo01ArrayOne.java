package day05.demo02;

/**
 * @author ����
 * @date 2021��06��02�� 3:18
 */
public class Demo01ArrayOne {
    public static void main(String[] args) {
        int[] array = new int[3];      //��̬��ʼ��
        //�Ⱥ���߾���һ������
        //�����ȿ����ǻ����������ͣ�Ҳ�����������������ͣ���
        //����int[] array����ջ�ڴ��е�
        System.out.println(array);      //[I@1c53fd30
        System.out.println(array[0]);   //0
        System.out.println(array[1]);   //0
        System.out.println(array[2]);   //0
        System.out.println("==========");

        //�ı����鵱��Ԫ�ص�����
        array[1] = 10;
        array[2] = 20;
        System.out.println(array);       //[I@1c53fd30
        System.out.println(array[0]);   //0
        System.out.println(array[1]);   //10
        System.out.println(array[2]);   //20
    }
}
