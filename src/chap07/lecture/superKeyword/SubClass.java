package chap07.lecture.superKeyword;

public class SubClass extends SuperClass {
	private int field;
	
	public void method1() {
		
	}
	
	public void method2() {
		this.method1();
		System.out.println(this.field);
		
		System.out.println(super.sfield);
		super.sMethod();
	}
	
	
	
	

}






