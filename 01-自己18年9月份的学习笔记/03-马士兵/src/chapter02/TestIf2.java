package chapter02;
//����1��+2��+3��+......+10��
public class TestIf2 {
	public static void main(String[] args) {
		long result = 0;			//���������Ǿֲ��������ֲ�����result����ջ����
		long f = 1;					//���������Ǿֲ��������ֲ�����f����ջ����
		for (int i = 1; i <= 10; i++) {
			f = f*i;
			result += f;
			
		}
		System.out.println("result=" + result);
	}

}
