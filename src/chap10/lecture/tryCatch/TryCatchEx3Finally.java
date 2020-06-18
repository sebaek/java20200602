package chap10.lecture.tryCatch;

public class TryCatchEx3Finally {
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String");
			System.out.println("클래스 찾음");
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 못 찾음");
		} finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 종료");
	}
}
















