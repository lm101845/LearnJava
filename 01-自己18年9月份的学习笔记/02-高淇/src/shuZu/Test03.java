package shuZu;

/**��������ı���
 * @���� ����
 * @���� 2018��10��29������7:49:34
 * 
 *��ǿforѭ��for-eachѭ����ר�����ڶ�ȡ����򼯺������е�Ԫ�أ�����������б���
 *ע�⣺ֻ�ܶ�ȡ����Ԫ�ص�ֵ�������޸�Ԫ�ص�ֵ
 * 
 */
public class Test03 {

	public static void main(String[] args) {
		
		int[] a = new int[4];
        //��ʼ������Ԫ�ص�ֵ
        for(int i=0;i<a.length;i++){
            a[i] = 100*i;
        }
        //��ȡԪ�ص�ֵ
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("==================================");
        //foreachѭ��:���ڶ�ȡ����Ԫ�ص�ֵ�������޸�Ԫ�ص�ֵ
        for(int   m : a){    //mΪ����   aΪ����    ��Ϊû���±꣬���Բ���ֱ������a���������
        	System.out.println(m);  
        }
        
        String[] ss = { "aa", "bbb", "ccc", "ddd" };
        for (String temp : ss) {
            System.out.println(temp);
        }
        
        
	}
}
