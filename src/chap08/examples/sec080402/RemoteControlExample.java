package chap08.examples.sec080402;

import chap08.examples.sec080205.RemoteControl;
import chap08.examples.sec080301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television(); 
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		RemoteControl.changeBattery();
	}
}










