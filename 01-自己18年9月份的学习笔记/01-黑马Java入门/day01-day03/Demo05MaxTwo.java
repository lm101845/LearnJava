
import java.util.Scanner;
/*
��Ŀ��������������int���֣�����������е����ֵ

˼·��
1.��Ȼ�Ǽ������룬��ô�϶�����Scanner(�������裩
2.��Ҫ�������֣�����ʹ������nextInt,���ǵ����ʹ���û�б�Ҫ�ظ�
3.����м��֣�
���a>b,��ô���ս������a;���򣨰�����a<b��a=b���������ȡ��b
������a��b�������ֵ���ȡ��һ��������ѡ��һ������׼��if-else���

*/

public class Demo05MaxTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		
		if(a>b){		//a����b,ȡ��a
			System.out.println("���ֵ��"+a);
		}else{			//����ȡ��b
			System.out.println("���ֵ��"+b);	
		}
			
	
	}
	
}