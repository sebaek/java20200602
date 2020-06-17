package chap09.lecture.nestedClass;

public class NestedClass {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass.NestedClassStatic c2 = new MyClass.NestedClassStatic();
		
		MyClass.NestedClass c3 = c1.new NestedClass();
		
		
	}
}
