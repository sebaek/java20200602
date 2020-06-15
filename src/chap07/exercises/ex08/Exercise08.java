package chap07.exercises.ex08;

class A {}
class B extends A {}

class D extends B {}
class E extends B {}

public class Exercise08 {
	public static void main(String[] args) {
//		B b = new B(); // 보기 1번
		B b = (B) new A(); //보기 2번
//		B b = new D(); // 보기 3번
//		B b = new E(); // 보기 4번
		
	}
}









