package mySet.demo03;

/**
 * @author ����
 * @date 2021��06��25�� 13:19
 */

import java.util.HashSet;

/**
    HashSet�����ص�
        1:�ײ����ݽṹ�ǹ�ϣ��
        2:�Լ��ϵĵ���˳�����κα�֤��Ҳ����˵����֤�洢��ȡ����Ԫ��˳��һ��
        3:û�д������ķ��������Բ���ʹ����ͨforѭ������
        4:������Set���ϣ������ǲ������ظ�Ԫ�صļ���
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        //�������϶���
        HashSet<String> hs = new HashSet<>();

        //���Ԫ��
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");
        //����
        for(String s:hs){
            System.out.println(s);
        }
    }
}
