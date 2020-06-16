package chap08.examples.sec080303;

import chap08.examples.sec080205.RemoteControl;

public class SearchableExample {
	public static void main(String[] args) {
		RemoteControl r = new SmartTelevision();
		r.turnOn();
		r.turnOff();
		r.setVolume(3);
		
		Searchable s = (Searchable) r;
		s.search("다음");
	}
}














