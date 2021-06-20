package stringBuilder;

/**
 * @姓名 李明
 * @日期 2018年11月5日下午9:08:46
 * 
 * 测试StringBuilder的一些常用方法 
 */
public class Test02 {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");		
		sb.delete(3, 5);   //删除索引的时候是包头不包尾
		sb.delete(3, 5).delete(3, 5);
		System.out.println(sb);
		
		sb.reverse();  //反着读取
		System.out.println(sb);
		
		
		
	}

}
