package day05.demo04;

/**
 * @author ����
 * @date 2021��06��02�� 4:34
 */

/**
һ������������0��1���������������ֻ����0����1������ֵ�������ж������ֵ��
���ϣ��һ���������в����˶��������ݽ��з��أ���ô�죿
���������ʹ��һ��������Ϊ����ֵ���ͼ��ɡ�

�κ��������Ͷ�����Ϊ�����Ĳ������ͣ����߷���ֵ���͡�

������Ϊ�����Ĳ��������ݽ�ȥ����ʵ������ĵ�ֵַ��
������Ϊ�����ķ���ֵ�����ص���ʵҲ������ĵ�ֵַ��
 */
public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);

        System.out.println("main�������յ��ķ���ֵ�����ǣ�");
        System.out.println(result); // ��ֵַ

        System.out.println("�ܺͣ�" + result[0]);
        System.out.println("ƽ������" + result[1]);
    }

    public static int[] calculate(int a,int b,int c){
        int sum = a + b + c;  //�ܺ�
        int avg = sum / 3;    //ƽ����
        //���������ϣ�����з���
        //return sum,avg;
        //������ôд
        // ��Ҫһ�����飬Ҳ����һ�����϶���������Ա��������


        //д��1��
//        int[] array = new int[2];
//        array[0] = sum; // �ܺ�
//        array[1] = avg; // ƽ����

        //д��2������Ҳ����ʹ�þ�̬��ʼ��
        int[] array = {sum,avg};
        System.out.println("calculate�����ڲ������ǣ�");
        System.out.println(array); // ��ֵַ
        return array;
    }
}
