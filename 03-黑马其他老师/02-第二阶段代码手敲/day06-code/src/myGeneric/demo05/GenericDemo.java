package myGeneric.demo05;

/**
 * @author ����
 * @date 2021��06��25�� 22:19
 */

import java.util.ArrayList;
import java.util.List;

/**
    ����ͨ�����<?>
        List<?>����ʾԪ������δ֪��List������Ԫ�ؿ���ƥ���κε�����
        ���ִ�ͨ�����List����ʾ���Ǹ��ַ���List�ĸ��࣬�����ܰ�Ԫ����ӵ�����

    ����ͨ������ޣ�<? extends ����>
        List<? extends Number>������ʾ��������Number������������

    ����ͨ������ޣ�<? super ����>
        List<? super Number>������ʾ��������Number�����丸����
 */
public class GenericDemo {
    public static void main(String[] args) {
        //����ͨ�����<?>
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("--------");

        //����ͨ������ޣ�<? extends ����>
        //List<?extends Number> list4 = new ArrayList<>(Object);
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();
        System.out.println("--------");

        //����ͨ������ޣ�<? super ����>
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
        //List<? super Number> list9 = new ArrayList<Integer>();
    }
}
