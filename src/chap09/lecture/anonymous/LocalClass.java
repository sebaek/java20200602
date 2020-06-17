package chap09.lecture.anonymous;

public class LocalClass {
	interface MyInterface{
	}
	
	void method(final int p) {
		final int a = 3;
//		a =4;
//		p = 4;
		MyInterface i = new MyInterface() {
			void method() {
				System.out.println(a);
				System.out.println(p);
			}
		};
	}
}












