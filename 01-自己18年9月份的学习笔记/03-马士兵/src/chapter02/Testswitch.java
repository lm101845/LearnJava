package chapter02;
//ע�����
//1.С��case��͸���Ƽ�ʹ��break���
//2.���case���Ժϲ���һ��
//3.default����ʡ�ԣ������Ƽ�ʡ��
//4.switch
//5.java��switch���ֻ��̽��int����ֵ
public class Testswitch {
	public static void main(String[] args) {
		int i =18;			//��java���棬switchֻ��̽��int���͵�ֵ
		switch(i){
		
		case 8:			//ע�⣺��ð�Ų��ǷֺŰ�������
		System.out.println("8");
		break;			//����ÿ�κ����һ��break,�������ᴩ������ȥ
		
		case 3:
		System.out.println("3");
		break;
		
		case 2:
		System.out.println("2");
		break;
		
		case 9:
		System.out.println("9");
		break;
		
		default:
		System.out.println("error");
		
		}
	}

}
