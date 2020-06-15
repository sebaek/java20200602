package chap11.lecture.object.toString;

public class ToStringMethod {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		
		// println(Object o);
		
		System.out.println(c1);
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.toString());
	}
}
