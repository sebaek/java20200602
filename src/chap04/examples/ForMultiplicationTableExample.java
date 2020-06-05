package chap04.examples;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 9; m >= 2; m--) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 9; n >= 2; n--) {
				System.out.println(m + " X " + n + " = " + (m*n));
			}
		}
	}
}
