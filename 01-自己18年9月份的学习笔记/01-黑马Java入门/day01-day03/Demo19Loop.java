/*
ѭ��Ƕ���е���ת���

1.break��continueֻ�������ڵ�ǰ������ѭ����
2.���ϣ��д���ڲ㣬�������������ѭ�����Ǹ���ô�죿

for(...){	//���ѭ��
	for(...)	//�ڲ�ѭ��
				
		break  ��ǩ���ƣ�
	}
}
	
	
1.break��continue
*/
public class Demo19Loop{
	public static void main(String[] args){
		int count=0;
		
		label:for(int i=1;i <=10;i++){		//���ѭ��10��
		
			//if(i ==3){
				//continue;
			//}
		
			for(int j=1;j <=5;j++){	//�ڲ�ѭ��5��
				//if (j ==3){
					//continue;
				//}
				if(j ==3){
					break label;		//��������棬����Ҳ����
				}
				count++;
				
			}	
		}
		
		System.out.println("�ܴ�����" + count);	
	}
}
		
		
	