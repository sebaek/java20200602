package chap08.lecture.interfaceKeyword;

public interface MyInterface {
	// 필드 (public static final)
	int MAX = 3;
	public static final int MIN = 0;
	
	// 추상 메소드 (public abstract) 
	void method1();
	public abstract void method2();
	
	// 디폴트 메소드 (default)
	// 몸통이 있는 instance 메소드
	default void method3() {
		System.out.println();
	}
	
	default public void method4() {
		System.out.println();
	}
	
	// static 메소드
	static void method5() {
		System.out.println();
	}
	public static void method6() {
		System.out.println();
	}
}












































