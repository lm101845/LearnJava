package changYongLei;

/**
 * @���� ����
 * @���� 2018��11��6������2:49:38
 * 
 *     Ϊʲô��Ҫ��װ�ࣿ
 *     Java�����Ǵ������������ԣ�java������һ�������������ԣ�����java�еĻ�����������ȴ�ǲ��������ģ�����������ʵ��ʹ��
 *     �о�����Ҫ����������ת���ɶ��󣬱��ڲ��������磺���ϵĲ����С���ʱ�����Ǿ���Ҫ��������������ת���ɶ���
 * 
 *     ��װ�ࣨwrapper class)��λ��java.lang���У�ϵͳ���Զ����룩
 * 
 * 
 *     intValue()�ǰ�Integer�������ͱ��int�Ļ����������ͣ�
 * 
 *     parseInt()�ǰ�String ���int�Ļ����������ͣ�
 * 
 *     Valueof()�ǰѸ�����String����ת����Integer�������ͣ�������JDK�汾֧���Զ�װ������ˡ���
 *     intValue()�÷�������������ͬ������int i = new Integer("123"), j = i.intValue();
 *            �൱��ǿ������ת����ǿ������ת����ʵ�Ͼ��ǵ��õ������������  ���������÷��� Integer.Valueof() ��
 *      Integer.parseInt() �õ���Interger������i.intValue()�õ��Ƕ���i
 *    
 *     ���⣬ Integer a=new Integer(1)
 * 
 *     Integer a=Integer.valueOf(1);
 * 
 *     �������ǵõ�һ��Integer���󣬵���Integer.valueOf��Ч�ʸߡ�
 * 
 */
public class BaoZhuangLei {

	public static void main(String[] args) {
		Integer i = new Integer(1000);

		System.out.println(Integer.MAX_VALUE); // ��Integer������21�ڶ�

		System.out.println(Integer.toHexString(i)); // �ѱ���ת��16���Ƶ�
		Integer i2 = Integer.parseInt("234"); // ���ַ���ת������
		// Integer i2 = Integer.parseInt("2��4"); //��������

		Integer i3 = new Integer("333"); // ֱ��newҲ�У�Ҳ���԰�һ���ַ���ת������
		System.out.println(i3);

		System.out.println(i2.intValue());
		
		String str = 235 + "";
		System.out.println(str);   //����ת�ַ���

	}
}
