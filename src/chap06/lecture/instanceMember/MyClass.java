package chap06.lecture.instanceMember;

public class MyClass {
	int field1;
	
	void method(int field) {
		this.field1 = field;
		this.print("입력값:" + field);
	}
	
	int method() {
		return this.field1;
	}
	
	void print(String a) {
		System.out.println(a);
	}
}







