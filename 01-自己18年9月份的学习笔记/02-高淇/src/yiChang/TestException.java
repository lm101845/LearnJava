package yiChang;

import java.util.Scanner;

/**
 * @���� ����
 * @���� 2018��11��6������9:44:45
 * 
 * java�쳣��java�ṩ�����ڴ�������д����һ�ֻ���
 * 
 * java�ǲ����������ķ�ʽ�������쳣�ġ�������̣�
 * 
 * �׳��쳣����ִ��һ������ʱ����������쳣��������������ɴ�����쳣��һ������ֹͣ��ǰִ��·����
 * �����쳣�����ύ��JRE��
 * 
 * �����쳣��JRE�õ����쳣��Ѱ����Ӧ�Ĵ�����������쳣��JRE�ڷ����ĵ���ջ�в��ң��������쳣�ķ���
 * ��ʼ���ݡ�ֱ���ҵ���Ӧ���쳣�������Ϊֹ��
 * 
 * �����쳣������������Throwable���һ��ʵ����������õ��쳣�಻��������Ҫ�������Դ����Լ����쳣��
 * 
 * try:
 * try���ָ����һ�δ��룬�öδ������һ�β�׽������ķ�Χ����ִ�й����У�������һ���������쳣ʱ��
 * �ͻ������ö��к���Ĵ��롣�����п��ܻ�������׳�һ�ֻ������͵��쳣�����������catch���Ҫ�ֱ�
 * ����Щ�쳣����Ӧ�Ĵ���
 * 
 * һ��try���������ٴ���һ��catch����  ��  һ��finally����(��������Ҫ����һ��
 * 
 * ע�����쳣����Ĵ���ִ�н����Ժ��ǲ���ص�try���ȥִ����δִ�еĴ���
 * 
 * 
 * finally:
 * ��Щ��䣬�����Ƿ������쳣��������Ҫִ�У���ô�Ϳ��԰����������ŵ�finally������
 * ͨ����finally�йرճ�����Ѵ򿪵���Դ������:�ļ������ͷ����ݿ����ӵ�
 * 
 */
public class TestException {
	public static void main(String[] args) {
		/*int i = 1/0;    //����unchecked exception,������û�м�飬ֱ�ӹ�--��������������쳣̫ƽ��
		//������ʽ��ǰ��·���ˣ���Ҫ����ʹ�ֲ���дӦ����ô�죻���Ǳ�������������ҵ�û�б�Ҫд
		
		try {
			Thread.sleep(3000);		//������ͣ3����     ����checked exception(�ѱ�������������ex)
		} catch (InterruptedException e) {
			e.printStackTrace();    ��ӡ��ջ�켣
		} finally{
		System.out.println("aaa");    
		}*/   
		
		/*Computer c = null;    //�������ջ�����У�����û��ֵ
		if(c!=null) {  //������ָ�룬ͨ��ǰ��Ӹ��ж�
		c.start();			//java.lang.NullPointerException   �����ǿյģ������˶���ķ���������
		}*/
		
		/*Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println(a);
		*/
		String str = "1234abcd";
		Integer i = new Integer(str);    //java.lang.NumberFormatException
		System.out.println(i);
	}

}

class Computer{
	void start() {
		System.out.println("�����������");
	}
}
