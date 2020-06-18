package chap10.lecture.tryCatch;

public class TryCatchEx1 {
	public static void main(String[] args) {
		
		try {
			String s = args[0];
			System.out.println("예외 발생안함");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이가 바르지 않습니다.");
			System.out.println("익셉션 발생함.");
		}
		
		System.out.println("프로그램 종료");
		
	}
}




