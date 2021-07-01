package MyMap.demo01;

/**
 * @author ����
 * @date 2021��06��28�� 14:47
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    Map���ϵĻ�ȡ���ܣ�
        V get(Object key):���ݼ���ȡֵ
        Set<K> keySet():��ȡ���м��ļ���
        Collection<V> values():��ȡ����ֵ�ļ���
 */
public class MapDemo03 {
    public static void main(String[] args) {
        //�������϶���
        Map<String, String> map = new HashMap<String, String>();

        //���Ԫ��
        map.put("���޼�", "����");
        map.put("����", "����");
        map.put("���", "С��Ů");

        //V get(Object key):���ݼ���ȡֵ
        //System.out.println(map.get("���޼�"));  //����
        //System.out.println(map.get("������"));  //null

        //Set<K> keySet():��ȡ���м��ļ���
        Set<String> keySet = map.keySet();
        for(String key:keySet){
            System.out.println(key);
            //���
            //����
            //���޼�
        }

        //Collection<V> values():��ȡ����ֵ�ļ���
        Collection<String> values = map.values();
        for(String value:values){
            System.out.println(value);
            //С��Ů
            //����
            //����
        }
    }
}
