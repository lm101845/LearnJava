/*
for��while������

�����ʱ��forѭ����whileѭ�����Ե�Ч�滻�����Ƕ��ߴ��ڼ�������
1.forѭ����ʽ�̶������ƴ��������㣻��whileѭ����ʽ����̫����ѭ�����������Դ���ȷ��ʹ��for�϶ࣻ������ȷ����ʹ��while�϶ࡣ
2.forѭ��С�����ڶ���ı�����ѭ����ʹ�ã�ѭ���ⲻʹ�ã�whileѭ���ĳ�ʼ�����ʽ�����������棬��Ȼ���á�
3.��ת���continue��Ч����ͬ��
*/
public class Demo11ForVsWhile{
	public static void main(String[] args){
		for (int a =1;a <= 5;a++){
			System.out.println(a);
		}
			//����a�Ƕ�����forѭ���ڲ��ģ�������forѭ���ķ�Χ�������޷�ʹ��
			//System.out.println(a);		//����д����
			
			System.out.println("=======================================================================");
			
			int b=1;
			while (b <= 5){
				System.out.println(b);
				b++;	
			}
			
			System.out.println("=======================================================================");
			System.out.println(b);		//��ȷд����
	}
}