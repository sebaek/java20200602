package chap04.examples;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 0;
		for (i = 1; i <= 100; i++) {
			int j = 0;
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + " 합 : " + sum);
	}
}
