package chapter03;
//��ʵ�����Ѿ���֪����ʹ���˺ܶ����ˣ�����String,����System
/**
 * ���ߣ�����
 * ���ڣ� 2018��12��27�� ����8:20:50
 * ���ı�����1
 */
public class Dog {		//���ȶ���һ���ࣨclass),���������ֽ�ʲô���Լ�ȡ��������dog)
	int furColor ;		//��ζ������������Ժͷ���    //������1�����ɫ��2�����ɫ��
	float height;
	float weight;		//11-13�ж�������ֻ��������
	
	void catchMouse(Mouse m) {		//׽���ӣ��������з���ֵ�ˣ���void  ����catchMouse����Ĳ�����mouse m�������͵�--����
		//as sdkfld fjg 
		//sdlk gg e g dgl    //��������׽��׷��׽����дʲô����дʲô����
		//m.scream();   		//׽����������һ��   //����mouse������ĳһ������
	}
	
	public static void main(String[] args) {			//����������ǹ��������������ս���ϱ��뻹Ҫ��һ����ʵ��ǹ
		//int i;		//δ����ʼ������ֵ��
		//System.out.println(i);
		Dog d = new Dog();		//����һ�����Ķ���,����ֻ��������������˹����࣬��Ҫ���幷�Ķ���
		//d.catchMouse(m);  		//����ֻd�Ĺ���׽����m
		Mouse m = new Mouse();		//Ҫ׽��ֻ���󰡣���Ҫ����֪�������
	}
}

class  Mouse{		//�����Ű������ŵ�����ȥ�����ͱ�����
}

