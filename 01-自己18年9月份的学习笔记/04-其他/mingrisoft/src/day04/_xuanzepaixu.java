package day04;

/**ѡ������Ҳ����
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����9:40:55
 * ���ı�����
 */
public class _xuanzepaixu {
	public static void main(String[] args) {
		int a[] = {99,4,41,1,7,25};
		
		int index;		//���浱ǰ����Ԫ�����ڵ�λ��
		for(int i=1;i<a.length;i++) {		//ѭ���Ĵ������ñ�Ԫ�ظ�����һ��
			index = 0;
			for(int j=1;j<=a.length-i;j++) {		//<=  !!!!
				if(a[index]<a[j]) {
					index = j;
				}
			}
			int tmp = a[a.length-i];
			a[a.length-i]=a[index];
			a[index]=tmp;
		}
		System.out.println("ѡ������Ľ����");
		for(int tmp:a) {
			System.out.print(tmp+" ");
		}
	}

}
