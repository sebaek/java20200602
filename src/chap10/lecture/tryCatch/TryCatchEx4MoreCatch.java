package chap10.lecture.tryCatch;

public class TryCatchEx4MoreCatch {
	public static void main(String[] args) {

//		try {
//			;;;
//		} catch (SomeException e) {
//			;;;
//		} catch (OtherException e) {
//			;;;
//		}

		try {
			int a = Integer.parseInt(args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위 넘김");
		} catch (NumberFormatException e) {
			System.out.println("수로 변경 불가");
		} finally {
			System.out.println("무조건 실행");
		}

		System.out.println("프로그램 종료");

	}
}





