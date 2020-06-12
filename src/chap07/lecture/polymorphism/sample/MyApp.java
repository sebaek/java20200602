package chap07.lecture.polymorphism.sample;

public class MyApp {
	public static void main(String[] args) {
		Robot r = new Robot();
		r.setFoot(new RoketFoot());
		r.go();
		
	}
}
