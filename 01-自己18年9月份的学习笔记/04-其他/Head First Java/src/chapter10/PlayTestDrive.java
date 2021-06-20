package chapter10;

class Player{
	static int playCount = 0;
	private String name;
	
	public Player(String n) {
		name = n;
		playCount++;
	}
}

public class PlayTestDrive {
	public static void main(String[] args) {
		
		System.out.println(Player.playCount);
		
		Player one = new Player("Tiger Woods");
		System.out.println(Player.playCount);
	}

}
