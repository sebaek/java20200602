package chap11.lecture.object;

public class MyClass extends Object {
	private int id;
	
	@Override
	public boolean equals(Object obj) {
		MyClass o = (MyClass) obj;
		
		return this.id == o.id;
	}
}
