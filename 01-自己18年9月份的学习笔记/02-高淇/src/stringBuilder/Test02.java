package stringBuilder;

/**
 * @���� ����
 * @���� 2018��11��5������9:08:46
 * 
 * ����StringBuilder��һЩ���÷��� 
 */
public class Test02 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");		
		sb.delete(3, 5);   //ɾ��������ʱ���ǰ�ͷ����β
		sb.delete(3, 5).delete(3, 5);
		System.out.println(sb);
		
		sb.reverse();  //���Ŷ�ȡ
		System.out.println(sb);
		
		
		
	}

}
