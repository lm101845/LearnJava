package mySet.demo04;

/**
 * @author ����
 * @date 2021��06��25�� 13:57
 */

import java.util.LinkedHashSet;

/**
    LinkedHashSet�����ص�
        1:��ϣ�������ʵ�ֵ�Set�ӿڣ����п�Ԥ��ĵ�������
        2:������֤Ԫ������Ҳ����˵Ԫ�صĴ洢��ȡ��˳����һ�µ�
        3:�ɹ�ϣ��֤Ԫ��Ψһ��Ҳ����˵û���ظ���Ԫ��
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //�������϶���
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        //���Ԫ��
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        linkedHashSet.add("world");

        //��������
        for(String s:linkedHashSet){
            System.out.println(s);
        }
    }
}
