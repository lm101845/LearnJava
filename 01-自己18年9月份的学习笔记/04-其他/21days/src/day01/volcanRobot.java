package day01;

class volcanRobot{
	String status;
	int speed;
	float temperature;
	
	void checkTemperature(){
		if (temperature > 660){
			status = "returning home";
			speed = 5;
		}
	}
	
	void showAttibutes(){
		System.out.println("status:" + status);
		System.out.println("speed:" + speed);
		System.out.println("temperature:" + temperature);
	}
		
}
 