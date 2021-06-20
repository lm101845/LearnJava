package day03;

 /**
 * @author 李明
 *
 * @date 2018年10月29日上午9:54:21
 */
class FamilyMember {
	 private static String surname;
/*
 * 之所以将类变量叫做静态(static)变量，是取了static的一种意思：固定在某处。如果类有一个static变量，则对于该类的每一个对象（创建
 * 的每一个实例！！！）该变量的值都相同
 */
	public static void main(String[] args) {
		 final String surname= "李";		//static不行，只能用final
/*
* Java Error - Illegal Modifier for Parameter - Only final Permitted
函数内的局部变量仅存在于栈内存上； 
局部变量不可用 public/private/protected、static 等词修饰；
最多使用 final（only final permitted）；
栈内存上（局部对象）无所谓访问权限的概念；也即不可用 public/private/protected 等修饰符修饰函数内的局部变量；
static 修饰成员说明，所有类实例中仅存在一份； 
创建这些被 static 修饰的成员不需要类的实例化；
因为栈上的对象都是 temporary 临时的，栈上对象也就无所谓 static 这一含义了；
---------------------
*/
		String name;
		int age;	
		
		FamilyMember dad = new FamilyMember();
		System.out.println("Family's surname is :" + dad.surname);  //不建议使用这个
		System.out.println("Family's surname is :" + FamilyMember.surname);  //建议使用这个
		/*
		 * 要取得或修改类变量的值，可以在句点运算符的左边使用实例名或（！）类名。上面的两行代码输出相同
		 * 
		 * 建议：引用类变量时使用类名，这样，代码更容易阅读
		 */
	}
	 
	 
}

 