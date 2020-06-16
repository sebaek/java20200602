package chap08.lecture.interfaceKeyword;

public class MyApp {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		Cat cat = new Cat();
		
		KindaDog kd = d1;
		KindaCat kc = cat;
		
//		Pet p1 = kd;
		Pet p2 = d1;
		Pet p3 = cat;
		
		p2.sit();
		p3.sit();
		
//		p2.howl();
//		p3.cry();
		
		SledDog sd = d1;
		sd.pull();
		
		System.out.println(d1 instanceof Malamute);
		System.out.println(d1 instanceof KindaDog);
		System.out.println(d1 instanceof Pet);
		System.out.println(d1 instanceof SledDog);
		
	}
}











