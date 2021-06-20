package cn.itcast.day06.demo01;

import java.util.Arrays;

/**
 *@李明
 *@日期 2018年11月26日 
 *看的遍数：1+1
 *
 * 面向过程:
 * 当需要实现一个功能的时候,所有的步骤都要亲力亲为,处理每一个代码细节.
 * 
 * 马士兵：
 * 面向对象要考虑三步：
 * 1.考虑这个问题域里面有哪些类和对象（类：猫  对象：这只猫）
 * 2.这些类和对象有哪些属性和方法（属性=成员变量，静态属性，白猫； 方法：动态属性，捉老鼠）
 * 3.类和类之间有什么关系（关联关系、继承关系、聚合关系、实现关系、多态）
 * 
 * 对象和类是分不开的，必须首先定义类才有对象 （你脑子里没有瓶子的概念，那个桌子上的东西（瓶子）叫什么你也不知道
 * （类似于必须首先定义方法你才能调用）
 * 
 * 对象时java程序的核心，在java程序中"万事万物皆对象"。你必须要先造个对象出来你才能动
 * 
 * 对象可以看成是静态属性（成员变量）和动态属性（方法）的封装体--------重点！！！！
 * 怎么抽象概念：你必须抽象出两个方面。一个是它的静态属性，一个是它的动态属性
 * 
 * 类是用来创建同一类型的对象的"模板",在一个类中定义了该类对象所应具有的成员变量以及方法（类是父母，类里面的不同对象是
 * 它们的孩子，它们具有共同的特点，不是一家人，不进一家门）
 * 
 * J2SDK提供了很多类供编程人员使用，编程人员也可定义自己的类
 * 
 * 我们的语言：  
 * 成员变量 = 属性
 * 方法 = 函数
 * 
 * 每一个java里面的class都定义了每一个现实事物中的一个抽象
 * 
 * 如何在内存中区分类和对象？
 * 1.类是静态的概念，位于代码区
 * 2.对象是new出来的，位于堆内存（因为堆内存是用于动态分配内存的，只有你在运行的过程中才会new一个对象放在堆内存里头，
 *  类的每个成员变量（静态属性）在不同的对象中都有不同的值（除了静态变量），而方法只有一份，执行的时候才占内存。
 *  
 *  注意：引用类型占两块内存！！！
	举例：String s;  
	定义了一个引用类型（String是引用类型）变量s
	
	 s = new String("Hello World");
	 使用new语句创建了一个String类型的对象并用s指向它（s相当于遥控器）
	 以后可以通过s完成对其的操作（通过遥控器来操纵这个对象）
	 
	 java里面所有的引用类型全是指针
	 引用：一小块内存指向一大块内存
	 
	
 */

public class Demo01PrintArray {
	
	public static void main(String[] args) {
		
		int[] array = {10, 20, 30, 40, 50};
		
		//首先使用面向过程的思想,每一个步骤细节都要亲自处理
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i ==array.length-1) {
				System.out.println(array[i] + "]");
			}else {
				System.out.print(array[i] + ",");
			}
			
		}
		System.out.println("=====================================================");
		
		
		/**使用面向对象的思想,达到同样的效果
		自己不处理详细的步骤,而是找人帮我做事儿
		在JDK当中已经给我们提供好了一个工具,叫做Arrays（是一个类！！！！！）
		通过这个工具就可以将数组转换成指定格式的字符串
		我自己不做,而是找Arrays帮我把数组转换成指定格式的字符串
		 * 
		 */
		
		String str =Arrays.toString(array);		//不熟这个！！！！
		/**
		 * public class Arrays extends Object
		 * 此类包含用来操作数组（比如排序和搜索）的各种方法。此类还包含一个允许将数组作为列表来查看的静态工厂。
		 * 
		 * public static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

		 */
		
		System.out.println(str);		//等价于System.out.println(Arrays.toString(array));
		
/**
 * toString的用法：
 * 
public String toString()返回该对象的字符串表示。通常，toString 方法会返回一个“以文本方式表示”此对象的字符串。
结果应是一个简明但易于读懂的信息表达式。建议所有子类都重写此方法。 

Object 类的 toString 方法返回一个字符串，该字符串由类名（对象是该类的一个实例）、at 标记符“@”和此对象哈希码的无符号
十六进制表示组成。换句话说，该方法返回一个字符串，它的值等于： 

getClass().getName() + '@' + Integer.toHexString(hashCode())
 
返回：
该对象的字符串表示形式。
*/
	}

}
