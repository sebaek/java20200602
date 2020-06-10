package chap06.lecture.instanceMember;

public class MemberEx1 {
	// member : 클래스 구성요소 (필드, 메소드)
	
	public static void main(String[] args) {
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
		c1.method(99);
		c2.method(100);
		
		int i1 = c1.method();
		int i2 = c2.method();
		
		System.out.println(i1);
		System.out.println(i2);
	}
}








