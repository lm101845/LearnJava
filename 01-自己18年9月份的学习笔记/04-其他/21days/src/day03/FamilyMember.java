package day03;

 /**
 * @author ����
 *
 * @date 2018��10��29������9:54:21
 */
class FamilyMember {
	 private static String surname;
/*
 * ֮���Խ������������̬(static)��������ȡ��static��һ����˼���̶���ĳ�����������һ��static����������ڸ����ÿһ�����󣨴���
 * ��ÿһ��ʵ�����������ñ�����ֵ����ͬ
 */
	public static void main(String[] args) {
		 final String surname= "��";		//static���У�ֻ����final
/*
* Java Error - Illegal Modifier for Parameter - Only final Permitted
�����ڵľֲ�������������ջ�ڴ��ϣ� 
�ֲ����������� public/private/protected��static �ȴ����Σ�
���ʹ�� final��only final permitted����
ջ�ڴ��ϣ��ֲ���������ν����Ȩ�޵ĸ��Ҳ�������� public/private/protected �����η����κ����ڵľֲ�������
static ���γ�Ա˵����������ʵ���н�����һ�ݣ� 
������Щ�� static ���εĳ�Ա����Ҫ���ʵ������
��Ϊջ�ϵĶ����� temporary ��ʱ�ģ�ջ�϶���Ҳ������ν static ��һ�����ˣ�
---------------------
*/
		String name;
		int age;	
		
		FamilyMember dad = new FamilyMember();
		System.out.println("Family's surname is :" + dad.surname);  //������ʹ�����
		System.out.println("Family's surname is :" + FamilyMember.surname);  //����ʹ�����
		/*
		 * Ҫȡ�û��޸��������ֵ�������ھ������������ʹ��ʵ�����򣨣�����������������д��������ͬ
		 * 
		 * ���飺���������ʱʹ������������������������Ķ�
		 */
	}
	 
	 
}

 