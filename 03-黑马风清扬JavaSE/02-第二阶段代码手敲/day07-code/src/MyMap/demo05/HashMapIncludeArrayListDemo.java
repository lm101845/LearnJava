package MyMap.demo05;

/**
 * @author ����
 * @date 2021��06��28�� 17:14
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
    ���󣺴���һ��HashMap���ϣ��洢������ֵ��Ԫ�أ�ÿһ����ֵ��Ԫ�صļ���String��ֵ��ArrayList��
         ÿһ��ArrayList��Ԫ����String��������

    ˼·��
        1:����HashMap����
        2:����ArrayList���ϣ������Ԫ��
        3:��ArrayList��ΪԪ����ӵ�HashMap����
        4:����HashMap����

    �������µ�����:
        ��һ��ArrayList���ϵ�Ԫ�أ�(��������)
  		    �����
  		    ����
        �ڶ���ArrayList���ϵ�Ԫ�أ�(���μ�)
  		    ��ɮ
  		    �����
        ������ArrayList���ϵ�Ԫ�أ�(ˮ䰴�)
  		    ����
  		    ³����
*/
public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
		//����HashMap����
		HashMap<String,ArrayList<String>> hm = new HashMap<>();

		//����ArrayList���ϣ������Ԫ��
		ArrayList<String> sgyy = new ArrayList<>();
		sgyy.add("�����");
		sgyy.add("����");
		//��ArrayList��ΪԪ����ӵ�HashMap����
		hm.put("��������",sgyy);

		ArrayList<String> xyj = new ArrayList<String>();
		xyj.add("��ɮ");
		xyj.add("�����");
		//��ArrayList��ΪԪ����ӵ�HashMap����
		hm.put("���μ�",xyj);

		ArrayList<String> shz = new ArrayList<String>();
		shz.add("����");
		shz.add("³����");
		//��ArrayList��ΪԪ����ӵ�HashMap����
		hm.put("ˮ䰴�",shz);

		//����HashMap����
		Set<String> keySet = hm.keySet();
		for(String key:keySet){
			System.out.println(key);
			ArrayList<String> value = hm.get(key);
			for(String s:value){
				System.out.println("\t" + s);
			}
		}
	}
}
