package chap06.lecture.staticMember;

public class YourClass {
	int field1;
	static int field2;
	
	void method1() {
		System.out.println(this.field1);
		System.out.println(field2);
		method2();
	}
	
	static void method2() {
		System.out.println(field2);
//		method1();
//		System.out.println(field1);
	}
}







