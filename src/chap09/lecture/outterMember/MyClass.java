package chap09.lecture.outterMember;

public class MyClass {
	public int field;
	public static int fieldStatic;
	
	class NestedClass {
		public void method() {
			System.out.println(field);
			System.out.println(fieldStatic);
		}
	}
	
	static class NestedClassStatic {
		public void method() {
			System.out.println(fieldStatic);
//			System.out.println(field);
		}
	}
	
	public void method() {
		class LocalClass {
			public void method() {
				System.out.println(field);
				System.out.println(fieldStatic);
			}
		}
	}
}







































