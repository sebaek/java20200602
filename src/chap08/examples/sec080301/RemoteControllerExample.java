package chap08.examples.sec080301;

import chap08.examples.sec080205.RemoteControl;

public class RemoteControllerExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.setVolume(3);
	}
}
