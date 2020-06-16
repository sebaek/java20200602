package chap08.exercises;

public class SoudableExample {
	private static void printSound(Soudable soundable) {
		soundable.sound();
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
