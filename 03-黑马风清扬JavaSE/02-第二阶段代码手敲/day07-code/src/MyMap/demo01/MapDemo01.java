package MyMap.demo01;

/**
 * @author ����
 * @date 2021��06��28�� 14:32
 */

import java.util.HashMap;
import java.util.Map;

/**
    Map���ϸ���
        Interface Map<K,V>	K���������ͣ�V��ֵ������
        ����ӳ�䵽ֵ�Ķ��󣻲��ܰ����ظ��ļ���ÿ��������ӳ�䵽���һ��ֵ
        ������ѧ����ѧ�ź�����
              itheima001	����ϼ
              itheima002	������
              itheima003	������

    ����Map���ϵĶ���
        ��̬�ķ�ʽ
        �����ʵ����HashMap
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //�������϶���
        Map<String,String> map = new HashMap<>();

        //V put(K key, V value) ��ָ����ֵ���ӳ���е�ָ���������
        map.put("01","����ϼ");
        map.put("02","������");
        map.put("03","������");

        map.put("03","���� ");
        //��������ظ���ʱ�����Ǿͻ����ǰ��ֵ�������
        //���������һ�γ��֣����������Ԫ�أ���������ڶ��γ��֣��������޸�Ԫ���ˡ����������ֵ��ǰ�����ֵ���������

        //������϶���
        System.out.println(map);
    }

}
