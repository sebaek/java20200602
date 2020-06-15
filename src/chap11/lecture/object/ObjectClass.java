package chap11.lecture.object;

public class ObjectClass {
	public static void main(String[] args) {
		// Object 클래스: 모든 클래스의 최상위 클래스
		Object o1 = new MyClass();
		Object o2 = new MyClass();
		
		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
		
	}
}
