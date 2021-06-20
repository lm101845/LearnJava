class volcanApplication{
	public static void main(String[] args){
					
		volcanApplication Tom = new volcanApplication();
		Tom.status = "exploring";
		Tom.speed = 2;
		Tom.temperature = 510;
		
		Tom.showAttributes();
		system.out.println("increasing speed to 3." );
		Tom.speed = 3;
		
		Tom.showAttributes();
		system.out.println("Changing temperature to 670." );
		Tom.temperature = 670;
		
		Tom.showAttributes();
		system.out.println("Checking the temperature." );
		
		Tom.checkTemperature();
		Tom.showAttributes();
		
	}
}