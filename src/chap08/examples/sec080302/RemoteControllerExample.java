package chap08.examples.sec080302;

import chap08.examples.sec080205.RemoteControl;

public class RemoteControllerExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			@Override
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
			@Override
			public void setVolume(int volume) {
			}
		};
	}
}






