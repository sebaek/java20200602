package chap08.lecture.interfaceKeyword;

public class Malamute extends KindaDog implements Pet, SledDog {
	@Override
	public void howl() {
		System.out.println("아울~~~~~~~");
	}
	
	@Override
	public void sit() {
		System.out.println("앉습니다.");
	}
	
	@Override
	public void pull() {
		System.out.println("썰매를 끕니다.");
	}
}








