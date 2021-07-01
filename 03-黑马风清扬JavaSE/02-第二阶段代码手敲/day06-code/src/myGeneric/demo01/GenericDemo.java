package myGeneric.demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ����
 * @date 2021��06��25�� 17:03
 */

/**
    ����Collection���ϴ洢�ַ���������

 Java�������ԭ��ֻҪ�ڱ���ʱ��û�г��־��棬��ô����ʱ�ھͲ������ClassCastException�쳣.

 ���ͣ���������ȷ�Ĺ����Ƴٵ������������÷�����ʱ���ȥ��ȷ�����������

 ����Java��ʹ��Object�������������͵ģ���������ת����ǿת�����⣬��������Ͳ�̫��ȫ
 https://www.zhihu.com/question/272185241
 */
public class GenericDemo {
    public static void main(String[] args) {
        //�������϶���

        //д��1����ʹ�÷���
        //Collection c = new ArrayList();

        //д��2��ʹ�÷���
        Collection<String> c = new ArrayList<String>();

        //���Ԫ��
        c.add("hello");
        c.add("world");
        c.add("java");
        //c.add(100);
        //���100���Զ���װΪInteger����
        //��������ᱨ��ת����������
        //java.base/java.lang.Integer cannot be cast to java.base/java.lang.String

        //���ʹ�÷��͵Ļ��������̾ͱ�����
        //���������԰������ڲų��ֵ����⣬��������������ͱ���Ҫ���д�����
        //����Ƿ��͵ĵ�һ���ô������ǰ��������ǰ��¶��

        //��������������
        //Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            //Object obj = it.next();
            //System.out.println(obj);

            //String s = (String)it.next();
            //�Ҷ�˵���ҵ�����������String���ͣ���Ͳ���Ҫ��ǿ������ת����
            String s = it.next();
            System.out.println(s);
        }
    }
}
