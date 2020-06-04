package chap04.lecture.switchStatement;

public class SwitchStatement {
	public static void main(String[] args) {
		// switch case
		// 값에 의해서 실행흐름을 변경함
		// 값의 type: byte, char, short, int, String

		int l = 0;
		switch (l) {
		case 1:
			System.out.println("실행됨1");
			break;
		case 2:
			System.out.println("실행됨2");
			break;
		case 3:
			System.out.println("실행됨3");
			break;
		default:
			System.out.println("실행됨 default");
		}

	}
}




