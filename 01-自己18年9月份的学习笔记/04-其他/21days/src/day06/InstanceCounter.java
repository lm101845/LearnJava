package day06;

/*
 * @姓名 李明
 * @日期 2018年11月4日上午10:04:22
 * 
 * 类是用于创建对象的模板，对象能够存储数据和完成任务。
 */
public class InstanceCounter {
	private static int numInstances = 0;
	
	protected static int getCount() {
		return numInstances;
	}

	private static void addInstance() {
		numInstances++;
	}
	
	InstanceCounter(){
		InstanceCounter.addInstance();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Starting with "  + InstanceCounter.getCount() + " objects");
		for (int i = 0; i < 500; ++i)
			new InstanceCounter();
		
		System.out.println("Created " + InstanceCounter.getCount() + " objects");
		
		
	}
}

