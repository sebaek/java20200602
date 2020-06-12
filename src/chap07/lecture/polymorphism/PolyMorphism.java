package chap07.lecture.polymorphism;

public class PolyMorphism {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		KindaCat k1;
		k1 = cat1;
		System.out.println(k1 == cat1);
//		cat1 = k1;
		
		Tiger tiger1 = new Tiger();
		KindaCat k2;
		k2 = tiger1;
		System.out.println(k2 == tiger1);
//		tiger1 = k2;

		KindaCat k3 = new Cat();
		KindaCat k4 = new Tiger();
		
	}
}




















