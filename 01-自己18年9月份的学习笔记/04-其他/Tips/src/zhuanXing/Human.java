package zhuanXing;

/**
 * @���� ����
 * @���� 2018��11��7������12:29:32
 * 
 * ����ת�͵ĺô���

������Ĵ��룬

    public static void dosleep(Human h) {
        h.sleep();
    }

�����Ը���Ϊ����������ʱ��������Ϊ��������������������ת�͡�����ʹ�����ü�ࡣ��Ȼ�Ļ���
���dosleep���������Ϊ���������ж��ٸ��������Ҫд���ٸ���������Ҳ������JAVA�ĳ�����˼�롣
 */
public class Human {
	public void sleep() {
		System.out.println("Human sleep..");
	}
}

class Male extends Human {
	@Override
	public void sleep() {
		System.out.println("Male sleep..");
	}
}

class Female extends Human {
	@Override
	public void sleep() {
		System.out.println("Female sleep..");
	}
}
