class volcanRobot{
	String status;
	int speed;
	float temporature;
	
	void checkTemperature(){
		if (tempture > 660){
			status = "returning home";
			speed = 5;
		}
	}
	
	void showAttibutes(){
		system.out.println("status:" + status);
		system.out.println("speed:" + speed);
		system.out.println("temporature:" + temporature);
	}
		
}
	
	