package day08.demo02;

/**
 * @author ����
 * @date 2021��06��04�� 17:01
 */

/**
 * ��Ŀ��
 * ����һ��������������{1,2,3}����ָ����ʽƴ�ӳ�һ���ַ�������ʽ�������£�[word1#word2#word3]��
 * <p>
 * ������
 * 1. ����׼��һ��int[]���飬�����ǣ�1��2��3
 * 2. ����һ���������������������ַ���
 * ��Ҫ��
 * ����ֵ���ͣ�String
 * �������ƣ�fromArrayToString
 * �����б�int[]
 * 3. ��ʽ��[word1#word2#word3]
 * �õ���forѭ�����ַ���ƴ�ӡ�ÿ������Ԫ��֮ǰ����һ��word�������ָ�ʹ�õ���#������һ���ǲ������һ��
 * 4. ���÷������õ�����ֵ������ӡ����ַ���
 */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
