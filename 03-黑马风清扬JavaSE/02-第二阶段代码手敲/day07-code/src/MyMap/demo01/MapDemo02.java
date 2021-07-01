package MyMap.demo01;

/**
 * @author ����
 * @date 2021��06��28�� 14:41
 */

import java.util.HashMap;
import java.util.Map;

/**
    Map���ϵĻ������ܣ�
        V put(K key,V value)�����Ԫ��
        V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ��
        void clear()���Ƴ����еļ�ֵ��Ԫ��
        boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
        boolean containsValue(Object value)���жϼ����Ƿ����ָ����ֵ(��ѧ)
        boolean isEmpty()���жϼ����Ƿ�Ϊ��
        int size()�����ϵĳ��ȣ�Ҳ���Ǽ����м�ֵ�Եĸ���
 */
public class MapDemo02 {
    public static void main(String[] args) {
        //�������϶���
        Map<String,String> map = new HashMap<>();

        //���Ԫ��
        map.put("���޼�","����");
        map.put("����","����");
        map.put("���","С��Ů");


        //V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ��
        //System.out.println(map.remove("����"));  //����
        //System.out.println(map.remove("����"));  //null

        //void clear()���Ƴ����еļ�ֵ��Ԫ��
        //map.clear();


        //boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
        //System.out.println(map.containsKey("����"));
        //System.out.println(map.containsKey("����"));

        //boolean isEmpty()���жϼ����Ƿ�Ϊ��
        System.out.println(map.isEmpty());

        //int size()�����ϵĳ��ȣ�Ҳ���Ǽ����м�ֵ�Եĸ���
        System.out.println(map.size());

        //������϶���
        System.out.println(map);
    }
}
