package chap06.lecture.staticMember;

public class YourClass {
	int field1;
	static int field2;
	static int field3 = 100;
	
	static {
		field2 = 99;
	}
	
	YourClass() {
		this.field1 = 3;
	}
	
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







