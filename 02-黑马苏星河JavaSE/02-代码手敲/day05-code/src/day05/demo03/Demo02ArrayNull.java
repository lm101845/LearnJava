package day05.demo03;

/**
 * @author ����
 * @date 2021��06��02�� 3:51
 */

/**
���е��������ͱ���(��������)�������Ը�ֵΪһ��nullֵ�����Ǵ�������ʲô��û�С�

����������new��ʼ������ʹ�����е�Ԫ�ء�
���ֻ�Ǹ�ֵ��һ��null��û�н���new������
��ô���ᷢ����
��ָ���쳣 NullPointerException

ԭ������new
���������new
 */
public class Demo02ArrayNull {
    public static void main(String[] args) {
        int[] array = null;
        System.out.println(array[0]);
        //����һ��Ҫ�ȴ�������ʹ�ã������ڹ��Ƕ��壬û��new�����Ա���ǰ�ᱨ��
        //����θ�ֵΪnull,�򲻻ᱨ��������Ϊ����Ϊ�գ����Ա����ᱨ��
        //array = new int[3];
    }

}
