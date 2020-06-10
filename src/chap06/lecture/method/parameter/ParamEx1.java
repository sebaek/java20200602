package chap06.lecture.method.parameter;

public class ParamEx1 {
	public static void main(String[] args) {
		MyClass c = new MyClass();
		c.myMethod();
		c.myMethod(3);
		c.myMethod(3L);
		
		c.myMethod(5, 6);
		c.myMethod(5, 6, 7, 8);
	}
}
