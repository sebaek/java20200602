package chap06.lecture.encapsulation;

public class Car {
	private String name;
	private int speed;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accel() {
		speed++;
	}
	
	public void breakAction() {
		speed = 0;
	}
}