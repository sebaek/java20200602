package chap04.lecture;

import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int random = (int) (Math.random() * 100) + 1;
		int user = 0;
		
//		System.out.println("random: " + random);
		
		while (random != user) {
			System.out.println("숫자를 맞춰보세요>");
			user = Integer.valueOf(scanner.nextLine());
			
			if (user < random) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (user > random) {
				System.out.println("더 작은 수를 입력하세요.");
			}
		}
		System.out.println("축하합니다. 정답입니다.");
	}
}












