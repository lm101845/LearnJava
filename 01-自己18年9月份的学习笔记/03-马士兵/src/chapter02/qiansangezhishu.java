package chapter02;
//��1-100��ǰ5�����Ա�����������
public class qiansangezhishu {
	public static void main(String[] args) {
		int num = 0,i =1;	//n�Ǽ�����
		while (i <= 100){
			if (i % 3 ==0)
				System.out.println(i + "");
			num++;
			
		if (num == 5) {
			break;
		}
		
		i++;
		}
	}

}
