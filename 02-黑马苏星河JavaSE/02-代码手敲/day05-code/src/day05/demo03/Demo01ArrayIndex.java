package day05.demo03;

/**
 * @author ����
 * @date 2021��06��02�� 3:47
 */

/**
 * �����������Ŵ�0��ʼ��һֱ��������ĳ���-1��Ϊֹ��
 * <p>
 * �����������Ԫ�ص�ʱ��������Ų������ڣ���ô���ᷢ��
 * ��������Խ���쳣
 * ArrayIndexOutOfBoundsException
 * <p>
 * ԭ���������д���ˡ�
 * ������޸ĳ�Ϊ���ڵ���ȷ������š�
 */
public class Demo01ArrayIndex {
    public static void main(String[] args) {
        int[] array = {15, 25, 35};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //System.out.println(array[3]);
        //����ArrayIndexOutOfBoundsException: 3
    }

}
