package chapter02;
//���101-200�ڵ�����

public class Zhishu {
	public static void main(String[] args) {
		for (int i =101;i <200; i += 2) {		//ż���϶�������������������2
			boolean f = true;		//�ٶ�f����
			for (int j =2; j < i; j++) {
				if (i % j ==0) {
					f =false;
					break;			//break�ǽ������һ��if��ֹ
				}
			}
			if (!f) {continue;}
			System.out.println("" + i);
		}
	}

}
