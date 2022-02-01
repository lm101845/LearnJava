package myThread.demo10;

/**
 * @Author ����
 * @Date 2022/2/1  16:29
 **/

import java.util.*;

/**
 * �̰߳�ȫ���ࡾ��⡿
 * StringBuffer
 * �̰߳�ȫ���ɱ���ַ�����
 * �Ӱ汾 JDK 5��ʼ����StringBuilder ����� ͨ��Ӧ��ʹ��StringBuilder�࣬��Ϊ��֧��������ͬ�Ĳ�
 * �����������죬��Ϊ����ִ��ͬ��
 * Vector
 * �� Java 2ƽ̨v1.2��ʼ������Ľ���List�ӿڣ�ʹ���ΪJava Collections Framework�ĳ�Ա�� ���µļ�
 * ��ʵ�ֲ�ͬ�� Vector��ͬ���� �������Ҫ�̰߳�ȫ��ʵ�֣�����ʹ��ArrayList����Vector
 * Hashtable
 * ����ʵ����һ����ϣ��������ӳ�䵽ֵ�� �κη�null���󶼿�������������ֵ
 * �� Java 2ƽ̨v1.2��ʼ����������˸Ľ���ʵ����Map�ӿڣ�ʹ���ΪJava Collections Framework�ĳ�
 * Ա�� ���µļ���ʵ�ֲ�ͬ�� Hashtable��ͬ���� �������Ҫ�̰߳�ȫ��ʵ�֣�����ʹ��HashMap����
 * Hashtable
 * */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<>();
        ArrayList<String> arr = new ArrayList<>();

        Hashtable<String,String> ht = new Hashtable<>();
        HashMap<String,String> hs = new HashMap<>();

        List<String> list = Collections.synchronizedList(new ArrayList<>());
        //ArrayList�����ǲ���ȫ�ģ�����Collections.synchronizedList�ͱ�ɰ�ȫ���ˡ�
    }
}
