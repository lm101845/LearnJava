//continue���Ļ���ʹ�ã�ֻ��������ǰѭ����ʣ�����ݣ����Ͽ�ʼ��һ��ѭ��
//break��������嶼�����ˣ���continue��������ǰ��һ�Σ�����ļ���
public class Demo13Continue{
	public static void main(String[] args){
		for(int i =1;i <=10;++i){
			
			//�����ǰ�ǵ�4¥����ô���������Ͽ�ʼ�����5¥
			if(i==4){
				
				continue;	//���д���һ��ִ�У���ôѭ������ʣ�����ݽ������������Ͽ�ʼ��һ��ѭ��
			}
			System.out.println(i+"¥����");
		}
		
	}
}