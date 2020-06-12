package chap07.lecture.polymorphism;

public class PolyMorphism2 {
	public static void method2(KindaCat k) {
		k.cry();
	}
	
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k2 = new Tiger();
		
		k1.cry();
		k2.cry();
		
		method2(k1);
		method2(k2);
		
//		k1.walk();
		
	}
	
	
}
