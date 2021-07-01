package MyMap.demo06;

/**
 * @author ����
 * @date 2021��06��28�� 22:18
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
    ����
        ����¼��һ���ַ�����Ҫ��ͳ���ַ�����ÿ���ַ������ֵĴ�����
        ����������¼�롰aababcabcdabcde��	�ڿ���̨�������a(5)b(4)c(3)d(2)e(1)��

    ˼·��
        1:����¼��һ���ַ���
        2:����HashMap���ϣ�����Character��ֵ��Integer
        3:�����ַ������õ�ÿһ���ַ�
        4:�õõ���ÿһ���ַ���Ϊ����HashMap������ȥ�Ҷ�Ӧ��ֵ�����䷵��ֵ
            �������ֵ��null��˵�����ַ���HashMap�����в����ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
            �������ֵ����null��˵�����ַ���HashMap�����д��ڣ��Ѹ�ֵ��1��Ȼ�����´洢���ַ��Ͷ�Ӧ��ֵ
        5:����HashMap���ϣ��õ�����ֵ������Ҫ�����ƴ��
        6:������
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //����¼��һ���ַ���
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String line = sc.nextLine();

        //����HashMap���ϣ�����Character��ֵ��Integer
        //HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        //HashMap<Character,Integer> hm = new HashMap<>();
        TreeMap<Character, Integer> hm = new TreeMap<Character, Integer>();

        //�����ַ������õ�ÿһ���ַ�
        for(int i =- 0; i < line.length();i++){
            char key = line.charAt(i);

            //�õõ���ÿһ���ַ���Ϊ����HashMap������ȥ�Ҷ�Ӧ��ֵ�����䷵��ֵ
            Integer value = hm.get(key);
            if(value == null){
                //�������ֵ��null��˵�����ַ���HashMap�����в����ڣ��ͰѸ��ַ���Ϊ����1��Ϊֵ�洢
                hm.put(key,1);
            }else{
                //�������ֵ����null��˵�����ַ���HashMap�����д��ڣ��Ѹ�ֵ��1��Ȼ�����´洢���ַ��Ͷ�Ӧ��ֵ
                value++;
                hm.put(key,value);
            }
        }

        //����HashMap���ϣ��õ�����ֵ������Ҫ�����ƴ��
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for(Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result = sb.toString();

        //������
        System.out.println(result);
    }
}
