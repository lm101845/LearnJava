import java.util.Scanner;		//1.����
/*
1.����:import java.util.Scanner;

2.����:Scanner sc = new Scanner(System.in);

3.ʹ��:Srring str = sc.next();

*/
public class Demo12ScannerString{
	public static void main(String[] args){
		
		//2.����
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("�������һ���ַ���:" );
		//3.ʹ�ã���ȡ���������int����
		String str1 = sc.nextInt();		//��һ������
		System.out.println("�ַ���1:" + strl);	
		
		System.out.println("������ڶ����ַ���:" );
		String str2 = sc.next();		//�ڶ�������
		System.out.println("�ַ���2:" + str2);	
	}
}