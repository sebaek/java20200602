package chap04.lecture.forStatement.sample;

import java.util.Scanner;

public class GuGuDanEx1 {
	public static void main(String[] args) {
		
//		System.out.println("2 X 1  = " + 2);
//		System.out.println("2 X 2  = " + 4);
//		System.out.println("2 X 3  = " + 6);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력단>");
		String dan = scanner.nextLine();
		int danNum = Integer.valueOf(dan);
		
		System.out.println("***************************");
		for (int i = 2; i <= 9; i += 2) {
			System.out.println(danNum + " X " + i + " = " + (danNum * i));
		}
	}
}









