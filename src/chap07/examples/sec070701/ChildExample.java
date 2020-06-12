package chap07.examples.sec070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
//		child.method2();
//		child.method3();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3();
	}
}
