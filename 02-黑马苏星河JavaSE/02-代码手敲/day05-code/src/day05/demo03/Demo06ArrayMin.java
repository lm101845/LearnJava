package day05.demo03;

/**
 * @author ����
 * @date 2021��06��02�� 4:03
 */
public class Demo06ArrayMin {
    public static void main(String[] args) {
        int[] array = {5,15,30,20,10000,-20};
        int min = array[0];    //������̨
        for(int i = 1; i < array.length; i++){
            //����Ҫ��1��ʼ��ս���������Լ����Լ�����
            // �����ǰԪ�أ���min��С������
            if(array[i] < min){
                min = array[i];
            }
        }
        // ˭�����������������max��������˭��ս����
        System.out.println("��Сֵ��" + min);
    }
}
