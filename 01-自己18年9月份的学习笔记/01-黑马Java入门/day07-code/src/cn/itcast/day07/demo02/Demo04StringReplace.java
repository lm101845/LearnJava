package cn.itcast.day07.demo02;
/**
 * ���ߣ�����
 * ���ڣ� 2018��11��26�� 
 * ���ı�����1
 * 
 * ���ϣ�����ַ�������ָ���Ĳ��ֽ����滻��������Ҫʹ��
 * 
 * public String replace(CharSequence oldStr, CharSequence newStr):���ַ������г��ֵ�����
 * oldStr���֣��滻��Ϊ����newStr
 * 
 * ����oldStr������Ҫ���滻�����ַ�������
 * ����newStr������Ҫ�滻�����ַ�������
 * ��������charSequence �ֽ׶ο��Լ򵥵���Ϊ�����ַ���String 
 *  */
public class Demo04StringReplace {
	
	public static void main(String[] args) {
		
		String str1 = "How do you do?";
		String str2 = str1.replace("o", "*");    //replace�����ķ���ֵ�����һ��ȫ�µ��ַ���
		System.out.println(str1);	//How do you do? --û�䣡--�ַ��������ݲ��ɷ����ı䣡������������������
		System.out.println(str2);   //H*w d* y*u d*?
		System.out.println("======================================");
		
		String str3 = "�᲻���氡�����ү�����Ƿ��ˣ�";
		String str4 = str3.replace("���ү��", "***");		
		System.out.println(str4);			//�᲻���氡��***���Ƿ��ˣ�
	}

}
