package MyMap.demo02;

/**
 * @author ����
 * @date 2021��06��28�� 14:54
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    Map���ϵı���(��ʽ1):
        1:��ȡ���м��ļ��ϡ���keySet()����ʵ��
        2:�������ļ��ϣ���ȡ��ÿһ����������ǿforʵ��
        3:���ݼ�ȥ��ֵ����get(Object key)����ʵ��
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //�������϶���
        Map<String,String> map = new HashMap<>();

        //���Ԫ��
        map.put("���޼�", "����");
        map.put("����", "����");
        map.put("���", "С��Ů");

        //��ȡ���м��ļ��ϡ���keySet()����ʵ��
        Set<String> keySet = map.keySet();

        //�������ļ��ϣ���ȡ��ÿһ����������ǿforʵ��
        for(String key:keySet){
            //���ݼ�ȥ��ֵ����get(Object key)����ʵ��
            String value = map.get(key);
            //��ݼ���ctrl + alt + v ���������������
            System.out.println(key + "," + value);
        }
    }
}
