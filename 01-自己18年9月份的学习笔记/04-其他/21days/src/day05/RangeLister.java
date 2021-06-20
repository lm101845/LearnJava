package day05;

 /*
 * @姓名 李明
 * @日期 2018年10月30日下午3:45:14
 * 
 * this关键字：有时候，你可能想在方法体中引用当前对象，即其方法被调用的对象，以便将当前对象的的实例变量或当前对象作为参数
 * 传递给其他方法
 * 
 * 由于this是指向当前实例的引用，因此只能在实例方法的定义体内使用它。在类方法（用关键字static声明的方法）中，不能使用this
 * 
 * 或
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
