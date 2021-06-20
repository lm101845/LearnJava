package collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @���� ����
 * @���� 2018��11��7������6:44:58
 * 
 * Collection�ӿڣ������˴�ȡһ�����ķ��������ӽӿ�Set��List�ֱ����˴洢��ʽ
 * -Set�е����ݶ���û��˳���Ҳ������ظ�
 * -List�е����ݶ�����˳���ҿ����ظ�
 * -Map�ӿڶ����˴洢"��(key)-ֵ(value)ӳ���"�ķ���	
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		
		List list1 = new ArrayList();  //ArrayList��List������    �ұ���ʵ���࣬����ǽӿ�
		//ArrayList:�ײ�ʵ�������顣��ѯ�죻�޸ġ����롢ɾ������
		//LinkedList���ײ�ʵ����������ѯ�����޸ġ����롢ɾ���졣
		//Vector(���������̰߳�ȫ�ģ�Ч�ʵ͡���ǰ�������̲߳���ȫ��Ч�ʸߣ�
		
		list1.add("aaa");
		list1.add("aaa");
		list1.add(new Date());
		list1.add(new Dog());
		list1.add(1234);    //��װ��ģ��Զ�װ�䣡
		list1.remove(new String("aaa"));
		System.out.println(list1.size());     //4   ����4������
		for(int i = 0; i< list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		list1.set(3,new String("3333"));
		list1.add(4,new String("3333"));
		System.out.println(list1.isEmpty());  //false
		
		list1.remove("aaa");
		list1.remove(new Date());		//hashcode��equals
		System.out.println(list1.size());     //3   �Ƴ���1�������ַ�����������ͬһ������
		
		
		List list2 = new ArrayList();
		list2.add("bbb");
		list2.add("ccc");
		list1.add(list2);
		System.out.println(list1.size());     //4   4ָ��������  
		
		//��˳��Ĳ���
		list1.get(0);
		//String str = (String) list1.get(0);
		//System.out.println(str);
		list1.set(1,"ababa");
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		
 	}

}

class Dog{
	
}