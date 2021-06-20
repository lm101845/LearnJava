package changYongLei;

import java.util.Date;

/** ����Date����÷�
 * @���� ����
 * @���� 2018��11��6������4:00:59
 * 
 * java��ʱ��ı�ʾ˵����Ҳ�����֣��Ǵӣ���׼��Ԫ1970.1.1 0�㿪ʼ��ĳ����������������long
 * 
 * ������������ж�����������
 * 
 * 
 */
public class TestDate {
	public static void main(String[] args) {
		
		Date d = new Date();
		long t = System.currentTimeMillis();	//��1970.1.1 0�㵽���ڹ��˶��ٺ���	
	    /**
	     * Allocates a {@code Date} object and initializes it to
	     * represent the specified number of milliseconds since the
	     * standard base time known as "the epoch", namely January 1,
	     * 1970, 00:00:00 GMT.
	     *
	     * @param   date   the milliseconds since January 1, 1970, 00:00:00 GMT.
	     * @see     java.lang.System#currentTimeMillis()
	     */
		System.out.println(t);
		Date d2 = new Date(1000);
		
		System.out.println(d2.toGMTString());   //������ʹ��   1 Jan 1970 00:00:01 GMT  1000������1��
		d2.setTime(24324324);
		System.out.println(d2.getTime());
		System.out.println(d.getTime()<d2.getTime());
			
		
	}
}
