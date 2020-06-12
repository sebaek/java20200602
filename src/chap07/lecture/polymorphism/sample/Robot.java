package chap07.lecture.polymorphism.sample;

public class Robot {
	
	private Foot foot;
	
	public void setFoot(Foot foot) {
		this.foot = foot;
	}
	
	public void go() {
		foot.action();
	}
}
