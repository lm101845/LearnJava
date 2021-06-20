package chapter03;

public class Dog {
	
	public static void main(String[] args) {
	
		 Dog d = new Dog();
		 d.bark(3); 
	}

	 void bark(int numOfBarks) {
		 
			while(numOfBarks > 0) {
				
				System.out.println("ruff");
				numOfBarks = numOfBarks - 1;
			}
		}
		
}
