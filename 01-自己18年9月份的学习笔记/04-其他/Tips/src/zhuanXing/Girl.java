package zhuanXing;

/**
 * @���� ����
 * @���� 2018��11��7������12:34:35
 * 
 *     ����ת��:������ת���෴�����ǰѸ������תΪ�������
 *     
 *     Girl g1=new MMGirl(); //����ת��
        g1.smile();
       MMGirl mmg=(MMGirl)g1; //����ת��,��������нԲ������

���������ת���ǰ�ȫ�ġ���Ϊg1ָ������������

��
Girl g2=new Girl();
MMGirl mmg1=(MMGirl)g2; //����ȫ������ת��,�����޴������л����

���г���

Exception in thread "main" java.lang.ClassCastException: com.wensefu.other1.Girl
    at com.wensefu.other1.Main.main(Girl.java:36)
�������ʾ������ͨ��instanceof����ֹ�����쳣��
 * 
 * 
 * 
 * 
 */
public class Girl {
	public void smile() {
		System.out.println("girl smile()...");
	}
}

class MMGirl extends Girl {

	@Override
	public void smile() {

		System.out.println("MMirl smile sounds sweet...");
	}

	public void c() {
		System.out.println("MMirl c()...");
	}
}

class Main01 {

	public static void main(String[] args) {

		Girl g1 = new MMGirl(); // ����ת��
		g1.smile();

		MMGirl mmg = (MMGirl) g1; // ����ת��,��������нԲ������
		mmg.smile();
		mmg.c();

		Girl g2 = new Girl();
//      MMGirl mmg1=(MMGirl)g2; //����ȫ������ת��,�����޴������л����  
//      mmg1.smile();  
//      mmg1.c();  
		/*
		 * output: CGirl smile sounds sweet... CGirl smile sounds sweet... CGirl c()...
		 * Exception in thread "main" java.lang.ClassCastException:
		 * com.wensefu.other1.Girl at com.wensefu.other1.Main.main(Girl.java:36)
		 */
		if (g2 instanceof MMGirl) {
			MMGirl mmg1 = (MMGirl) g2;
			mmg1.smile();
			mmg1.c();
		}

	}
}
