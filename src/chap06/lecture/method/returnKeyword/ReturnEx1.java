package chap06.lecture.method.returnKeyword;

public class ReturnEx1 {
	public static void main(String[] args) {
		MyClass c = new MyClass();
		int a = c.method2();
		System.out.println(a);
		
		int b = c.method3(20);
		System.out.println(b);
		int d = c.method3(-20);
		System.out.println(d);
		
	}
}











