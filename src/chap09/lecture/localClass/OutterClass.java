package chap09.lecture.localClass;

public class OutterClass {
	private int field2;
	
	public void method() {
		class LocalClass {
			private int field;
			private int field2;
			public void method() {
				System.out.println(this.field);
				System.out.println(this.field2);
				System.out.println(OutterClass.this.field2);
			}
		}
	}
	
	
	public void method(final int p) {
		int a = 3;
//		a = 4;
//		p = 3;
		class LocalClass {
			void method() {
				System.out.println(a);
				System.out.println(p);
			}
		}
	}
}







