/*
���ֺ��ַ��Ķ��չ�ϵ��(�����)

ASCII���American Standard Code for Information Interchange,������Ϣ������׼���롣
Unicode�������롣Ҳ�����ֺͷ��ŵĶ��չ�ϵ����ͷ0-127���ֺ�ASCII��ȫһ�£����Ǵ�128��ʼ�����и����ַ���

������������Ҫ��ס3�����չ�ϵ���ɡ�
48 - '0'
65 - 'A'
97 - 'a'
*/
public class Demo05DataTypeChar{
	public static void main(String[] args){
		char zifu1 = '1';
		System.out.println(zifu1 + 0);   //49
		
		char zifu2 = 'A';   //��ʵ�ײ㱣�����65����
		char zifu3 = 'c';
		
		
		//�����int���ͣ��Ҳ���char����
		//char --> int��ȷʵ�Ǵ�С���󣬷������Զ�����ת��
		int num = zifu3;
		System.out.println(num);   //99
		
		char zifu4 = '��';
		System.out.println(zifu4 + 0);  //20013
    }
}