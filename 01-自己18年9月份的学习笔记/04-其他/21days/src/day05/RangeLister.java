package day05;

 /*
 * @���� ����
 * @���� 2018��10��30������3:45:14
 * 
 * this�ؼ��֣���ʱ����������ڷ����������õ�ǰ���󣬼��䷽�������õĶ����Ա㽫��ǰ����ĵ�ʵ��������ǰ������Ϊ����
 * ���ݸ���������
 * 
 * ����this��ָ��ǰʵ�������ã����ֻ����ʵ�������Ķ�������ʹ���������෽�����ùؼ���static�����ķ������У�����ʹ��this
 * 
 * ��
 */
class RangeLister {
	 int[] makeRange(int lower, int upper){
		 int[] range = new int [upper - lower + 1];
		 
		 for (int i = 0; i < range.length; i++) {
			 range[i] = lower++;
		 }
		 return range;
	 }

	 public static void main(String[] args) {
		int[] range;
		RangeLister Lister = new RangeLister();
		
		range = Lister.makeRange(4, 13);
		System.out.print("The array:[");
		for (int i = 0; i < range.length; i++) {
			System.out.print(range[i] + " ");
		}
		System.out.println("]");
	}
}
