/*
���1-100֮���������
*/
public class Demo10WhileSum{
	public static void main(String[] args){
		int sum = 0;
		int i =1;	//1.��ʼ�����
		while (i <= 100){	//2.�����ж�				//while����������ڣ�������
		//ѭ����
			if(i % 2 ==1){	//���������
				sum=sum+i;
			}
			//4.�������
			++i;	
		}
		
		System.out.println("�����ͣ�" + sum);	
	}
}