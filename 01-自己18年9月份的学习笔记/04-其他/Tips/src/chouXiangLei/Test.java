package chouXiangLei;

/**
 * @���� ����
 * @���� 2018��11��5������9:52:37
 * 
 * ������ı�Ҫ�ԣ�
 * �������һЩ��������ȷ��ʱ��������abstract�ؼ��������θ÷���������˳��󷽷���
 * 
 * �����಻�ܱ�ʵ����
 * ���󷽷�����������
 */
public class Test {
	
	public static void main(String[] args) {
		
	}

}
//������--��Ȼ���Ա��̳�
abstract class Animal{
	String name;
	int age;
	
	//������
	abstract public void cry();			
		//System.out.println("��֪����ô��");				������෽�����̳к�Ͳ����ܱ��õ���
	
}

//��һ����̳еĸ����ǳ�����Ļ�����Ҫ���ǰѳ������е����г��󷽷�ȫ��ʵ��
class Cat extends Animal{
	//ʵ�ָ����cry
	public void cry() {
		
		// ʲô��û�ɣ�Ҳ��ʵ��
		
	}
}
