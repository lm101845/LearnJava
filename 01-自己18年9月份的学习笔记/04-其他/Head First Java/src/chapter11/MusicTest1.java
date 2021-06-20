package chapter11;
import javax.sound.midi.*;

public class MusicTest1 {
	
	public void play() {
		try {
			Sequencer sequence = MidiSystem.getSequencer();
			System.out.println("Successfully got a sequence");
		}catch(MidiUnavailableException ex) {
			System.out.println("Bummer");
			
		}
	}  //关闭播放
	
	public static void main(String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();   
	}  //关闭main

}   //关闭类
