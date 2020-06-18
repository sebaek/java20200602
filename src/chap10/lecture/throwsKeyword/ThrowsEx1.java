package chap10.lecture.throwsKeyword;

import java.rmi.activation.ActivationException;

public class ThrowsEx1 {
	public static void main(String[] args) {
		System.out.println("메인 메소드 시작");
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 메소드 종료");
	}
	
	private static void method1() throws ClassNotFoundException {
		System.out.println("메소드1 시작");
		method2();
		System.out.println("메소드1 종료");
	}
	
	private static void method2() throws ClassNotFoundException {
		System.out.println("메소드2 시작");
		method3();
		System.out.println("메소드2 종료");
	}
	
	private static void method3() throws Exception {
		System.out.println("메소드3 시작");
		
		Class.forName("java.lang.String2");
		
		System.out.println("메소드3 종료");
	}
}












