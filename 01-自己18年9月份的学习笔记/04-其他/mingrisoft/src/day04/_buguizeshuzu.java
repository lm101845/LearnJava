package day04;

/**�����Ƕ�������Ҫ��new
 * ��ά���鲻һ���Ǽ��˼��ľ���
 * ��ά�����һ�������ŵ�ֵ����д�����ڶ��������ŵ�ֵ����Ժ���
 * ���ߣ�����
 * ���ڣ� 2018��12��24�� ����7:55:53
 * ���ı�����
 */
public class _buguizeshuzu {
	public static void main(String[] args) {
		int a[][] = new int[3][];	//ֻ���������У�ÿ���ж�����δ����
		
		a[0] = new int[]{2,5,2,4,1};		//Ҫдnew int
		a[1] = new int[] {1,2,3}; 
		a[2] = new int[] {6,7,8,9};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]����"+a[i].length+"��Ԫ�أ��ֱ��ǣ�");
			for(int tmp:a[i]) {			//foreachѭ��
				System.out.println(tmp+" ");
			}
			System.out.println();
		}
		//a.lengthָ�����ж����У�a[0].lengthָ���ǵ�һ���ж��ٸ�Ԫ��
		System.out.println(a.length);		//3
		System.out.println(a[0].length);	//5
		
	}

}
