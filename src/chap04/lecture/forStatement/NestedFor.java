package chap04.lecture.forStatement;

public class NestedFor {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++){
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}
}


