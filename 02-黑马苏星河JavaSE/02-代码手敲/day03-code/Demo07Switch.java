public class Demo07Switch {
	public static void main(String[] args) {
		int num = 10;
		
		switch (num) {
			//numΪ���ʽ
			//case�ұ���һ������ֵ
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
			//default������else��������β
			//default�����һ��ð�ţ�����д��ֵ��
				System.out.println("���ݲ�����");
				break; // ���һ��break������ʡ�ԣ�����ǿ���Ƽ���Ҫʡ��
		}
	}
}