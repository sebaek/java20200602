package chap07.lecture.casting;

public class Casting {
	public static void main(String[] args) {
		SuperClass c = new SubClass();
		
		SubClass b = (SubClass) c;
		b.method();
		
		
		
	}
}
