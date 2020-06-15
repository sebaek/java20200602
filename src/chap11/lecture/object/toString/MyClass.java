package chap11.lecture.object.toString;

public class MyClass {
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return this.id + ", " + this.name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
