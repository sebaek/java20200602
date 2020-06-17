package chap09.lecture.nestedInterface;

public class YourClass implements MyClass.MyInterface {
	@Override
	public void method() {
		System.out.println("메소드 구현.....");
	}
}
