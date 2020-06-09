package chap06.lecture.constructor;

public class ConstructorEx2 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass("thor");
		System.out.println(o1.name);
		
		MyClass o2 = new MyClass("black");
		System.out.println(o2.name);
		
		MyClass o3 = new MyClass(50, "red");
		System.out.println(o3.number);
		System.out.println(o3.name);
	}
}
