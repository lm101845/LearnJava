package day01;

/*
 * ���˻������������⣬���������ͻ��������ࡣ�����������Ϳ�������ʱ����ָ������������������һ������
 */

class volcanApplication{
		String status;
		 int speed;
		 int temperature;
		 void showAttibutes(){
				System.out.println("status:" + status);
				System.out.println("speed:" + speed);
				System.out.println("temperature:" + temperature);
			}
			
		 void checkTemperature(){
				if (temperature > 660){
					status = "returning home";
					speed  = 5;
					}
				}

	public static void main(String[] args){
					
		volcanApplication dante = new volcanApplication();
		dante.status = "exploring";
		dante.speed = 2;
		dante.temperature = 510;
		
		dante.showAttibutes();
		System.out.println("increasing speed to 3." );
		dante.speed = 3;
		
		dante.showAttibutes();
		System.out.println("Changing temperature to 670." );
		dante.temperature = 670;
		
		dante.showAttibutes();
		System.out.println("Checking the temperature." );
		
		dante.checkTemperature();
		dante.showAttibutes();
		
	}
}