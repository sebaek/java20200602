package chap08.lecture.interfaceKeyword.sample;

public class Cat extends KindaCat implements Pet {
	@Override
	public void cry() {
		System.out.println("야옹~");
	}
	
	@Override
	public void sit() {
		System.out.println("무시합니다.");
	}
}
