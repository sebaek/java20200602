package chap06.lecture.constructor;

public class ThisKeyword {
	public static void main(String[] args) {
		City c1 = new City("seoul", "korea");
		System.out.println(c1.name);
		
		City c2 = new City("ny", "us");
		System.out.println(c2.name);
		
	}
}
