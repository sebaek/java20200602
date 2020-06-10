package chap06.lecture.method.returnKeyword;

public class MyClass {
	// return : 1. 메소드 종료, 2. 키워드 옆의 값을 return
//	int method5() {
//		long l = 5;
//		return l;
//	}
	
	int method4() {
		byte k = 3;
		return k;
	}
	
	int method3(int a) {
		System.out.println("메소드3 실행");
		
		if (a > 10) {
			return a * 2;
		} else {
			return a;
		}
	}
	
	
	int method2() {
		System.out.println("메소드2 실행");
		
		return 3;
	}
	
	
	void method1(int a) {
		System.out.println("메소드1 실행");
		
		if (a > 0) {
			return;
		}
		
		System.out.println("리턴다음 실행");
		
	}
}













