package day05.demo03;

/**
 * @author ����
 * @date 2021��06��02�� 4:03
 */
public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000};
        int max = array[0];    //������̨
        for(int i = 1; i < array.length; i++){
            //����Ҫ��1��ʼ��ս���������Լ����Լ�����
            // �����ǰԪ�أ���max��������
            if(array[i] > max){
                max = array[i];
            }
        }
        // ˭�����������������max��������˭��ս����
        System.out.println("���ֵ��" + max);
    }
}
