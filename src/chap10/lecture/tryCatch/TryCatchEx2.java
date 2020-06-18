package chap10.lecture.tryCatch;

public class TryCatchEx2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
			System.out.println("클래스 찾아서 어떤 일을 함....");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
		
		System.out.println("프로그램 종료");
		
	}
}
