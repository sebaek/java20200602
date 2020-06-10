package chap06.lecture.method.parameter;

public class MyClass {
	void myMethod() {
		System.out.println("파라미터없는 마이 메소드");
	}
	
	void myMethod(int a) {
		System.out.println("파라미터 int 마이 메소드");
	}
	
	void myMethod(long a) {
		System.out.println("파라미터 long 마이 메소드");
	}
	
	void myMethod(byte b) {
		System.out.println("파라미터 byte 마이 메소드");
	}
	
	void myMethod(int a, int b) {
		System.out.println("파라미터 int 두개 마이 메소드");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
	}
	
	void myMethod(int... a) {
		System.out.println("파라미터 int 여러개 마이 메소드");
		System.out.println(a.length);
		for (int n : a) {
			System.out.println(n);
		}
	}
	
	void myMethod(int b, String... a) {
		
	}
}
























