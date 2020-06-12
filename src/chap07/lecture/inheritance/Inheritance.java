package chap07.lecture.inheritance;

public class Inheritance {
	// 상속 : 부모의 멤버를 자식이 갖는다
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		System.out.println(sub.field);
		sub.method();
		
		System.out.println(sub.field2);
		sub.method2();
	}
}
