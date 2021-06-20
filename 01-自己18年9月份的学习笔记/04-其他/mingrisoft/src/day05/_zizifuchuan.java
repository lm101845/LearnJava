package day05;

/**
 * 作者：李明
 * 日期： 2018年12月25日 下午6:24:33
 * 看的遍数：
 */
public class _zizifuchuan {
	public static void main(String[] args) {
		String str = "We are the world";
		int index = str.indexOf("e");  		//返回e第一次出现的位置
		int index01 = str.indexOf("e",3);   //返回e在索引3之后出现的位置
		System.out.println(index);   //1
		System.out.println(index01);   //5
		
		//获取倒数第一次出现的索引
		String str01 = "Let it go! Let it go!";
		int lastIndex = str01.lastIndexOf("t");
		System.out.println(lastIndex);   //16
		
		int lastIndex01 = str01.lastIndexOf("t",14);    //从14这个索引往前查
		System.out.println(lastIndex01);   //13
		
		
	}

}
