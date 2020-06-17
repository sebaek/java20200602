package chap09.lecture.nestedClass;

public class MyClass {
	// 클래스
	static class NestedClassStatic {
		// 필드
		// 생성자
		// 메소드
	}
	
	class NestedClass {
		// 필드
		// 생성자
		// 메소드
	}
	
	void method() {
		class NestedClassLocal {
			// 필드, 생성자, 메소드
		}
		
		NestedClassLocal l1 = new NestedClassLocal();
		
	}
}



























