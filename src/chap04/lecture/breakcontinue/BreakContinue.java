package chap04.lecture.breakcontinue;

public class BreakContinue {
	public static void main(String[] args) {
		// break;
		// 가장 가까운 loop 빠져 나감
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("실행문;");
		}
		

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					break;
				}
				System.out.println(i + "," + j);
			}
		}
		
		
		
		// continue;
		// 가장 가까운 loop의 조건으로 실행흐름 이동
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}
}










