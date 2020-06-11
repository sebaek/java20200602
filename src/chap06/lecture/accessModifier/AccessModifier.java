package chap06.lecture.accessModifier;

import chap06.lecture.accessModifier.a.MyClass;

public class AccessModifier {
	// access modifier (접근 지정자, 제한자)
	// private
	// 필드, 생성자, 메소드
	// default(package private)
	// 필드, 생성자, 메소드, 클래스
	// protected
	// 필드, 생성자, 메소드
	// public
	// 필드, 생성자, 메소드, 클래스
	
	public static void main(String[] args) {
		MyClass c = new MyClass();
		MyClass c1 = new MyClass(1);
//		MyClass c2 = new MyClass("");
//		MyClass c3 = new MyClass(3.1);
	}
}
























