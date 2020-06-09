package chap06.lecture.field;

public class FieldEx1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "토르";
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		s1.age = 99;
		s2.age = 30;
		
		System.out.println(s1.age);
		System.out.println(s2.age);
		
	}
}
