package chap06.lecture.staticMember;

public class MyClass {
	// instance 필드
	int field1;
	
	// static 필드 (클래스 필드)
	static int field2;
	
	// instance 메소드
	void method1() {
		
	}
	
	// static 메소드 (클래스 메소드)
	static void method2() {
		System.out.println("클래스 메소드 실행");
		System.out.println(field2);
	}
	
	
}







