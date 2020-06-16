package chap08.lecture.anonymous;

public class AnonymousClass {
	public static void main(String[] args) {
		MyInterface i1 = new MyClass();
		i1.method1();
		
		MyInterface i2 = new MyInterface() {
			@Override
			public void method1() {
				System.out.println("무명클래스의 메소드");
			}
			
			@Override
			public void method2() {
				
			}
		};
		i2.method1();
		
		
	}
}




