package chap06.lecture.constructor;

public class ConstructorEx1 {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		System.out.println(m.number);
		System.out.println(m.name);
		
		MyClass m2 = new MyClass();
		System.out.println(m2.number);
		System.out.println(m2.name);
		
		m.name = "thor";
		
		System.out.println(m.name);
		System.out.println(m2.name);
	}
}









