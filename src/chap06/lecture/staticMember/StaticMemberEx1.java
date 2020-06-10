package chap06.lecture.staticMember;

public class StaticMemberEx1 {
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();

		c1.field1 = 3;
		c2.field1 = 4;
		
		c1.field2 = 99;
		c2.field2 = 100;
		MyClass.field2 = 200;

		System.out.println(c1.field1);
		System.out.println(c2.field1);
		
		System.out.println(c1.field2);
		System.out.println(c2.field2);
		
		c1.method2();
		c2.method2();
		MyClass.method2();
	}
}

























