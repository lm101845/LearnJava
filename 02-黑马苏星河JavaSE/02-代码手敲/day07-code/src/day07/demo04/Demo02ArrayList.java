package day07.demo04;

/**
 * @author ����
 * @date 2021��06��03�� 20:53
 */

import java.util.ArrayList;

/**
����ĳ��Ȳ����Է����ı䡣
����ArrayList���ϵĳ����ǿ�������仯�ġ�

����ArrayList��˵����һ��������<E>�����͡�
���ͣ�Ҳ����װ�ڼ��ϵ��е�����Ԫ�أ�ȫ����ͳһ��ʲô���͡�
ע�⣺������ֻ�����������ͣ������ǻ������͡���

ע�����
����ArrayList������˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ���������ݡ�
��������ǿգ��õ����ǿյ������ţ�[]
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // ������һ��ArrayList���ϣ����ϵ�������list������װ��ȫ����String�ַ������͵�����
        // ��ע����JDK 1.7+��ʼ���Ҳ�ļ������ڲ����Բ�д���ݣ�����<>������Ҫд�ġ�
        //������ߵ�<>��������ݱ���Ҫд����д�ᱨ������
        System.out.println(list);

        //�򼯺ϵ������һЩ���ݣ���Ҫ�õ�add����
        list.add("����ӱ");
        System.out.println(list);

        list.add("�����Ȱ�");
        System.out.println(list);

        list.add("��������");
        System.out.println(list);

        //list.add(100);
        //����д������Ϊ������ʱ������ŷ����Ѿ�˵�����ַ�������ӽ�ȥ��Ԫ�ؾͱ��붼���ַ�������
    }
}
