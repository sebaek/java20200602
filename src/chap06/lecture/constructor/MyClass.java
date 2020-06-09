package chap06.lecture.constructor;

public class MyClass {
	// (인스턴스) 필드
	int number;
	String name;

	// 생성자
	MyClass() {
		// 인스턴스 생성시 해야할 일들;;;;
		System.out.println("할 일 1번");
		number = 30;
		name = "avengers";
	}
	
	MyClass(String n) {
		System.out.println("스트링 파라미터 받는 생성자");
		number = 30;
		name = n;
	}
	
	MyClass(int nu, String n) {
		System.out.println("int, String 파라미터 받는 생성자");
		number = nu;
		name = n;
	}
}


















